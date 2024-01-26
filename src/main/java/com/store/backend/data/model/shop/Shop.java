package com.store.backend.data.model.shop;


import lombok.*;

import javax.persistence.*;

/**
 * this class represents a single shop
 * each shop has an id and a name
 */
@Entity(name = "shop")
@Data
@Table
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Shop {
    @Id
    private Long id;

    @Column
    private String shopName;

}
