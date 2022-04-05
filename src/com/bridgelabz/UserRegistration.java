package com.bridgelabz;
/**
 * Program on User Registration Using Regex
 *
 * @author : Jayant singh parmar
 * @since : 04/04/2022
 * */

import java.util.regex.Pattern;

//Functional interface
interface Validation {
    String validate(String regex, String userDetails);
}

public class UserRegistration {

    public static void main(String[] args) {
        System.out.println("Welcome to the lambda function validation");

        Validation isValidFirstName = (pattern, firstName) -> {
            return "First Name is " + Pattern.compile(pattern).matcher(firstName).matches();
        };
        System.out.println(isValidFirstName.validate("^[A-Z]{1}[a-z]{2,}$", "Jayant"));

        Validation isValidLastName = (pattern, lastName) -> {
            return "Last Name is " + Pattern.compile(pattern).matcher(lastName).matches();
        };
        System.out.println(isValidLastName.validate("^[A-Z]{1}[a-z]{2,}$", "Parmar"));

        Validation isValidEmail = (pattern, email) -> {
            return "Email is " + Pattern.compile(pattern).matcher(email).matches();
        };
        System.out.println(isValidEmail.validate("^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2})*$",
                "jayantparmar420@gmail.com"));

    }
}
