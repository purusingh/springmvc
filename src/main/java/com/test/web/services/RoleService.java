package com.test.web.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.web.daos.RoleDao;
import com.test.web.models.Role;

@Service
public class RoleService extends AbstractService<Integer,Role,RoleDao> {
/*	@Autowired
	private RoleDao t;
    
   
    @Transactional 
    public Role getByKey(Integer key) {
        return t.getByKey(key);
    }
    
    @Transactional 
    public List<Role> getAll() {
        return t.getAll();
    }
    
    @Transactional 
    public void Save(Role role) {
        t.saveOrUpdate(role);
    }
    
    @Transactional
    public void delete(int id) {
    	t.delete(new Role(id));
    }
    */
	
	@Autowired
	@Override
	protected void setT(RoleDao t) {
		super.t= t;
	}
}
