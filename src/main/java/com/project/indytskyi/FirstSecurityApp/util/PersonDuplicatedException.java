package com.project.indytskyi.FirstSecurityApp.util;

public class PersonDuplicatedException extends RuntimeException {
    public PersonDuplicatedException(String msg) {
        super(msg);
    }
}
