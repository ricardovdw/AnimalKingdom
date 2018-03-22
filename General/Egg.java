package General;

import Bird.Parrot;
import Bird.Pinguin;
import Mammals.AfricanElephant;
import Mammals.AsianElephant;
import Mammals.GrayMouse;
import Mammals.Human;
import Mammals.WhiteMouse;
import Reptiles.Crocodile;
import Reptiles.Snake;
import Special.Platypus;
import java.util.Random;

public class Egg {

    private Animal embryo;

    public Egg() {
    }

    public boolean isInseminated() {

        return embryo != null;
    }

    public void Inseminate(Animal parent1, Animal parent2) {
        String i = parent1.getClass().getSimpleName();
        Random r = new Random();

        boolean eigenschappen = r.nextBoolean();
        switch (i) {
            case "AfricanElephant":
                if (eigenschappen) {
                    AfricanElephant a = (AfricanElephant) parent1;
                    embryo = new AfricanElephant(a.getEarSize(), a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(),  a.getGender());

                } else {

                    AfricanElephant b = (AfricanElephant) parent2;
                    embryo = new AfricanElephant(b.getEarSize(), b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(),  b.getGender());
                }

                break;

            case "AsianElephant ":

                if (eigenschappen) {

                    AsianElephant a = (AsianElephant) parent1;

                    embryo = new AsianElephant(a.getEarSize(), a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(),  a.getGender());

                } else {

                    AsianElephant b = (AsianElephant) parent2;
                    embryo = new AsianElephant(b.getEarSize(), b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(), b.getGender());

                }

                break;
            case "GrayMouse":

                if (eigenschappen) {

                    GrayMouse a = (GrayMouse) parent1;

                    embryo = new GrayMouse(a.getBodyCovering(), a.randomName(),  a.getWeight(),  a.getGender());
                } else {
                    GrayMouse b = (GrayMouse) parent2;
                    embryo = new GrayMouse(b.getBodyCovering(), b.randomName(),  b.getWeight(),  b.getGender());

                }

                break;
            case "Human":

                if (eigenschappen) {

                    Human a = (Human) parent1;

                    embryo = new Human(a.getUsesBirthControl(), a.getLastName(), a.getInsertion(), a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(), a.getMaxNumberOfEggs(), a.getGender());
// improve YES SHER
                } else {
                    Human b = (Human) parent1;

                    embryo = new Human(b.getUsesBirthControl(), b.getLastName(), b.getInsertion(), b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(), b.getMaxNumberOfEggs(), b.getGender());

                }

                break;
            case "WhiteMouse":

                if (eigenschappen) {

                    WhiteMouse a = (WhiteMouse) parent1;

                    embryo = new WhiteMouse(a.getBodyCovering(), a.randomName(),  a.getWeight(),  a.getGender());
                } else {
                    WhiteMouse b = (WhiteMouse) parent2;
                    embryo = new WhiteMouse(b.getBodyCovering(), b.randomName(), b.getWeight(), b.getGender());

                }

                break;
            case "Crocodile":

                if (eigenschappen) {
                    Crocodile a = (Crocodile) parent1;
                    embryo = new Crocodile(a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(),  a.getGender());

                } else {
                    Crocodile b = (Crocodile) parent2;
                    embryo = new Crocodile(b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(),  b.getGender());
                }

                break;
            case "Snake":

                if (eigenschappen) {
                    embryo = new Snake(parent1.getBodyCovering(), parent1.randomName(), parent1.getColour(), parent1.getWeight(),parent1.getGender());

                } else {
                    Snake b = (Snake) parent2;
                    embryo = new Snake(b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(), b.getGender());

                }

                break;
            case "Platypus":

                if (eigenschappen) {
                    Platypus a = (Platypus) parent1;
                    embryo = new Platypus(a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(),  a.getGender());

                } else {
                    Platypus b = (Platypus) parent2;
                    embryo = new Platypus(b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(),  b.getGender());

                }

                break;
            case "Parrot":

                if (eigenschappen) {
                    Parrot a = (Parrot) parent1;
                    embryo = new Parrot(a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(), a.getMaxNumberOfEggs(), a.getGender());
                } else {
                    Parrot b = (Parrot) parent2;
                    embryo = new Parrot(b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(), b.getMaxNumberOfEggs(), b.getGender());

                }

                break;

            case "Pinguin":

                if (eigenschappen) {
                    Pinguin a = (Pinguin) parent1;
                    embryo = new Pinguin(a.getBodyCovering(), a.randomName(), a.getColour(), a.getWeight(), a.getMaxNumberOfEggs(), a.getGender());
                } else {
                    Pinguin b = (Pinguin) parent2;
                    embryo = new Pinguin(b.getBodyCovering(), b.randomName(), b.getColour(), b.getWeight(), b.getMaxNumberOfEggs(), b.getGender());

                }

                break;
            default:
                System.out.println("dit is geen dier ");
        }

    }

    public Animal getEmbryo() {
        return embryo;
    }

    public void setEmbryo(Animal embryo) {
        this.embryo = embryo;
    }
}
