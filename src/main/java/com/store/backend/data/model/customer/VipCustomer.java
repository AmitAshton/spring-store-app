package com.store.backend.data.model.customer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
/**
 * this class represent an important costumer,
 * which has a sell and buy discounts of 50% from the price
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)

public class VipCustomer extends AbstractCustomer {

    @Override
    public double sellDiscount(double price) {
        return price * 0.5;
    }

    @Override
    public double buyDiscount(double price) {
        return price * 0.5;
    }
}
