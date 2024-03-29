package com.store.backend.data.model.customer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.Entity;
/**
 * this class represent a repeated costumer,
 * which has a sell discount of 40% from the price and buy discount of 20% from the price
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@ToString(callSuper = true)

public class RepeatCustomer extends AbstractCustomer {
    @Override
    public double sellDiscount(double price) {
        return price * 0.6;
    }

    @Override
    public double buyDiscount(double price) {
        return price*0.8;
    }
}
