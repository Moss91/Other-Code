/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise10;

/**
 *
 * @author TiehoM
 */
public class TestClass1 {
    public static void main(String[] args) {
        int x = 4, y = 9;
        
        x += (y / x < 3 ) ? y : x;
        
        System.out.println("After a ternary operator X is " + x);
    }
} 
