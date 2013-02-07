/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.kolonbenit.sample.dao;

import java.util.List;

/**
 *
 * @author 장인기
 */
public interface CommonDao{
     public List findAll();
     public List findAll(String queryStr);
     public List find(int page, int range);
     public Long save(Object bean);
     public Object update(Object bean);
     public int delete();
}
