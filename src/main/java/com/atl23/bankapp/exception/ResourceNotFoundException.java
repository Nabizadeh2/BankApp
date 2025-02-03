package com.atl23.bankapp.exception;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(   String message) {
        super(message);
    }
}
