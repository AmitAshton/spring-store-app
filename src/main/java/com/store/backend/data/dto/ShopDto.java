package com.store.backend.data.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * this data transfer object represents the shop
 * with the attributes of id and shop name by the json property order annotation
 */
@JsonPropertyOrder({"id", "shopName"})
@Builder
@Value
public class ShopDto {
    @NotNull(message = "Shop Id must be provided")
    Long id;
    @NotBlank(message = "Shop name must be provided")
    String shopName;
}
