package be.intecbrussel.Opdracht1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static be.intecbrussel.Opdracht1.Disease.CHICKENPOCKS;

abstract class Animal implements Vaccinateable,Treatable{


    private Map<Disease, Boolean> isVaccinated;
    private boolean isClean;

    private int age;
    private String name;
    private int animalNumber;

    public Animal() {
        isVaccinated = new HashMap<>();
        Arrays.stream(Disease.values()).forEach(disease -> isVaccinated.put(disease,false));

    }

    public Animal(  boolean isClean, int age, String name, int animalNumber) {
        isVaccinated = new HashMap<>();
        Arrays.stream(Disease.values()).forEach(disease -> isVaccinated.put(disease,false));
        this.isVaccinated = isVaccinated;
        this.isClean = isClean;
        this.age = age;
        this.name = name;
        this.animalNumber = animalNumber;


    }

    public Map<Disease, Boolean> getIsVaccinated() {
        return isVaccinated;
    }

    public void setIsVaccinated(Map<Disease, Boolean> isVaccinated) {
        this.isVaccinated = isVaccinated;
    }

    public boolean isClean() {

        return isClean = true;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnimalNumber() {
        return animalNumber;
    }

    public void setAnimalNumber(int animalNumber) {
        this.animalNumber = animalNumber;
    }

    public void vaccinateAnimal(Disease disease){
        isVaccinated.replace(disease, true);


    }


    @Override
    public String toString() {
        return "Animal{" +
                "isVaccinated=" + isVaccinated +
                ", isClean=" + isClean +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", animalNumber=" + animalNumber +
                '}';
    }
}
