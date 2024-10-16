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

        // User registration for account
        System.out.println("Register your account..........");
        System.out.println("Enter your First Name:");
        String firstName = input.next();
        userLogin.setFirstName(firstName);
        System.out.println("Enter your Last Name:");
        String lastName = input.next();
        userLogin.setLastName(lastName);
        System.out.println("Enter  your Username:");
        String username = input.next();
        userLogin.setUsername(username);
        System.out.println("Enter your  Password:");
        String password = input.next();
        userLogin.setPassword(password);
        
          System.out.println(userLogin.registerUser());
        while (!userLogin.checkUsername(username) || !userLogin.checkPasswordComplexity(password )) {
            System.out.println("username is incorrectly formatted and password does not meet the complexity requirements");
            System.out.println("Enter your Username:");
            username = input.next();
            System.out.println("Enter your Password:");
            password = input.next();
            System.out.println(userLogin.registerUser());
        }
         // User login their details
       
        
          userLogin.loginUser(username ,password );
        userLogin.Returnlogin();
    }
}




    
