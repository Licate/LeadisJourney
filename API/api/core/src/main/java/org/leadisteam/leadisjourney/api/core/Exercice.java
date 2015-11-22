package org.leadisteam.leadisjourney.api.core;

public class Exercice {

	private String id;
	private int position;
	private String title;
	private Source source;
	private Tutorial tutorial; // [0:*]
	private Source help;
	
	Exercice(String id, int position, String title, Source source, Tutorial tutorial, Source help){
		this.setHelp(help);
		this.setId(id);
		this.setPosition(position);
		this.setTitle(title);
		this.setTutorial(tutorial);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Source getHelp() {
		return help;
	}

	public void setHelp(Source help) {
		this.help = help;
	}

	public Tutorial getTutorial() {
		return tutorial;
	}

	public void setTutorial(Tutorial tutorial) {
		this.tutorial = tutorial;
	}

	public Source getSource() {
		return source;
	}

	public void setSource(Source source) {
		this.source = source;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
}
