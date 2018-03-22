
package Special;

import General.Animal;
import General.Gender;
import Interfaces.IBird;
import Interfaces.IMammal;
import Interfaces.IReptile;
import java.util.ArrayList;


public class Platypus extends Animal implements IReptile,IMammal,IBird { 
private static final int MAX_NUMBER_OF_EGGS = 4;
    public Platypus(String bodyCovering, String name, String colour, int weight, Gender gender) {
        super(bodyCovering, name, colour, weight, MAX_NUMBER_OF_EGGS, gender);
    }

    @Override
    public String crawl() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<General.Egg> layEggs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void suckle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String fly() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void hatchEggs(ArrayList<General.Egg> Egg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  @Override
    public String communicate(){
    return  "perry";
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
  return this.getGender().giveBirth();    }

    
}
