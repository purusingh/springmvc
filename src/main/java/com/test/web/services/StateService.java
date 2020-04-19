package com.test.web.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.web.daos.StateDao;

import com.test.web.models.State;

@Service
public class StateService extends AbstractService<Integer,State,StateDao> {
	
	/*@Autowired
	private UserDao t;
    
   
    @Transactional 
    public User getByKey(Integer key) {
        return t.getByKey(key);
    }
    
    @Transactional 
    public List<User> getAll() {
        return t.getAll();
    }

    @Transactional 
    public void Save(User user) {
        t.saveOrUpdate(user);
    }
    
    @Transactional
    public void delete(int id) {
    	t.delete(new User(id," "," "," ", null));
    }
    */
    @Autowired
	protected void setT(StateDao t) {
		super.t= t;
	}
}
