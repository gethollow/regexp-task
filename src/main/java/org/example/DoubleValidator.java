package org.example;

public class DoubleValidator implements Validator {
    public boolean isValid(String value) {
        return value.matches("(" +
                "[-+]{0,1}" +
                "[.]{0,1}" +
                "[\\d]+" +
                "([_]{0}|[_]{2})" +
                "[\\d]{0,2}" +
                "[.]{0,1}" +
                "([0-9]{1}[_]){0,2}" +
                "[a-z]{0,1}" +
                "[\\d]{0,3}" +
                "[a-z]{0,1})");
    }
}
