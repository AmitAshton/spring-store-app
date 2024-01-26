package com.store.backend.exception;

/**
 * this class represents a run time exception that the item is already exists
 */
public class ItemAlreadyExists extends RuntimeException{
    public ItemAlreadyExists(String item) {
        super("Item already exists: " + item);
    }
}
