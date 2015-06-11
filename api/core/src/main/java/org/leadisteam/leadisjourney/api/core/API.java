package org.leadisteam.leadisjourney.api.core;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

public class API {
	
	public CompileResponse send(CompileRequest obj) {
		CompileResponse compileResponse = null;
		HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead 
		Gson gson = new Gson();
        String json = gson.toJson(obj);
	    try {
	        HttpPost request = new HttpPost("http://localhost:8080/compile");
	        StringEntity params =new StringEntity(json);
	        request.addHeader("content-type", "application/json");
	        request.setEntity(params);
	        HttpResponse response = httpClient.execute(request);
	        HttpEntity e = response.getEntity();
	        String responseBody = EntityUtils.toString(e);
	        compileResponse = this.convert(responseBody);
	        // handle response here...
	    }catch (Exception ex) {
	        System.err.println(ex);
	    }
	    return compileResponse;
	}
	
	private CompileResponse convert(String jsonString){
		Gson gson = new Gson();
		
		return gson.fromJson(jsonString, CompileResponse.class);
	}
}
