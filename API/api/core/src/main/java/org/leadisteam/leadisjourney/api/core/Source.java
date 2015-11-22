package org.leadisteam.leadisjourney.api.core;

public class Source {

	private String id;
	private String type;
	private String content;
	// CONTENT ?
	
	Source(String id, String type, String content){
		this.setId(id);
		this.setType(type);
		this.setContent(content);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
