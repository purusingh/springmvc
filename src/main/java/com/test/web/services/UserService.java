package com.test.web.services;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.web.daos.UserDao;

import com.test.web.models.User;

@Service
@Transactional
public class UserService extends AbstractService<Integer,User,UserDao> {
	
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
	protected void setT(UserDao t) {
		super.t= t;
	}
}
