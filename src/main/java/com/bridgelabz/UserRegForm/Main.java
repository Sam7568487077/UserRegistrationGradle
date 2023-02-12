package com.bridgelabz.UserRegForm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface Validator {
    boolean isValid(String param);
}

class A implements Validator {

    @Override
    public boolean isValid(String param) {
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        UserRegForm u = new UserRegForm();

        Validator firstNameValidator = (String firstName) -> {
            Pattern p = Pattern.compile("[A-Z][a-z]*");
            Matcher m = p.matcher(firstName);
            if (m.find()) {
                System.out.println("Valid First Name");
                return true;
            } else {
                System.out.println("Invalid First Name");
                return false;
            }
        };
        firstNameValidator.isValid("Sam");




        Validator lastNameValidator = (String lastName) -> {
            Pattern p = Pattern.compile("[A-Z][a-z]*");
            Matcher m = p.matcher(lastName);
            if (m.find()) {
                System.out.println("Valid Last Name");
                return true;
            } else {
                System.out.println("Invalid Last Name");
                return false;
            }
        };
        lastNameValidator.isValid("kv");


        Validator emailValidator = (String email) -> {
            Pattern p1 = Pattern.compile("^([a-zA-Z0-9][+*.a-zA-Z0-9]*@[a-zA-z0-9]+(([.][a-zA-Z])+))");
            Matcher m = p1.matcher(email);
            if (m.find()) {
                System.out.println("Valid Email");
                return true;
            } else {
                System.out.println("Invalid Email");
                return false;
            }
        };
        emailValidator.isValid("ksam071@gmail.com");


        Validator passwordValidator = (String password) -> {
            Pattern p3 = Pattern.compile("((?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]){8,})");
            Matcher m = p3.matcher(password);
            if (m.find()) {
                System.out.println("Valid Password");
                return true;
            } else {
                System.out.println("Invalid Password");
                return false;
            }
        };
        passwordValidator.isValid("Sam@12345");


    }
}
