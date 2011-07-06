package com.newmax.rt.grizzly.model.dao;

import com.newmax.rt.grizzly.model.entity.Abonent;

public interface AbonentDao extends Dao<Abonent> {
	
	Abonent getByAccount(String account);
	
}
