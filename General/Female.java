package General;

import java.util.ArrayList;
import java.util.Random;

public class Female extends Gender {

    public ArrayList<Egg> eggs = new ArrayList();

    public void ovulate() {
    
        int rInt = getGenderOwner().getMaxNumberOfEggs();
        int i = rInt;
        for (int a = 0; a < i; a++) {
            eggs.add(new Egg());
        }
    }

    public void menstruate() {
        eggs.clear();
    }

    @Override
    public boolean isPregnant() {
        return eggs.isEmpty();
    }

    @Override
    public void propagate(Animal partner1, Animal partner2) {
        if (partner1.isFemale() && partner2.isFemale()) {
            System.out.println("fun for males ;)");
        } else {
            for (Egg egg : eggs) {
                egg.Inseminate(partner1, partner2);
            }

        }
    }

    public ArrayList<Egg> giveBirth() {
        ArrayList<Egg> inseminatedEggs = new ArrayList<>();
        for (Egg e : eggs) {
            if (e.isInseminated()) {
                inseminatedEggs.add(e);
            }
        }
        return inseminatedEggs;
    }

    @Override
    public boolean isFemale() {
        return true;

    }

    public ArrayList<Egg> getEggs() {
        return eggs;
    }

    public void setEggs(ArrayList<Egg> Eggs) {
        this.eggs = Eggs;
    }

}
