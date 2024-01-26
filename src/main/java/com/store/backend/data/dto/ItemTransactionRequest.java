package com.store.backend.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * this data transfer object represents the request of the transaction if an item
 * with the attributes of the item id and quantity
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemTransactionRequest {
    private long itemId;
    private long quantity;
}
