package org.leadisteam.leadisjourney.api.core;

public class CompileRequest {
	public int user_id;
	public String[] File;
	
	public CompileRequest(int id, String[] files){
		File = new String[files.length];
		int i = 0;
		user_id = id;
		
		while (i != files.length){
			File[i] = files[i];
			i++;
		}
	}
}
