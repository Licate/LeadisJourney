package org.leadisteam.leadisjourney.api.rest.models;

public class UpdateUserInformationsModel {

	/*
	 *  Email  et  Pseudo -> Account != UserInformations
	 */
	private String name;
	private String firstName;
	private String avatar;

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
}
