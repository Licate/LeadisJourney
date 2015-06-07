import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;


public class Test {

	public static class CompileRequest {
		public int user_id;
		public String[] File;
		
		public CompileRequest(int id, String[] files)
		{
			File = new String[files.length];
			int i = 0;
			user_id = id;
			
			while (i != files.length)
			{
				File[i] = files[i];
				i++;
			}
		}
	}

	public void test(CompileRequest Object) throws IOException
	{
		Gson gson = new Gson();	/* Objet conversion objet java to Json*/
        String json = gson.toJson(Object); /* Conversion objet Java en Json */	
        System.out.println(json);
 
        String url = "http://postcatcher.in/catchers/55742118c63ba5030000f6ee"; /* Url requete POST*/
        URL obj = new URL(url); /* Conversion string to URL*/
        HttpURLConnection con = (HttpURLConnection)obj.openConnection(); /* Ouvre la connexion */
         
        con.setRequestMethod("POST"); /* Initialise une requête POST */
        con.setRequestProperty("json", json); /* Header définition donné envoyé */
         
        con.setDoOutput(true); /* Permet l’envoie de donnée du POST */
        DataOutputStream wr = new DataOutputStream(con.getOutputStream()); /* Ouverture d’un stream + écriture sur ce stream */
        wr.flush(); /* Force l’écriture sur le stream */
        wr.close(); /* Ferme le stream*/
         
        int responseCode = con.getResponseCode(); /* Récupération retour serveur */
        System.out.println(responseCode);/* Affichage réponse */
	}

        public static void main(String[] args) throws IOException {
        	String[] test =  new String[]{"test code 1","test code 2","test code 3" };
    		CompileRequest obj = new CompileRequest(1, test);
    		
    		Test to = new Test();
    		to.test(obj);
    	}
	}

