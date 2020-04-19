package com.test.web.services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.web.daos.CountryDao;
import com.test.web.models.Country;

@Service
public class CountryService extends AbstractService<Integer,Country,CountryDao> {
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
	protected void setT(CountryDao t) {
		super.t= t;
	}
}
