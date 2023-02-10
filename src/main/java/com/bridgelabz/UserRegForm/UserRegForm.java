package com.bridgelabz.UserRegForm;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegForm {
    Scanner sc = new Scanner(System.in);

    boolean lastName(String lastName) {
        Pattern p = Pattern.compile("[A-Z][a-z]*");
        Matcher m = p.matcher(lastName);
        if (m.find()) {
            System.out.println("Valid Name");
            return true;
        } else {
            System.out.println("Invalid Name");
            return false;
        }
        //return m.matches();
    }

    boolean emailId(String emailId) {
        Pattern p1 = Pattern.compile("^([a-zA-Z0-9][+*.a-zA-Z0-9]*@[a-zA-z0-9]+(([.][a-zA-Z])+))");
        Matcher m = p1.matcher(emailId);
        if (m.find()) {
            System.out.println("Valid Email Id");
            return true;
        } else {
            System.out.println("Invalid Email ID");
            return false;

        }
    }

        boolean password(String epassword){
            Pattern p3 = Pattern.compile("((?=.*[A-Z])(?=.*[0-9])(?=.*[^a-zA-Z0-9]){8,})");
            Matcher m = p3.matcher(epassword);
            if (m.find()) {
                System.out.println("Valid Password");
                return true;
            } else {
                System.out.println("Invalid Password");
                return false;
            }

        }
    }

