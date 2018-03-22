
package Mammals;

import General.Gender;


public abstract class Mouse extends Mammal {
 private static final int MAX_NUMBER_OF_EGGS = 10;
    public Mouse(String bodyCovering, String name, String colour, int weight, Gender gender) {
        super(bodyCovering, name, colour, weight, MAX_NUMBER_OF_EGGS, gender);
    }

      @Override
    public String communicate(){
    return  "ipiep";
    }

    
}
