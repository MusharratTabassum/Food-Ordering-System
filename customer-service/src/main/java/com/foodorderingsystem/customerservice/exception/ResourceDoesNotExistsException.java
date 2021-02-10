package com.foodorderingsystem.customerservice.exception;

public class ResourceDoesNotExistsException extends Exception{
    public ResourceDoesNotExistsException() {
        super("Doesn't Exist!");
    }
}
