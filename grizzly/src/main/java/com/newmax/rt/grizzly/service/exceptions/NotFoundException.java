package com.newmax.rt.grizzly.service.exceptions;

/**
 * The exception for case when searching item not found.
 * 
 * @author Pavel Vervenko
 */
public class NotFoundException extends Exception {

    /**
     * Default constructor.
     *
     * @param message exception message
     */
    public NotFoundException(String message) {
        super(message);
    }

    /**
     * Create exception with specific message.
     * 
     * {@link Exception}
     */
    public NotFoundException() {
    }
}