package com.newmax.rt.grizzly.model.dao;

import com.newmax.rt.grizzly.model.entity.Abonent;

public interface AbonentDao {
	
	Abonent get(Long id);

	Abonent getByAccount(String account);
	
	boolean isExist(Long id);
}
