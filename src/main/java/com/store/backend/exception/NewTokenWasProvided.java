package com.store.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * this class represents a run time exception that there is already a new token who was provided to the user
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN)
public class NewTokenWasProvided extends RuntimeException {
    public NewTokenWasProvided(String user) {
        super("new token was already provided for user " + user);
    }
}
