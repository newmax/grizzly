package com.newmax.rt.grizzly.model.dao.hibernate;

import com.newmax.rt.grizzly.model.dao.AbonentDao;
import com.newmax.rt.grizzly.model.entity.Abonent;

public class AbonentHibernateDao extends AbstractHibernateDao<Abonent> implements AbonentDao {
   
    /**
     * {@inheritDoc}
     */
	public Abonent getByAccount(String account) {
		return (Abonent) getSession()
				.createQuery("from Abonent where account = ?")
				.setString(0, account)
				.uniqueResult();
	}

}
