package org.leadisteam.leadisjourney.api.core;

public class User {

private String id;
private String name;
private String firstName;
private int age;

User(String id, String name, String firstName, int age){
	this.setId(id);
	this.setName(name);
	this.setFirstName(firstName);
	this.setAge(age);
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

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

}
