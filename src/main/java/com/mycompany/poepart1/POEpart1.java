/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import javax.swing.*;
/**
 *
 * @author RC_Student_lab
 */
public class POEpart1 {
    
    

    public static void main(String[] args) {
       
       part1Class userLogin = new part1Class();
        // User registration for account
        JOptionPane.showMessageDialog(null,"Register your account..........");
        
        String firstName = JOptionPane.showInputDialog("Enter your First Name:");
        userLogin.setFirstName(firstName);
        
       
        String lastName = JOptionPane.showInputDialog("Enter your Last Name:");
        userLogin.setLastName(lastName);
        
        
        String username = JOptionPane.showInputDialog("Enter  your Username:");
        userLogin.setUsername(username);
        
        
        String password = JOptionPane.showInputDialog("Enter your  Password:");
        userLogin.setPassword(password);
        
          System.out.println(userLogin.registerUser());
        while (!userLogin.checkUsername(username) || !userLogin.checkPasswordComplexity(password )) {
             JOptionPane.showMessageDialog(null,"username is incorrectly formatted and password does not meet the complexity requirements");
           
            
            username = JOptionPane.showInputDialog("Enter your Username:");
            
            password = JOptionPane.showInputDialog("Enter your Password:");
            System.out.println(userLogin.registerUser());
        }
         // User login their details
       
        
          userLogin.loginUser(username ,password );
        
        userLogin.Returnlogin();
        //
        int Menu =0;
        while(Menu!=3){
            
         Menu = Integer.parseInt(JOptionPane.showInputDialog("Select an option: \n 1: Add Tasks \n 2: Show Report \n 3: Exit"));
         
         switch(Menu){
             case 1:
            JOptionPane.showMessageDialog(null,"username is incorrectly formatted and password does not meet the complexity requirements");
      
               break;  
             case 2:
               JOptionPane.showMessageDialog(null,"Coming school");

                 break;
             case 3:
                 System.exit(0);
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"Invalid option");
                 break;
         }
        }
        
    }
}