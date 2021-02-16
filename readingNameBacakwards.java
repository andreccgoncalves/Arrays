/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class readingNameBacakwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
     Scanner myKb = new Scanner (System.in);
     
       System.out.println("Type a name");
              
        String text = myKb.nextLine();
        
        char[] ch = text.toCharArray();

        
        for (int i = ch.length-1; i >= 0; i--) {
            
            System.out.print(ch[i]);

    }
    
}
}
