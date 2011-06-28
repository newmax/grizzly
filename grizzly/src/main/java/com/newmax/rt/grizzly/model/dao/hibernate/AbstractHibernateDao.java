package com.newmax.rt.grizzly.model.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AbstractHibernateDao {
    /**
     * Hibernate SessionFactory
     */
    private SessionFactory sessionFactory;
    
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }
}
