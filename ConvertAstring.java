/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author TiehoM
 */
import java.util.*;
public class ConvertAstring {
    public static void main(String[] args) {
        String [] months = {"Jan","Feb","Mar","Apr","May","Jun"};
        
        ArrayList<String> monthList = new ArrayList(Arrays.asList(months));
        
        for (String s : monthList){
               if (s.equals("sunday")){
                   System.out.println(s.toUpperCase());
               }
               else System.out.println(s);
            }
            System.out.println(monthList);
    }
}
