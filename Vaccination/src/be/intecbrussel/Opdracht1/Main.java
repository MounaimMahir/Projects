package be.intecbrussel.Opdracht1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat(true,12,"jackie",124,true);
        Cat cat2 = new Cat(false,8,"Johny",784,false);
        Cat cat3 = new Cat(true,4,"Booba",12,true);
        Dog dog1 = new Dog(true,4,"David",47,true);
        Dog dog2 = new Dog(false,8,"Patrick",14,false);
        Dog dog3 = new Dog(true,17,"Alpha",48,false);
        Monkey monkey1 = new Monkey(true,8,"Lola",78,true);
        Monkey monkey2 = new Monkey(false,19,"Dodo",45,false);
        Monkey monkey3 = new Monkey(false,11,"Jackson",15,true);
        Monkey monkey4 = new Monkey(true,11,"Florian",178,true);

        dog2.vaccinateAnimal(Disease.CHICKENPOCKS);
        cat2.vaccinateAnimal(Disease.POLIO);


        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.addAnimals(cat1);
        animalShelter.addAnimals(cat2);
        animalShelter.addAnimals(cat3);
        animalShelter.addAnimals(dog1);
        animalShelter.addAnimals(dog2);
        animalShelter.addAnimals(dog3);
        animalShelter.addAnimals(monkey1);
        animalShelter.addAnimals(monkey2);
        animalShelter.addAnimals(monkey3);
        animalShelter.addAnimals(monkey4);

        System.out.println(" All Animals ");
       animalShelter.printAnimals();
       System.out.println("-------------");
        System.out.println(" All sorted animals ");
       animalShelter.sortAnimals();
       animalShelter.printAnimals();
       System.out.println("-------------");
        System.out.println(" All animals sorted by name ");
       animalShelter.sortAnimalsByName();
        animalShelter.printAnimals(); // <--------------
        System.out.println("-----------");
        System.out.println(" All animals sorted by age ");
        animalShelter.sortAnimalsByAge();
        animalShelter.printAnimals();
        System.out.println("------------");
        System.out.println(" All animals not vaccinated for Chickenpocks ");
        animalShelter.printAnimalsNotVaccinated(Disease.CHICKENPOCKS);
        System.out.println("--------------------");

        System.out.println(" All animals not vaccinated for Polio ");
        animalShelter.printAnimalsNotVaccinated(Disease.POLIO);
        System.out.println("----------------");
        System.out.println(" Finding animal number ");
        animalShelter.findAnimal(12);
       System.out.println(animalShelter.findAnimal(12).getName());
        System.out.println("--------------------");
        System.out.println("Animals in shelter");
       animalShelter.printAnimals();
        System.out.println("-----------------");
        System.out.println("finding specific animal by age");
        animalShelter.findAnimal("Florian");
        System.out.println(animalShelter.findAnimal("Florian").getAge());
        System.out.println("------------------");
        System.out.println("Treating specific animal by his number");
        animalShelter.treatAnimal(14);
         System.out.println(animalShelter.findAnimal(14).isClean());
        System.out.println("----------------");
        System.out.println(" Treat animal by his name ");
       animalShelter.treatAnimal("David");
        System.out.println(animalShelter.findAnimal("David").isClean());
        System.out.println("-------------------");
        System.out.println("Treating all animals<");
           animalShelter.treatAllAnimals();
        System.out.println("--------------");
        System.out.println("finding oldest animal");
        animalShelter.findOldestAnimal();
        System.out.println(animalShelter.findOldestAnimal().getName());
        System.out.println("------------------");
        System.out.println("count all animals");
       animalShelter.countAnimals();
        System.out.println(animalShelter.countAnimals());
        System.out.println("---------------");
        System.out.println("Adding cat 4 " );
        Cat cat4 = new Cat(true,3,"Olivia",23,true);
        animalShelter.addAnimals(cat4);
        System.out.println(cat4);









    }
}
