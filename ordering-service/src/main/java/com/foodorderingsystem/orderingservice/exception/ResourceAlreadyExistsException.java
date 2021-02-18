package com.foodorderingsystem.orderingservice.exception;

public class ResourceAlreadyExistsException extends Exception {
    public ResourceAlreadyExistsException() {
        super("already Exists!");
    }
}