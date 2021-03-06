/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andregoncalves
 */
public class Homework8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner myKb = new Scanner(System.in);

        boolean valid = false;

        Random r = new Random();
        int rand = r.nextInt(100);
        System.out.println(rand);

        int count = 10;
        int counter = 0;

        System.out.println("Welcome to our program. Here you will be asked to guess a number between 1 and 100.");

        do {

            System.out.println("Please pick a number between 1 and 100, you have 10 guesses");

            int userGuess[] = new int[10];

            for (int i = 0; i < userGuess.length; i++) {

                System.out.println("Chance " + (i + 1) + ": you have " + count + " tries left");
                count--;
                valid = false;
                userGuess[i] = myKb.nextInt();

                if (userGuess[i] == rand) {
                    System.out.println("You Win!!");
                    valid = true;
                    break;

                } else if (count == 0) {

                    System.out.println("Hard Luck!!");
                    valid = true;
                    
                }
            }

                    
                }while (!valid);

            }

        } 
    

