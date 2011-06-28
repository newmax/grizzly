package com.newmax.rt.grizzly.service.transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newmax.rt.grizzly.model.dao.AbonentDao;
import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.service.AbonentService;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

public class TransactionalAbonentService implements AbonentService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private AbonentDao dao;
    
    /**
     * Create an instance of User entity based service
     *
     * @param dao - data access object, which should be able do all CRUD operations with user entity
     */
    public TransactionalAbonentService(AbonentDao dao) {
        this.dao = dao;
    }
	
	public Abonent getByAccount(String account) throws NotFoundException {
		Abonent abonent = dao.getByAccount(account);
        if (abonent == null) {
            String msg = "Abonent by account " + account + " not found.";
            logger.info(msg);
            throw new NotFoundException(msg);
        }
        return abonent;
	}

    /**
     * {@inheritDoc}
     */
    public Abonent get(Long id) throws NotFoundException {
        if (!dao.isExist(id)) {
            throw new NotFoundException("Abonent with id: " + id + " not found");
        }
        return (Abonent) dao.get(id);
    }

}
