/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.poepart1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author RC_Student_lab
 */
public class part1ClassTest {
    
    public part1ClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of checkUsername method, of class part1Class.
     */
    @Test
    public void testCheckUsername() {
        System.out.println("kyk_1");
        String name ="KJyl_1";
        part1Class instance = new part1Class();
        boolean expResult = true;
        boolean result = instance.checkUsername(name);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("kyle!!!!!!");
    }

    /**
     * Test of checkPasswordComplexity method, of class part1Class.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("Ch&&sec@ke99!");
        String pass="Ch&&sec@ke99!";
        part1Class instance = new part1Class();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("password");
    }

       
}
