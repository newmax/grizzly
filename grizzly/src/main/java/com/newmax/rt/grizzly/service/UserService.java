package com.newmax.rt.grizzly.service;

import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.model.entity.User;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

public interface UserService {

	User getByName (String name) throws NotFoundException;
	
	User getByAbonent (Abonent abonent) throws NotFoundException;
	
	User get(String id) throws NotFoundException;
	
}
