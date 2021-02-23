/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integersarray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author andregoncalves
 */
public class IntegersArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    
Scanner myKb = new Scanner(System.in);

        int myNumbers[] = {1, 5, 10, 15, 20, 25, 30, 35, 40, 45};


        System.out.println("Please write the option the same as it is: ");

        String option1 = ("Print out the numbers in sequence:");
        String option2 = ("Print out the average of the numbers:");
        String option3 = ("Print out the total of the numbers:");
        String option4 = ("Quit");

        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);

        String input = myKb.nextLine();

        if (input.equals(option1)) {
            System.out.println(Arrays.toString(myNumbers));

        } 
        else if (input.equals(option2)) {

            int sum = 0;
            double average;

            for (int i = 0; i < myNumbers.length; i++) {
                sum = sum + myNumbers[i];
            }
            average = (double) sum / myNumbers.length;
            System.out.println("Average value of array element is " + average);

        } 
        else if (input.equals(option3)) {
            int sum = IntStream.of(myNumbers).sum();
            System.out.println("The sum is " + sum);

        } 
        else if (input.equals(option4)) {
            System.out.println("You have quit");
        }

    }

}
