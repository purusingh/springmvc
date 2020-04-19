package com.test.web.services;

import com.test.web.models.containers.MyRole;

public class MyRoleService {
	public void save(MyRole myRole) {
		System.out.println(myRole.getId());
		System.out.println(myRole.getName());
	}

}
