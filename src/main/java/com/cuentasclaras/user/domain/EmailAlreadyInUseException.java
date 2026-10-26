package com.cuentasclaras.user.domain;

public class EmailAlreadyInUseException extends RuntimeException {

    public EmailAlreadyInUseException(String email) {
        super("Email already in use: " + email);
    }
}