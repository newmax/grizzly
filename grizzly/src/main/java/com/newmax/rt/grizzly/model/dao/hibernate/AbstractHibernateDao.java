package com.newmax.rt.grizzly.model.dao.hibernate;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.newmax.rt.grizzly.model.dao.Dao;
import com.newmax.rt.grizzly.model.entity.Persistent;

public class AbstractHibernateDao<T extends Persistent> implements Dao<T>  {

    /**
     * Hibernate SessionFactory
     */
    private SessionFactory sessionFactory;

    /**
     * Type of entity
     */
    private final Class<T> type = getType();

    /**
     * Retrieves parametrized type of entity using reflection.
     *
     * @return type of entity
     */
    @SuppressWarnings("unchecked")
    private Class<T> getType() {
        return (Class<T>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    /**
     * Get current Hibernate session.
     *
     * @return current Session
     */
    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    /**
     * Setter for Hibernate SessionFactory.
     *
     * @param sessionFactory the sessionFactory to set
     */
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    
    /**
     * {@inheritDoc}
     */
    //@Override
    @SuppressWarnings("unchecked")
    public T get(Serializable id) {
        return (T) getSession().get(type, id);
    }

    /**
     * {@inheritDoc}
     */
    //@Override
    public boolean isExist(Serializable id) {
        return get(id) != null;
    }
}
