/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Zoo.Zoo;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Gebruiker
 */
public abstract class Animal {

    protected String bodyCovering;
    protected String name;
    protected String colour;
    protected int weight;
    protected int maxNumberOfEggs;
    private Gender gender;

    public Animal(String bodyCovering, String name, String colour, int weight, int maxNumberOfEggs, Gender gender) {
        this.bodyCovering = bodyCovering;
        this.name = name;
        this.colour = colour;
        this.weight = weight;
        this.maxNumberOfEggs = maxNumberOfEggs;
        this.gender = gender;
        gender.setGenderOwner(this);
        Zoo.getInstance().addAnimal(this);

    }

    public abstract String communicate();

    public void propagate(Animal partner) {
        if (this.getClass().equals(partner.getClass())) {
            gender.propagate(this, partner);
        }
    }

    public String randomName() {
        String[] names = {"Danny", "Levi", "Lloyd", "Andre", "Martin", "Sher"};
        return names[new Random().nextInt(names.length)];
    }

    public boolean isPregnant() {
        return gender.isPregnant();
    }

    public ArrayList<Egg> giveBirth() {
        return gender.giveBirth();
    }

    public boolean isFemale() {
        return gender.isFemale();
    }

    public String getBodyCovering() {
        return bodyCovering;
    }

    public void setBodyCovering(String bodyCovering) {
        this.bodyCovering = bodyCovering;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxNumberOfEggs() {
        return maxNumberOfEggs;
    }

    public void setMaxNumberOfEggs(int maxNumberOfEggs) {
        this.maxNumberOfEggs = maxNumberOfEggs;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

}
