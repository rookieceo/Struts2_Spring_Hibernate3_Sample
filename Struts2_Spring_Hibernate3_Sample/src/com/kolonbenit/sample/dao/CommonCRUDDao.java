/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 *
 * @author 장인기
 */
public interface CommonCRUDDao{
     public List findAll() throws DataAccessException;
     public List findAll(String queryStr) throws DataAccessException;
     public List find(int page, int range) throws DataAccessException;
     public Object save(Object bean) throws DataAccessException;
     public Object update(Object bean) throws DataAccessException;
     public int delete(Object bean) throws DataAccessException;
}
