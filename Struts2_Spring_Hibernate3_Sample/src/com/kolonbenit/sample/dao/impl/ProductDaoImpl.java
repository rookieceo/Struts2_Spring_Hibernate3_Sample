/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.dao.impl;

import com.kolonbenit.sample.dao.*;
import com.kolonbenit.sample.model.Product;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 장인기
 */
@Repository("productDao")
public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{

	@Autowired
	public ProductDaoImpl(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

    public List findAll(String queryStr) throws DataAccessException{
        return (List<Product>)getHibernateTemplate().loadAll(Product.class);
    }

    public List find(int page, int range) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object save(Object bean) throws DataAccessException{
       return (Object) getHibernateTemplate().save(bean);
    }

    public Object update(Object bean) throws DataAccessException{
        getHibernateTemplate().saveOrUpdate(bean);
        return bean;
    }

    public int delete(Object bean) throws DataAccessException{
        getHibernateTemplate().delete(bean);
        return 1;
    }

    public List findAll() throws DataAccessException{
        return (List<Product>)getHibernateTemplate().loadAll(Product.class);
    }


}
