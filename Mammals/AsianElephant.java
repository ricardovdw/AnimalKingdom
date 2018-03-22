
package Mammals;

import General.Gender;
import java.util.ArrayList;


public class AsianElephant extends Elephant {

    public AsianElephant(String earSize, String bodyCovering, String name, String colour, int weight, Gender gender) {
        super(earSize, bodyCovering, name, colour, weight, gender);
    }
 
  
    
   
    @Override
    public String communicate() {
        return super.communicate(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
  return this.getGender().giveBirth();    }
    
}
