package com.cuentasclaras.user.domain;

public class UserNotFoundException extends RuntimeException {

    public UserNotFoundException(Long userId) {
        super("Usuario no encontrado: " + userId);
    }
}