package com.store.backend.data.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
/**
 * this data transfer object represents the transaction result
 * with the attributes of id and the sum amount of the transaction
 */
@Data
@AllArgsConstructor
public class TransactionResult {
    private String transactionId;
    private double sum;
}
