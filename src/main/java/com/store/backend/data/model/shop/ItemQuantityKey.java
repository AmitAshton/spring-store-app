package com.store.backend.data.model.shop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
/**
 * This class represents the key for each item quantity,
 * each one has an item id and a shop id
 */
@Embeddable
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ItemQuantityKey implements Serializable {
    @Column
    private Long itemId;
    @Column
    private Long shopId;
}
