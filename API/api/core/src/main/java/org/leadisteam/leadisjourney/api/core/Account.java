package org.leadisteam.leadisjourney.api.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Account")
public class Account {

	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private Group group;
	private User user;
	private Boolean isAdmin;
	private String pseudo;
	private String password;
	//add ExerciceValidated:Exercice[0:*]
	
	Account(User user, Group group, int id, Boolean isAdmin, String password, String pseudo){
		this.setUser(user);
		this.setGroup(group);
		this.setId(id);
		this.setIsAdmin(isAdmin);
		this.setPassword(password);
		this.setPseudo(pseudo);
	}
	
	Account(User user, Group group){
		this.setUser(user);
		this.setGroup(group);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Boolean getIsAdmin() {
		return isAdmin;
	}

	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
