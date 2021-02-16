/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistsproject;

import java.util.ArrayList;

/**
 *
 * @author andregoncalves
 */
public class ArrayListsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        
        String fruits[] = new String[4];
        
        fruits[0] = "Mango";
        fruits[1] = "Apple";
        fruits[2] = "Strawberry";
        fruits[3] = "Watermelon";
        
        System.out.println(fruits[0]);
        
        ArrayList fruitList = new ArrayList();
        fruitList.add("Mango");
        fruitList.add("Apple");
        fruitList.add("Strawberry");
        fruitList.add("Watermelon");
        
        fruitList.remove("Strawberry");
        
        System.out.println(fruitList.contains("Raspberry"));
        System.out.println(fruitList);
    }
    
}
