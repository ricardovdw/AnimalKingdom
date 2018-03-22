
package Interfaces;

import General.Egg;
import java.util.ArrayList;


public interface IReptile extends IEggLayer {
    public String crawl();

    @Override
    public  ArrayList<Egg> layEggs();
}
     
    

