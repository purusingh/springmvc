package com.test.web.models;
// Generated Oct 14, 2019 8:19:17 PM by Hibernate Tools 5.2.3.Final

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "hbtest")
public class User extends Base implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2034530652973532292L;
	// private Integer id;
	private String firstName;
	private String lastName;
	private String email;

	private List<Role> roles = new ArrayList<Role>();

	public User() {
	}

	public User(int id, String firstName, String lastName, String email, List<Role> roles) {
		super.setId(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.roles = roles;

	}

	@Column(name = "firstName", length = 30)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "lastName", length = 30)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", length = 60)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "roleUser", joinColumns = { @JoinColumn(name = "userId") }, inverseJoinColumns = {
			@JoinColumn(name = "roleId") })
	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
