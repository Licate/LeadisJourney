package org.leadisteam.leadisjourney.api.rest;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.leadisteam.leadisjourney.api.rest.filters.ResponseCorsFilter;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        try {
        	Server server = new Server(8080);
        	ServletContextHandler contextHandler = new ServletContextHandler(server, "/");
        	configJersey(contextHandler);
        	server.start();
        	server.join();
        }
        catch (Exception e) {
        	
        }
    }

	private static void configJersey(ServletContextHandler contextHandler) {
		ServletContainer container = new ServletContainer(new ResourceConfig().packages("org.leadisteam.leadisjourney.api.rest.resources").register(JacksonFeature.class).register(ResponseCorsFilter.class));
		ServletHolder holder = new ServletHolder(container);
		contextHandler.addServlet(holder, "/*");

	}
}
