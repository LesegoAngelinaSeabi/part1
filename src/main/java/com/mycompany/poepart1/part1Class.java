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
        if (username.length() <= 5 && username.contains("_")) {
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


      

     
     
    
}
