/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bird;

import General.Gender;
import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public class Parrot extends Bird {
    
    public Parrot(String bodyCovering, String name, String colour, int weight, int maxNumberOfEggs, Gender gender) {
        super(bodyCovering, name, colour, weight, maxNumberOfEggs, gender);
    }

  @Override
    public String fly(){
    return  "ik vlieg";
    }
    
    @Override
    public String communicate(){
    return  "ik kan praten";
    }

    @Override
    public void hatchEggs(ArrayList<General.Egg> Egg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<General.Egg> layEggs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
