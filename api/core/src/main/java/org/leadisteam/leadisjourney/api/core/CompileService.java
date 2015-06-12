package org.leadisteam.leadisjourney.api.core;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import java.util.UUID;

public class CompileService {
	private CompileRequest compileRequest;

	public CompileService(UUID userId, String userCode) {
        String[] files = new String[1];
        files[0] = userCode;
        this.compileRequest = new CompileRequest(userId, files);
	}

	public CompileResponse compile() {
		CompileResponse compileResponse = null;
		HttpClient httpClient = HttpClientBuilder.create().build(); //Use this instead 
		Gson gson = new Gson();
        String json = gson.toJson(this.compileRequest);
		System.out.println(json);
	    try {
	        HttpPost request = new HttpPost("http://127.0.0.1:8080/compile");
	        StringEntity params =new StringEntity(json);
	        request.addHeader("content-type", "application/json");
	        request.setEntity(params);
	        HttpResponse response = httpClient.execute(request);
	        HttpEntity e = response.getEntity();
	        String responseBody = EntityUtils.toString(e);
	        compileResponse = this.convert(responseBody);
	        // handle response here...
	    }catch (Exception ex) {
			System.err.println("Fail to request compiler service :");
	        System.err.println(ex.toString());
	    }
	    return compileResponse;
	}
	
	private CompileResponse convert(String jsonString){
		Gson gson = new Gson();
		
		return gson.fromJson(jsonString, CompileResponse.class);
	}
}
