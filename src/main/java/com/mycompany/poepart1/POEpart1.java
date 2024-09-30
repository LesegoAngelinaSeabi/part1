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
        System.out.println("Register..........");
        System.out.println("Enter First Name:");
        userLogin.firstName = input.next();
        System.out.println("Enter Last Name:");
        userLogin.lastName = input.next();
        System.out.println("Enter Username:");
        userLogin.username = input.next();
        System.out.println("Enter Password:");
        userLogin.password = input.next();




    }
}
