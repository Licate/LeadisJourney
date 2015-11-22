package org.leadisteam.leadisjourney.api.core;


public class Group {

private String id;
private String name;
private User admin;
	
Group(String id, String name, User admin){
	this.setId(id);
	this.setName(name);
	this.setAdmin(admin);
}

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public User getAdmin() {
	return admin;
}

public void setAdmin(User admin) {
	this.admin = admin;
}
	
}
