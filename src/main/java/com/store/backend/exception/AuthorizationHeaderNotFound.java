package com.store.backend.exception;

/**
 * this class represents a run time exception that is connected to the auth
 */
public class AuthorizationHeaderNotFound extends RuntimeException {
    public AuthorizationHeaderNotFound(String servletPath) {
        super(servletPath);
    }
}
