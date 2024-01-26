package com.store.backend.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * this class represents a run time exception that the token wasn't found
 */
@ResponseStatus(HttpStatus.FORBIDDEN)
public class TokenNotFound extends RuntimeException {
}
