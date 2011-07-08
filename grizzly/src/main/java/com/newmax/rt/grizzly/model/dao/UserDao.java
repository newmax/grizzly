package com.newmax.rt.grizzly.model.dao;

import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.model.entity.User;

public interface UserDao extends Dao<User>{

	User getByName(String name);
	
	User getByAbonent(Abonent abonent);

}
