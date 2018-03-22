package Zoo;

import General.Animal;
import General.Egg;
import java.util.ArrayList;
import java.util.TreeSet;

public class Zoo {

    private static Zoo instance = null;
    private TreeSet<Cage> cages = new TreeSet<>();

    private String name;

    private Zoo() {
        this.name = "ANimal konjdom klaas";
    }

    public static Zoo getInstance() {
        if (instance == null) {
            instance = new Zoo();
        }
        return instance;
    }

    public boolean addAnimal(Animal anAnimal) {
        Cage cageOfAnimals = getCageOfAnimals(anAnimal);
        if (cageOfAnimals == null) {
            Cage cage = new Cage(anAnimal.getClass().getSimpleName());
            cage.addAnimal(anAnimal);
        } else {
            cageOfAnimals.addAnimal(anAnimal);
        }
        return true;
    }

    public boolean addCage(Cage cage) {

        return cages.add(cage);
    }

    public Cage getCageOfAnimals(Animal anAnimal) {

        return getCageByRace(anAnimal.getClass());
    }

    public TreeSet<Cage> getCagesBySpeciesOfAnimal(Animal anAnimal) {
        return null;

    }

    public TreeSet<Cage> getCagesBySpecies(Class<? extends Animal> species) {

        return null;

    }

    public Cage getCageByRace(Class<? extends Animal> Race) {
        for (Cage cage : cages) {
            if (cage.getCageType().equals(Race.getSimpleName())) {
                return cage;
            }

        }
        return null;
    }

    public ArrayList<Animal> getAllAnimalsByRace(Class<? extends Animal> race) {
        return getCageByRace(race).getCagedAnimals();

    }

    public ArrayList<Animal> getAllAnimalsBySpecies(Class<? extends Animal> species) {
        cages = getCagesBySpecies(species);
        for (Cage cage : cages) {
            ArrayList<Animal> animalsOfCage = cage.getCagedAnimals();

        }
        return null;
    }

    public ArrayList<Animal> getAllAnimals() {

        return null;

    }

    public void addEggsOfReptiles(ArrayList<Egg> eggs) {
        Cage reptileCage = getCageByRace(eggs.get(0).getEmbryo().getClass());
    }

    public TreeSet<Cage> getCage() {
        return cages;
    }

    public void setCage(TreeSet<Cage> Cage) {
        this.cages = Cage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
