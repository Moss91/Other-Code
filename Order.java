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
public class Order {
    String custType, nonProf, privCust, corp;
    double total = 910, discount;
    
    public void calcDiscount(){
    
        if(custType == nonProf){
        if(total >= 900){
        discount = 10;
        }else discount = 8;
            System.out.println("Discount is for NonProfits ");
        }else if(custType == privCust){
        if(total >= 900){
        discount = 7;
        }else discount = 0;
            System.out.println("Discount is for Private Customer");
        }else if(custType == corp){
        if(total >= 500){
        discount = 8;
        }else discount = 5;
            System.out.println("Discount is for Corporates");
        }
    }
}
