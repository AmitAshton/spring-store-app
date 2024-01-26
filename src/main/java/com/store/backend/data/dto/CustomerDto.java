package com.store.backend.data.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotBlank;


/**
 * this data transfer object represents the costumer
 * with the attributes of id, type, full name and phone number by the json property order annotation
 */
@JsonPropertyOrder({"id", "type", "fullName", "phoneNumber"})
@Builder
@Value
public class CustomerDto {
    @NotBlank(message = "Customer type is mandatory")
    String type;
    @NotBlank(message = "Id must always be provided")
    String id;
    @NotBlank(message = "FullName must be provided")
    String fullName;
    @NotBlank(message = "PhoneNumber must be provided")
    String phoneNumber;
}
