package com.educandoweb.course.services.exceptions;

public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(Object id) {
        super("Resourcer not found. Id " + id);
    }

}
