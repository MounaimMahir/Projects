package be.intecbrussel.Opdracht1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class AnimalShelter {
    private List<Animal> animals =new ArrayList<>();
    private int animalId;


    public AnimalShelter() {
        animalId = 1;
    }



    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        this.animalId = animalId;
    }

    public void printAnimals() {
        animals.forEach(System.out::println);

    }

    public void sortAnimals() {

        animals = animals.stream().sorted(Comparator.comparingInt(Animal::getAnimalNumber)).collect(Collectors.toList());
    }

    public void sortAnimalsByName() {
       // animals.sort(Comparator.comparing(Animal::getName))
        animals = animals.stream().sorted(Comparator.comparing(Animal::getName)).collect(Collectors.toList());

    }

    public void sortAnimalsByAge() {
                animals = animals.stream()
               .sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());

    }

    public void printAnimalsNotVaccinated(Disease disease) {
        animals.stream()
                .filter(animal -> !animal.getIsVaccinated().get(disease))
                .forEach(System.out::println);

    }//findAnimal(animalNumber : int) : Animal

    public Animal findAnimal(int animalNumber) {

       return   animals.stream().filter(animal -> animal.getAnimalNumber() == animalNumber).findFirst().orElse(null);

    }

    public Animal findAnimal(String name) {
        return animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).findFirst().orElse(null);

    }

    public void treatAnimal(int animalNumber) {


        animals.stream().filter(animal -> animal.getAnimalNumber()==animalNumber).findFirst().ifPresent(Animal::treatAnimal);



    }

    public void treatAnimal(String name) {
        Optional<Animal> searchAnimal = Optional.ofNullable(findAnimal(name));
        searchAnimal.ifPresent(Treatable::treatAnimal);

    }

    public void treatAllAnimals() {
        animals.forEach(Animal::treatAnimal);

    }

    public Animal findOldestAnimal() {
        return animals
                .stream()
                .max(Comparator.comparing(Animal::getAge))
                .orElse(null);
    }

    public int countAnimals() {
        return animals.size();
    }

    //return  animals.stream().filter(animal -> animal.getName().equalsIgnoreCase(name)).findFirst();
    public void addAnimals(Animal animal) {
       // animal.setAnimalNumber(animalId++);
//        animal.setName(animal.getName());
        animalId= animal.getAnimalNumber();
        animal.setAnimalNumber(animalId);
        animals.add(animal);
        animalId++;

    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "animals=" + animals +
                ", animalId=" + animalId +
                '}';
    }
}
