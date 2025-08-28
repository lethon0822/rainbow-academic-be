package com.rainbowuniv.academicmenagmentbe.privacyandpwd.email;

public class InvalidAuthException extends IllegalArgumentException {
    public InvalidAuthException(String message) {
        super(message);
    }
}