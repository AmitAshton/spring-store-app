package com.store.backend.controller;

import com.store.backend.data.dto.TransactionDetails;
import com.store.backend.data.dto.TransactionResult;
import com.store.backend.service.TransactionService;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * this class represents the controller for the transaction and all the CRUD options for the transactions
 */
@RestController
@RequestMapping("api/transaction")
@RequiredArgsConstructor
public class TransactionController {
    private final TransactionService transactionService;

    @PostMapping("/buy")
    @ApiResponse(description = "Customer buys products from shop")
    public ResponseEntity<TransactionResult> buy(@Valid @RequestBody TransactionDetails transactionDetails) {
        return ResponseEntity.ok(transactionService.buy(transactionDetails));
    }

    @PostMapping("/sell")
    @ApiResponse(description = "Customer sells products to shop")
    public ResponseEntity<TransactionResult> sell(@Valid @RequestBody TransactionDetails transactionDetails) {
        return ResponseEntity.ok(transactionService.sell(transactionDetails));
    }

}
