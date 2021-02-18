package com.foodorderingsystem.orderingservice.exception;

public class ResourceDoesNotExistsException extends Exception{
    public ResourceDoesNotExistsException() {
        super("Doesn't Exist!");
    }
}
