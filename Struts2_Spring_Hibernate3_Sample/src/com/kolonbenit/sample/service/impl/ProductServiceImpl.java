/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.service.impl;

import com.kolonbenit.sample.dao.ProductDao;
import com.kolonbenit.sample.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author 장인기
 */
@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductDao productDao;

    public List findAll() throws Exception{
        return productDao.findAll();
    }

    public List find(int page, int range) throws Exception{
         throw new UnsupportedOperationException("Not supported yet.");
    }
    
    @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public Object save(Object bean) throws Exception{
        return productDao.save(bean);
    }
    @Transactional(readOnly=false, propagation=Propagation.REQUIRED)
    public Object update(Object bean) throws Exception{
         return productDao.save(bean);
    }

    public int delete(Object bean) throws Exception{
        return productDao.delete(bean);
    }

    public List findAll(String queryStr) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
