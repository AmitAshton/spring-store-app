package com.store.backend.data.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.store.backend.data.model.worker.Job;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * this data transfer object represents the worker
 * with the attributes of worker id, id, full name, phone number, account number, job and shop by the json property order annotation
 */
@JsonPropertyOrder({"workerId", "id", "fullName", "password", "phoneNumber", "accountNumber", "shop", "job"})
@Builder
@Value
public class WorkerDto {
    @NotBlank
    String workerId;
    @NotBlank
    String password;
    @NotBlank
    String id;
    @NotBlank
    String fullName;
    @NotBlank
    String phoneNumber;
    @NotBlank
    String accountNumber;
    @NotNull
    Job job;
    ShopDto shop;
}
