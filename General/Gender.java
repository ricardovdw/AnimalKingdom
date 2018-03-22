package General;

import java.util.ArrayList;

public abstract class Gender {

    private Animal genderOwner;

    public abstract boolean isPregnant();

    public abstract void propagate(Animal partner1, Animal partner2);

    public abstract boolean isFemale();

    public abstract ArrayList<Egg> giveBirth();

    public void setGenderOwner(Animal genderOwner) {
        this.genderOwner = genderOwner;
    }

    public Animal getGenderOwner() {
        return genderOwner;
    }

}
