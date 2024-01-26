package com.store.backend.data.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
/**
 * this data transfer object represents the transaction details
 * with the attributes of the id of the costumer who did the transaction
 * an id of the shop
 * list of the items for the transaction
 */
@Data
public class TransactionDetails {
    @NotBlank(message = "Customer that is buying/selling the products")
    private String customerId;
    @NotNull(message = "must be provided which shop is selling/buying the items from the customer")
    private Long shopId;
    @NotEmpty(message = "Can't buy/sell empty items")
    private List<ItemTransactionRequest> items;
}
