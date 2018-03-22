/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reptiles;

import General.Gender;
import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public class Snake extends Reptiles {

    public Snake(String bodyCovering, String name, String colour, int weight, Gender gender) {
        super(bodyCovering, name, colour, weight, gender);
    }


    
    

    @Override
    public String communicate() {
        return "skkkkkkkkkkkkkkra";
    }

    @Override
    public String crawl() {
        return "ik kruip";
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
        return this.getGender().giveBirth();
    }
}
