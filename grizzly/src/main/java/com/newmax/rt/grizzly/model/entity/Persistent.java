package com.newmax.rt.grizzly.model.entity;

import java.io.Serializable;

public abstract class Persistent {
	
	Serializable id;
	
    /**
     * Get the primary id of the persistent object.
     * @return the id
     */
    public Serializable getId() {
        return id;
    }
	
    /**
     * {@inheritDoc }
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

}
