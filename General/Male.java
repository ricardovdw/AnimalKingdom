/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public class Male extends Gender {

    @Override
    public boolean isPregnant() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void propagate(Animal partner1, Animal partner2) {
         if (!partner1.isFemale() && !partner2.isFemale()) {
            System.out.println("fun for males ;)");
         }
    }

    @Override
    public boolean isFemale() {
        return false;

    }

    @Override
    public ArrayList<Egg> giveBirth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
