package com.store.backend.exception;

/**
 * this class represents a run time exception wich says that the item doesn't exists in the shop
 */
public class ItemNotExistsInShop extends RuntimeException {
    public ItemNotExistsInShop(Long shopId, Long itemId) {
        super("Item: " + itemId + " is not exists in shop: " + shopId );
    }
}
