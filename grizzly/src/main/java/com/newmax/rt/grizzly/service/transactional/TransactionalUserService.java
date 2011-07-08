package com.newmax.rt.grizzly.service.transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.newmax.rt.grizzly.model.dao.UserDao;
import com.newmax.rt.grizzly.model.entity.Abonent;
import com.newmax.rt.grizzly.model.entity.User;
import com.newmax.rt.grizzly.service.UserService;
import com.newmax.rt.grizzly.service.exceptions.NotFoundException;

public class TransactionalUserService implements UserService {

    private final Logger logger = LoggerFactory.getLogger(getClass());
    private UserDao dao;
    
    /**
     * Create an instance of User entity based service
     *
     * @param dao - data access object, which should be able do all CRUD operations with user entity
     */
    public TransactionalUserService(UserDao dao) {
        this.dao = dao;
    }	
	
	/**
     * {@inheritDoc}
     */
	public User getByName(String name) throws NotFoundException {
		User user = dao.getByName(name);
        if (user == null) {
            String msg = "User by name " + name + " not found.";
            logger.info(msg);
            throw new NotFoundException(msg);
        }
        return user;
	}

    /**
     * {@inheritDoc}
     */
	public User getByAbonent(Abonent abonent) throws NotFoundException {
		User user = dao.getByAbonent(abonent);
        if (user == null) {
            String msg = "User by abonent " + abonent + " not found.";
            logger.info(msg);
            throw new NotFoundException(msg);
        }
        return user;
	}

    /**
     * {@inheritDoc}
     */
	public User get(String id) throws NotFoundException {
        if (!dao.isExist(id)) {
            throw new NotFoundException("User with id: " + id + " not found");
        }
        return (User) dao.get(id);
	}

}
