/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedloop;

import java.util.Random;

/**
 *
 * @author andregoncalves
 */
public class NestedLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        
        int[][] myGrid = new int[5][10];

        for (int row = 0; row < myGrid.length; row++) {

            for (int column = 0; column < myGrid[row].length; column++) {

                Random r = new Random();

                int number = r.nextInt(100);

                myGrid[row][column] = number;

            }
        }

    }
}
