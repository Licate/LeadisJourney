package org.leadisteam.leadisjourney.api.core;

import java.util.Date;

public class UserExperience {

	private String id;
	private User creator;
	private Date creationDate;
	private String code;
	private String etat; // etat ?
	//private ExperienceResult result;
	//ExperienceResult ? UserExperienceTreatement ?
	
	UserExperience(String id, User creator, Date creationDate, String code, String etat){
		this.setId(id);
		this.setCreator(creator);
		this.setCreationDate(creationDate);
		this.setCode(code);
		this.setEtat(etat);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}
}
