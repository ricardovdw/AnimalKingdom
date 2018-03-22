/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zoo;

import General.Animal;
import General.Egg;
import java.util.ArrayList;

public class Cage implements Comparable<Cage> {

    private ArrayList<Animal> cagedAnimals;
    private String cageType;

    public Cage(String cageType) {
        this.cageType = cageType;
        cagedAnimals = new ArrayList<>();
        Zoo.getInstance().addCage(this);
    }

    public Animal selectAnimal() {
        getCagedAnimals();
        return null;
    }

    public boolean addAnimal(Animal anAnimal) {
        return cagedAnimals.add(anAnimal);
    }

    public ArrayList<Animal> getCagedAnimals() {

        return cagedAnimals;
    }

    public void addReptileEggs(ArrayList<Egg> eggs) {
        for (Egg egg : eggs) {
            Animal r = egg.getEmbryo();
            Cage.this.addAnimal(r);
        }
    }

    public String getCageType() {
        return cageType;
    }

    public void setCageType(String cageType) {
        this.cageType = cageType;
    }

    @Override
    public int compareTo(Cage o) {
        return o.getCageType().compareTo(cageType);
    }

    public void setCagedAnimals(ArrayList<Animal> cagedAnimals) {
        this.cagedAnimals = cagedAnimals;
    }

}
