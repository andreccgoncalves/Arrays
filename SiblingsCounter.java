/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siblingscounter;

import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class SiblingsCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        Scanner myKb = new Scanner(System.in);

        System.out.println("How many siblings do you have?");
        int siblingsNumber = myKb.nextInt();

        String siblingsNames[] = new String[siblingsNumber];

        for (int i = 0; i < siblingsNames.length; i++) {

            System.out.println("Enter siblings' Names: ");
            siblingsNames[i] = myKb.next();

        }

        System.out.println("These are the siblings' names: ");

        for (String names : siblingsNames) {

            System.out.println(names);

        }
    }
}