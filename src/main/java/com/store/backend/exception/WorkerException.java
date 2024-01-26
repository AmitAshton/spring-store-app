package com.store.backend.exception;

/**
 * this class represents a run time exception that is connected to the worker
 */
public class WorkerException extends RuntimeException {
    public WorkerException(String exception) {
        super(exception);
    }
}
