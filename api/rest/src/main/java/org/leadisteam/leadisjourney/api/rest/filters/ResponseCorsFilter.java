package org.leadisteam.leadisjourney.api.rest.filters;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
 
public class ResponseCorsFilter implements ContainerResponseFilter {
 

	public void filter(ContainerRequestContext req,
			ContainerResponseContext contResp) throws IOException {
		// add CORS headers
		MultivaluedMap<String, Object> headers = contResp.getHeaders();
		// allow all origins
		headers.add("Access-Control-Allow-Origin", "*");
		// allow all methods
		headers.add("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
		// allow all requested headers
		String requestHeaders = req.getHeaderString("Access-Control-Request-Headers");
		if (requestHeaders != null) {
			headers.add("Access-Control-Allow-Headers", requestHeaders);
		}
		
	}
 
}