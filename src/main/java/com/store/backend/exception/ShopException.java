package com.store.backend.exception;

/**
 * this class represents a run time exception that is connected to the shop
 */
public class ShopException extends RuntimeException {
    public ShopException(String message) {
        super(message);
    }
}
