package com.test.web.services;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.test.web.daos.ProductDao;

import com.test.web.models.Product;

@Service
@Transactional
public class ProductService extends AbstractService<Integer,Product,ProductDao> {
	
	public List<Product> searchProducts(String srch){
		return super.t.searchProducts(srch);
	}
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
	protected void setT(ProductDao t) {
		super.t= t;
	}
}
