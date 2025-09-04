package com.rainbowuniv.academicmenagmentbe.shared.privacyandpwd.email;

public class InvalidAuthException extends IllegalArgumentException {
    public InvalidAuthException(String message) {
        super(message);
    }
}