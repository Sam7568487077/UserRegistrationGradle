package com.bridgelabz.UserRegForm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" This is User Registration Form ");
        Pattern p = Pattern.compile("[A-Z][a-z]*");
        System.out.println("Enter your name:");
        String firstName = sc.next();

        Matcher m = p.matcher(firstName);
        if (m.find()) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Invalid Name");
        }


    }
}
