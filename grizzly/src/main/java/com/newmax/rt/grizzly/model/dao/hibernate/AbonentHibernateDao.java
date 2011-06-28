package com.newmax.rt.grizzly.model.dao.hibernate;

import com.newmax.rt.grizzly.model.dao.AbonentDao;
import com.newmax.rt.grizzly.model.entity.Abonent;

import java.lang.reflect.ParameterizedType;

public class AbonentHibernateDao extends AbstractHibernateDao implements AbonentDao{
   
    /**
     * Type of entity
     */
    private final Class<Abonent> type = getType();

    /**
     * Retrieves parametrized type of entity using reflection.
     *
     * @return type of entity
     */
    @SuppressWarnings("unchecked")
	private Class<Abonent> getType() {
        return (Class<Abonent>) ((ParameterizedType) getClass()
                .getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public Abonent get(Long id) {
        return (Abonent) getSession().get(type, id);
    }	
   
    /**
     * {@inheritDoc}
     */
	public Abonent getByAccount(String account) {
    	 return (Abonent) getSession()
         .createQuery("select ab_id,ab_firm,ab_account from SIP_W.ABONENT where ab_account = ?")
         .setString(0, account)
         .uniqueResult();
	}
	
    public boolean isExist(Long id) {
        return get(id) != null;
    }

	public Abonent getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
