package com.test.web.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.test.web.models.Role;

@Repository
public class RoleDao extends AbstractDao<Integer, Role>{
	
	public List<Role> findRoles(String srch) {
		Criteria crietria = createEntityCriteria();
		//crietria.add()
		return null;
	}

}