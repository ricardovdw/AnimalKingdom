package Mammals;

import General.Gender;
import java.util.ArrayList;
import java.util.Random;

public class Human extends Mammal {

    private boolean usesBirthControl;
    public String lastName;
    public String insertion;
    private Human partner;
    private static final int MAX_NUMBER_OF_EGGS = 2;
    private boolean hasStd = false;
    private int Std = 0;
    private int getcaught = 50;

    public Human(boolean usesBirthControl, String lastName, String insertion, String bodyCovering, String name, String colour, int weight, int maxNumberOfEggs, Gender gender) {
        super(bodyCovering, name, colour, weight, MAX_NUMBER_OF_EGGS, gender);
        this.usesBirthControl = usesBirthControl;
        this.lastName = lastName;
        this.insertion = insertion;

    }

    public void makeLove() {

        Random randomGenerator = new Random();
        int rInt1 = randomGenerator.nextInt(100);
        if (rInt1 <= Std) {
            this.hasStd = true;
        }
        this.setStd(getStd() + 5);
    }

    public void makeLove(Human partner) {
        if (this.partner.equals(partner)) {
            marriageLove();
        } else if (this.isMarried() || partner.isMarried()) {
            adulteryLove(partner);
        } else {
            makeLove();
        }

    }

    private void marriageLove() {
        if (usesBirthControl) {
            System.out.println("i am making love");
        }

    }

    private void adulteryLove(Human lover) {
        Random randomGenerator = new Random();
        int rInt = randomGenerator.nextInt(100);
        if (rInt <= getGetcaught()) {
            this.setPartner(null);
        }
        if (rInt <= Std) {
            this.setHasStd(true);
        }
        this.setStd(getStd() + 5);
        this.setGetcaught(getGetcaught() + 5);
    }

    public boolean mary(Human partner) {
        if (!this.isMarried() && !partner.isMarried()) {
            partner.setPartner(this);
            this.setPartner(partner);
        }
        return true;
    }

    public boolean isMarried() {
        return this.partner != null;
    }

    public void divorce() {
        if (this.isMarried() && partner.isMarried()) {
            partner.setPartner(null);
            this.setPartner(null);
        }
    }

    @Override
    public String communicate() {
        return "ik kan praten";
    }

    @Override
    public void suckle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Boolean getUsesBirthControl() {
        return usesBirthControl;
    }

    public boolean isHasStd() {
        return hasStd;
    }

    public void setHasStd(boolean hasStd) {
        this.hasStd = hasStd;
    }

    public int getStd() {
        return Std;
    }

    public void setStd(int Std) {
        this.Std = Std;
    }

    public int getGetcaught() {
        return getcaught;
    }

    public void setGetcaught(int getcaught) {
        this.getcaught = getcaught;
    }

    public String getLastName() {
        return lastName;
    }

    public String getInsertion() {
        return insertion;
    }

    public Human getPartner() {
        return partner;
    }

    @Override
    public String getBodyCovering() {
        return bodyCovering;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getColour() {
        return colour;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    public void setUsesBirthControl(Boolean usesBirthControl) {
        this.usesBirthControl = usesBirthControl;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setInsertion(String insertion) {
        this.insertion = insertion;
    }

    public void setPartner(Human partner) {
        this.partner = partner;
    }

    @Override
    public void setBodyCovering(String bodyCovering) {
        this.bodyCovering = bodyCovering;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxNumberOfEggs() {
        return maxNumberOfEggs;
    }

    public void setMaxNumberOfEggs(int maxNumberOfEggs) {
        this.maxNumberOfEggs = maxNumberOfEggs;
    }

    @Override
    public ArrayList<General.Egg> giveBirth() {
  return this.getGender().giveBirth();    }

}
