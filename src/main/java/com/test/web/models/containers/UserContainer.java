package com.test.web.models.containers;

import java.util.List;

import com.test.web.models.User;

public class UserContainer {
	private User user;
	private List<Integer> roles;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Integer> getRoles() {
		return roles;
	}
	public void setRoles(List<Integer> roles) {
		this.roles = roles;
	}

}
