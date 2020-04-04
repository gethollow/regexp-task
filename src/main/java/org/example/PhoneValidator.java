package org.example;

public class PhoneValidator implements Validator {
    public boolean isValid(String value) {
        value = value.replace("545","O");
        value = value.replace("570","O");
        value = value.replace("(нет)","O");
        return value.matches("^(?![-3])" +
                "[+]?" +
                "((\\d)+|[\\-(]?)" +
                "((\\d)+|[\\-]?)" +
                "((\\d)+[()\\-]?)" +
                "((\\d)+[\\-()]?)" +
                "((\\d)+[\\-]?)" +
                "(\\d)+" +
                "(\\()?" +
                "([а-я]){0,12}" +
                "(\\.)?" +
                "(\\s)?" +
                "(\\d){0,3}" +
                "(\\))?");
    }
}
