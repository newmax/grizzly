package com.newmax.rt.grizzly.model.dao.hibernate;

import com.newmax.rt.grizzly.model.dao.UserDao;
import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.model.entity.User;

public class UserHibernateDao extends AbstractHibernateDao<User> implements UserDao {

    /**
     * {@inheritDoc}
     */
	public User getByName (String name) {
		return (User) getSession()
				.createQuery("from User where name = ?")
				.setString(0, name)
				.uniqueResult();
	}
	
    /**
     * {@inheritDoc}
     */
	public User getByAbonent (Abonent abonent) {
		return (User) getSession()
				.createQuery("from Abonent where account = ?")
				.setEntity(0, abonent)
				.uniqueResult();
	}

}
