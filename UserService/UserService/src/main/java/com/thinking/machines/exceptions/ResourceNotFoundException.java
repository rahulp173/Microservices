package com.thinking.machines.exceptions;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException () {
        super("Resource not found in Database ");
    }

    public ResourceNotFoundException(String message) {
        super(message);
    }
}
