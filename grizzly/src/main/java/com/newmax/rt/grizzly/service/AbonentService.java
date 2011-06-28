package com.newmax.rt.grizzly.service;

import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

public interface AbonentService {

	Abonent getByAccount(String account) throws NotFoundException;
	
	Abonent get(Long id) throws NotFoundException;
	
}
