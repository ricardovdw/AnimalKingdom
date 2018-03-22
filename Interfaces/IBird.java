
package Interfaces;

import General.Egg;
import java.util.ArrayList;


public interface IBird extends IEggLayer{
    public String fly();
    public void hatchEggs( ArrayList <Egg> Egg);
}
