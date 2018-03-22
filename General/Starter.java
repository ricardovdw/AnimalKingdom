/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import Bird.Parrot;
import Mammals.Human;
import Reptiles.*;
import Zoo.*;

public class Starter {

    public static void main(String[] args) {
        Zoo instance = Zoo.getInstance();
        Animal cage = new Cage("parrot").selectAnimal();
        Snake an2 = new Snake("1234", "m", "Gray", 2, new Male());
        System.out.println("amount of snakes:  " + instance.getCageByRace(an2.getClass()).getCagedAnimals().size());
        Snake an1 = new Snake("44", "l", "Gra333y", 1, new Female());
        System.out.println("amount of snakes:  " + instance.getCageByRace(an2.getClass()).getCagedAnimals().size());
        Snake s3 = new Snake("", "", "", 0, new Male());
        Crocodile c1 = new Crocodile("", "", "", 1, new Male());

        Parrot b2 = new Parrot("Niffo", "sss", "test", 2, 4, new Male());
        Female female = (Female) an1.getGender();
        System.out.println(Zoo.getInstance().getCageByRace(Snake.class).getCagedAnimals());
        female.ovulate();
        an1.propagate(an2);
        an1.getGender().giveBirth();
        System.out.println(Zoo.getInstance().getCage());

        System.out.println(Zoo.getInstance().getCageByRace(Snake.class).getCagedAnimals());
        System.out.println(Zoo.getInstance().getAllAnimalsByRace(Parrot.class));
        Zoo.getInstance().getCageOfAnimals(an1).getCageType();
        System.out.println(Zoo.getInstance().getCageOfAnimals(an1).getCagedAnimals().size());
        System.out.println(an1.giveBirth());

        Parrot p = new Parrot("50", "p", "Gray", 10, 20, new Female());
        Human k = new Human(false, "m", "Gray", "lol", "asd", "asd", 10, 20, new Female());
        Human l = new Human(false, "m", "Gray", "lol", "asd", "asda", 10, 20, new Female());
        Human Danny = new Human(false, "50", "m", "Gray", "lol", "asd", 1, 10, new Male());
        Human Sam = new Human(false, "50", "m", "Gray", "lol", "asd", 10, 20, new Female());

        System.out.println(Danny.isMarried());
        System.out.println(Sam.isMarried());
        System.out.println("Sam is nu u wettige echtgenoot" + " " + Sam.mary(Danny));
        System.out.println(Danny.isMarried());
        System.out.println(Sam.isMarried());
        Danny.divorce();
        System.out.println(Danny.isMarried());
        System.out.println(Sam.isMarried());

        System.out.println(instance == null);

        System.out.println(p.communicate());
        System.out.println(p.fly());
        System.out.println("All Cages: " + instance.getCage().size());

        System.out.println(" Danny is getrouw met Sam" + " " + Danny.isMarried());

        an1.propagate(an2);
    }

}
