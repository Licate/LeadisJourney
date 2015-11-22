package org.leadisteam.leadisjourney.api.core;

public class Tutorial {

	private String id;
	private String title;
	private Source source;
	
	Tutorial(String id, String title, Source source){
		this.setId(id);
		this.setTitle(title);
		this.setSource(source);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}
}
