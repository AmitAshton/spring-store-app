package com.store.backend.external;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
/**
 * This class represents an external product, witch also has:
 * id, title, price, category and item description
 */
@Data

@JsonIgnoreProperties(ignoreUnknown = true)
public class ExternalProduct {
    private String id;
    private String title;
    private double price;
    private String category;
    private String description;
}
