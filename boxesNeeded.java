/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class boxesNeeded {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKb = new Scanner(System.in);

        System.out.println("How many boxes do you want to enter?");
        int nums = myKb.nextInt();
        
        
         int [] someNums = new int[nums];
         System.out.println("The user wants " + someNums.length + " boxes!!");
         
         
    }
    
}
