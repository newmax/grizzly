package com.newmax.rt.grizzly.model.dao;

import java.io.Serializable;

import com.newmax.rt.grizzly.model.entity.Persistent;

public interface Dao<T extends Persistent> {

    /**
     * Get the object by id.
     *
     * @param id the id
     * @return loaded Persistence instance
     */
    T get(Serializable id);

    /**
     * Check entity existance by id.
     *
     * @param id entity id
     * @return {@code true} if entity exist
     */
    boolean isExist(Serializable id);
	
}
