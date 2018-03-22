/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mammals;

import General.Gender;
import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public class GrayMouse extends Mouse {

    public GrayMouse(String bodyCovering, String name, int weight, Gender gender) {
        super(bodyCovering, name, "gray", weight, gender);
    }
    
    

 
    @Override
    public String communicate() {
        return super.communicate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
  return this.getGender().giveBirth();    }
    
}
