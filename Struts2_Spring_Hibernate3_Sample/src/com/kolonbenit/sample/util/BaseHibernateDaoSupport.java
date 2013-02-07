///*
// * To change this template, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.amplusc.webout.util;
//
//import java.util.List;
//
//import org.hibernate.HibernateException;
//
//import org.hibernate.Session;
//import org.springframework.orm.hibernate3.HibernateCallback;
//import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
//
//
//public abstract class BaseHibernateDaoSupport extends HibernateDaoSupport {
//
//    /**
//     * return list data with paging
//     *
//     * @param String queryName
//     * @param int page
//     * @param int range
//     * @return List
//     * @throws HibernateException
//     */
//    public List getPagedList(final String queryName, final int page,
//            final int range) {
//
//        return getHibernateTemplate().executeFind(new HibernateCallback() {
//
//            public Object doInHibernate(Session session)
//                    throws HibernateException {
//                Query queryObject = getHibernateTemplate().getNamedQuery(
//                        session, queryName);
//                queryObject.setFirstResult((page - 1) * range);
//                queryObject.setMaxResults(range);
//
//                return queryObject.list();
//            }
//        });
//    }
//     // ...기타 사용자 정의 메써드들
//} 