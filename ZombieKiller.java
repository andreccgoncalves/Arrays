/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zombiekiller;

/**
 *
 * @author andregoncalves
 */
public class ZombieKiller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        System.out.println("Welcome to our Zombie Killer Program!!!");
        
        String backpack[] = {"Shotgun", "Assault Rifle", "Sniper"};
        String zombies[] = {"Close-range Zombie", "Mid-range Zombie", "Long-range Zombie"};
        
            System.out.println("Backpack Itens: ");
            System.out.println(backpack[0]);
            System.out.println(backpack[1]);
            System.out.println(backpack[2]);
            
            System.out.println("These are the Zombies: ");
            System.out.println(zombies[0]);
            System.out.println(zombies[1]);
            System.out.println(zombies[2]);
            
            
            int numbersZombiesHate[] = {4, 90, 70, 123, 12, 561, 1};
            
            
            System.out.println("What number do the Zombies hate?");
            System.out.println(numbersZombiesHate[1]);
    }
    
    
}
