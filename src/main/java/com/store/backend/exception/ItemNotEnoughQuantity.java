package com.store.backend.exception;

/**
 * this class represents a run time exception that the item don't have enough quantity
 */
public class ItemNotEnoughQuantity extends RuntimeException {
    public ItemNotEnoughQuantity(Long shopId, Long itemId) {
        super("In shop id: " + shopId + "with item id: " + itemId);
    }
}
