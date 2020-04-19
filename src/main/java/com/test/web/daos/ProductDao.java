package com.test.web.daos;


import java.util.List;

import org.bouncycastle.asn1.isismtt.x509.Restriction;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.test.web.models.Product;


@Repository
public class ProductDao extends AbstractDao<Integer, Product>{

	@SuppressWarnings("unchecked")
	public List<Product> searchProducts(String srch){
		Criteria crietria =  createEntityCriteria();
		return crietria.add(Restrictions.like("name", "%" + srch + "%")).list();
	}

}
