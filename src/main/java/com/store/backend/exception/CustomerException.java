package com.store.backend.exception;

/**
 * this class represents a run time exception that is connected to the costumer
 */
public class CustomerException extends RuntimeException {
    public CustomerException(String s) {
        super(s);
    }
}
