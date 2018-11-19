package com.hibdemo.SoccerJPADemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//@Column(name = "FirstName")
	private String firstname;
	//@Column(name = "LastName")
	private String lastname;
	//@Column(name = "Password")
	private String password;
	//@Column(name = "UserName")
	private String username;

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String firstName, String lastName, String password, String userName) {
		super();
		this.id = id;
		this.firstname = firstName;
		this.lastname = lastName;
		this.password = password;
		this.username = userName;
	}

	public User(String firstName, String lastName, String password, String userName) {
		super();
		this.firstname = firstName;
		this.lastname = lastName;
		this.password = password;
		this.username = userName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstName) {
		this.firstname = firstName;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastName) {
		this.lastname = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstname + ", lastName=" + lastname + ", password=" + password
				+ ", userName=" + username + "]";
	}

}
