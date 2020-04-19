package com.test.web.services;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.test.web.daos.AbstractDao;
import com.test.web.models.Base;

public abstract class AbstractService<PK extends Serializable, E extends Base, T extends AbstractDao<PK, E>> {

	protected T t;

	@SuppressWarnings("unchecked")
	protected E getInstanceOfE() {
		ParameterizedType superClass = (ParameterizedType) getClass().getGenericSuperclass();
		Class<E> type = (Class<E>) superClass.getActualTypeArguments()[1];
		try {
			return type.newInstance();
		} catch (Exception e) {
			// Oops, no default constructor
			throw new RuntimeException(e);
		}
	}

	protected abstract void setT(T t);

	@Transactional
	public E getByKey(PK key) {
		return t.getByKey(key);
	}

	@Transactional
	public List<E> getAll() {
		return t.getAll();
	}

	@Transactional
	public void add(E e) {
		t.persist(e);
	}

	@Transactional
	public void Save(E role) {
		t.saveOrUpdate(role);
	}

	@Transactional
	public void delete(int id) {
		E e = getInstanceOfE();
		e.setId(id);
		t.delete(e);
	}

}
