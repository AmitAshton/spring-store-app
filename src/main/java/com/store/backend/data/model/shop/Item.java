package com.store.backend.data.model.shop;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
/**
 * This class represents an item object with all of his attributes:
 * id, name, item description, price and category
 */
@Entity(name = "item")
@Data
@Table
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String name;

    @Column(columnDefinition="text", length=10485760)
    private String description;

    @Column
    private Double price;

    @Column
    private String category;
}
