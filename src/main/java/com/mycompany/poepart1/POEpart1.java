/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;

import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class POEpart1 {
    
    
    public static void main(String[] args) {
       
part1Class userLogin = new part1Class();
        
        Scanner input = new Scanner(System.in);

        // User registration
        System.out.println("Register your account..........");
        System.out.println("Enter your First Name:");
        userLogin.firstName = input.next();
        System.out.println("Enter your Last Name:");
        userLogin.lastName = input.next();
        System.out.println("Enter  your Username:");
        userLogin.username = input.next();
        System.out.println("Enter your  Password:");
        userLogin.password = input.next();
        
//user registers their account
          System.out.println(userLogin.registerUser());
        while (!userLogin.checkUsername() || !userLogin.checkPasswordComplexity()) {
            System.out.println("Try registering again!");
            System.out.println("Enter your Username:");
            userLogin.username = input.next();
            System.out.println("Enter your Password:");
            userLogin.password = input.next();
            System.out.println(userLogin.registerUser());
        }
 // User login their details
        System.out.println("Login...");
        System.out.println("Enter Username:");
        userLogin.enteredUsername = input.next();
        System.out.println("Enter Password:");
        userLogin.enteredPassword = input.next();
        System.out.println(userLogin.returnLoginStatus());

        while (!userLogin.loginUser()) {
            System.out.println("Try  Login again ..........");
            System.out.println("Enter your Username:");
            userLogin.enteredUsername = input.next();
            System.out.println("Enter your  Password:");
            userLogin.enteredPassword = input.next();
            System.out.println(userLogin.returnLoginStatus());
        }

    }
}




    
