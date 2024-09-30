/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;

/**
 *
 * @author RC_Student_lab
 */
public class part1Class {
     String enteredUsername ,enteredPassword;
     String firstName,lastName, password,username;
     
      // Check if the username is correct
    public boolean checkUsername() {
        if(username.length() <= 5 && username.contains("_")) {
            return true;
        }
        return false;
    }
     // Check the passwordcomplexity 
    public boolean checkPasswordComplexity() {
        boolean hasCapitalLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        if (password.length() >= 8) {
            for (char ch : password.toCharArray()) {
                if (Character.isUpperCase(ch)) {
                    hasCapitalLetter = true;
                } else if (Character.isDigit(ch)) {
                    hasNumber = true;
                } else if (!Character.isLetterOrDigit(ch)) {
                    hasSpecialChar = true;
                }
            }
        }
        return hasCapitalLetter && hasNumber && hasSpecialChar;
    }
 // Register the user by checking username and password validity
    public String registerUser() {
        if (checkUsername()) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username is not correctly formatted. Please ensure that your Username contains an underscore and is no more than 5 characters in length.");
        }
        if (checkPasswordComplexity()) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("if Password is not correctly formatted. Please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
        }
        if (checkUsername() && checkPasswordComplexity()) {
            System.out.println("The two above conditions have been met and the user has been registered successfully.");
        } else {
            if (!checkPasswordComplexity()) {
                System.out.println("The Password does not meet the complexity requirements.");
            }
            if (!checkUsername()) {
                System.out.println("The username is incorrectly formatted.");
            }
        }
        return "";
    }

    boolean returnLoginStatus() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean loginUser() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


      

     
     
    
}
