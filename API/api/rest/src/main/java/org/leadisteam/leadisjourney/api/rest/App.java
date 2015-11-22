package org.leadisteam.leadisjourney.api.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Point de démarage de l'application
@SpringBootApplication
public class App 
{
	
    public static void main( String[] args )
    {
    	 SpringApplication.run(App.class, args);
        System.out.println( "Server running..." );
    }
}
