package Mammals;

import General.Gender;
import java.util.ArrayList;

public abstract class Elephant extends Mammal {
 private static final int MAX_NUMBER_OF_EGGS = 1;
    protected String earSize;

    public Elephant(String earSize, String bodyCovering, String name, String colour, int weight, Gender gender) {
        super(bodyCovering, name, colour, weight, MAX_NUMBER_OF_EGGS, gender);
        this.earSize = earSize;
    }

    @Override
    public String communicate() {
        return "slrrrrrrp";
    }

    @Override
    public void suckle() {
        
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
  return this.getGender().giveBirth();    }

    public String getEarSize() {
        return earSize;
    }

    public void setEarSize(String earSize) {
        this.earSize = earSize;
    }
}
