from BaseHTTPServer import BaseHTTPRequestHandler, HTTPServer
from SocketServer import ThreadingMixIn
import threading
import argparse
import re
import cgi
import json
import subprocess
import os


def directoryUser(user):
    if (os.path.exists(str("Folder_User_" + str(user)))):
        event = subprocess.Popen(str(workDirectory + "/rm *"),
                                 shell = True, stdin = subprocess.PIPE, stdout = f, stderr = f)
        output = event.communicate() 
        return
    else:
        os.makedirs(str("Folder_User_" + str(user)))
    return
    
def createFiles(user, fileList):
    i = 0
    while (i < len(fileList)):
        file_Object = open(str("Folder_User_" + str(user) + "/file_" + str(i) + ".cpp"), "w")
        file_Object.write(str(fileList[i]));
        file_Object.close()
        i += 1
        
def compileFiles(user):
    workDirectory = str("Folder_User_" + str(user))
    f = open(str(workDirectory + "/log.txt"), 'w')
    event = subprocess.Popen(str("g++ " + workDirectory + "/*.cpp -o " + workDirectory + "/bin"),
                             shell = True, stdin = subprocess.PIPE, stdout = f, stderr = f)
    output = event.communicate()

def doEverything(user, fileList):
    directoryUser(user)
    createFiles(user, fileList)
    compileFiles(user)
        
class HTTPRequestHandler(BaseHTTPRequestHandler):

    def do_POST(self):
        if None != re.search('/compile/*', self.path):
            ctype, pdict = cgi.parse_header(self.headers.getheader('content-type'))
            print "ctype = %s", ctype
            if ctype == 'application/json':
                length = int(self.headers.getheader('content-length'))
                data = json.loads(self.rfile.read(length))
                doEverything(data["userId"], data["files"])
            else:
                data = {}
                self.send_response(200)
                self.end_headers()
        else:
            self.send_response(403)
            self.send_header('Content-Type', 'application/json')
            self.end_headers()

        return

    def do_Get(self):
        if None != re.search('api/v1/getrecord/*', self.path):
            recordID = self.path.split('/')[-1]

            if LocalData.records.has_key(recordID):
                self.send_response(200)
                self.send_header('Content-Type', 'application/json')
                self.end_headers()
                self.wfile.write(LocalData.records[recordID])
            else:
                self.send_response(400, 'Bad Request: record does not exist')
                self.send_header('Content-Type', 'application/json')
                self.end_Headers()
        else:
            self.send_response(403)
            self.send_header('Content-Type', 'application/json')
            self.end_headers()
            
        return

class ThreadedHTTPServer(ThreadingMixIn, HTTPServer):
    allow_reuse_address = True

    def shutdown(self):
        self.socket.close()
        HTTPServer.shutdown(self)

class SimpleHttpServer():

    def __init__(self, ip, port):
        self.server = ThreadedHTTPServer((ip, port), HTTPRequestHandler)

    def start(self):
        self.server_thread = threading.Thread(target = self.server.serve_forever)
        self.server_thread.daemon = True
        self.server_thread.start()

    def waitForThread(self):
        self.server_thread.join()

    def addRecord(self, recordID, jsonEncodedRecord):
        LocalData.records[recordID] = jsonEncodedRecord

    def stop(self):
        self.server.shutdown()
        self.waitForThread()

        
if __name__ == '__main__':
    parser = argparse.ArgumentParser(description = 'HTTP Server')
    parser.add_argument('port', type = int, help = 'Listening port for HTTP Server')
    parser.add_argument('ip', help = 'HTTP Server IP')
    args = parser.parse_args()

    server = SimpleHttpServer(args.ip, args.port)
    print 'HTTP Server Running...........'
    server.start()
    server.waitForThread()
    server.stop()
