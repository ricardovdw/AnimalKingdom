/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bird;

import General.Animal;
import General.Egg;
import General.Gender;
import Interfaces.IBird;
import Zoo.Zoo;
import java.util.ArrayList;

/**
 *
 * @author Gebruiker
 */
public abstract   class Bird extends Animal implements IBird {

    public Bird(String bodyCovering, String name, String colour, int weight, int maxNumberOfEggs, Gender gender) {
        super(bodyCovering, name, colour, weight, maxNumberOfEggs, gender);
    }
    @Override
    public String communicate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hatchEggs(ArrayList<Egg> layEggs) {
        for (Egg e : layEggs) {
            Animal b = e.getEmbryo();
            Zoo z = Zoo.getInstance();
            z.addAnimal(b);

        }
    }


    @Override
    public ArrayList<Egg> layEggs() {
        return this.giveBirth();
    }

    @Override
    public String fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
