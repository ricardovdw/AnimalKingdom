/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reptiles;

import General.Animal;
import General.Egg;
import General.Gender;
import Interfaces.IReptile;
import Zoo.Zoo;
import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public abstract class Reptiles extends Animal implements IReptile {
private static final int MAX_NUMBER_OF_EGGS = 7;
    public Reptiles(String bodyCovering, String name, String colour, int weight,Gender gender) {
        super(bodyCovering, name, colour, weight, MAX_NUMBER_OF_EGGS, gender);
    }

    public abstract String crawl();

    @Override
    public String communicate() {
        return "hap hap";
    }

  

    @Override
    public ArrayList<Egg> layEggs() {
        
       ArrayList<Egg> reptileEggs = giveBirth();
        
    Zoo.getInstance().addEggsOfReptiles(reptileEggs);
       
        return reptileEggs;
    }
  
    
}
