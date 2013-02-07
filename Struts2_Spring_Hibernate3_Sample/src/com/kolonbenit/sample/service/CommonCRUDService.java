/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

/**
 *
 * @author 장인기
 */
public interface CommonCRUDService {
     public List findAll() throws Exception;
     public List findAll(String queryStr) throws Exception;
     public List find(int page, int range) throws Exception;
     public Object save(Object bean) throws Exception;
     public Object update(Object bean) throws Exception;
     public int delete(Object bean) throws Exception;
}
