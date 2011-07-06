package com.newmax.rt.grizzly.model.dao.hibernate;

import com.newmax.rt.grizzly.model.dao.AbonentDao;
import com.newmax.rt.grizzly.model.dao.Dao;
import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.model.entity.Persistent;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

public class AbonentHibernateDao extends AbstractHibernateDao<Abonent> implements AbonentDao {
   
  
    /**
     * {@inheritDoc}
     */
	public Abonent getByAccount(String account) {
    	 return (Abonent) getSession()
         .createQuery("select ab_id,ab_firm,ab_account from SIP_W.ABONENT where ab_account = ?")
         .setString(0, account)
         .uniqueResult();
	}
	

	public Abonent getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
