package org.leadisteam.leadisjourney.api.core;

import java.util.UUID;

public class CompileRequest {
	private UUID userId;
	private String[] files;
	
	public CompileRequest(UUID id, String[] files){
		this.files = new String[files.length];
		int i = 0;
		userId = id;
		
		while (i != files.length){
			this.files[i] = files[i];
			i++;
		}
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String[] getFiles() {
		return this.files;
	}

	public void setFiles(String[] files) {
		this.files = files;
	}
}
