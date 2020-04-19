package com.test.web.daos;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.test.web.models.Base;


public abstract class AbstractDao<PK extends Serializable, T extends Base> {
    
    private final Class<T> persistentClass;
     
    @SuppressWarnings("unchecked")
    public AbstractDao(){
        this.persistentClass =(Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[1];
    }
     
    @Autowired
    private SessionFactory sessionFactory;
 
    protected Session getSession(){
        return sessionFactory.getCurrentSession();
    }
 
    @SuppressWarnings("unchecked")
    public T getByKey(PK key) {
        return (T) getSession().get(persistentClass, key);
    }
 
    @Transactional
    @SuppressWarnings("unchecked")
    public List<T> getAll() {
            Criteria criteria = createEntityCriteria();
            return (List<T>) criteria.list();

    }
    
    public void persist(T entity) {
        getSession().persist(entity);
        
    }
 
    public void delete(T entity) {
        getSession().delete(entity);
    }
     
    protected Criteria createEntityCriteria(){
        return getSession().createCriteria(persistentClass);
    }
    
    public void saveOrUpdate(T entity) {
        getSession().saveOrUpdate(entity);
    }
    
    public void closeSession() {
        getSession().close();
    }
 
}