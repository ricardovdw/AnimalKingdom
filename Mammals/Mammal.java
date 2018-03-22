package Mammals;

import General.Animal;
import General.Egg;
import General.Gender;
import Interfaces.IMammal;
import Zoo.Zoo;
import java.util.ArrayList;

public class Mammal extends Animal implements IMammal {

    ArrayList<Animal> babyMammals = new ArrayList();

    public Mammal(String bodyCovering, String name, String colour, int weight, int maxNumberOfEggs, Gender gender) {
        super(bodyCovering, name, colour, weight, maxNumberOfEggs, gender);
    }

    public void giveLifeBirth() {
        ArrayList<Egg> mammalEggs = giveBirth();
        for (Egg eggs : mammalEggs) {
           Animal m = eggs.getEmbryo();
            babyMammals.add(m);
     
        }

    }

    @Override
    public String communicate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suckle() {
        System.out.println("ik zuig");
    }
    
}
