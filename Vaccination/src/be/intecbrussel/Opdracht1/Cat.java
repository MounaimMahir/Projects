package be.intecbrussel.Opdracht1;

import java.util.Map;

public class Cat extends Animal {
    private boolean hasLongNails;

    public Cat() {
    }

    public Cat( boolean isClean, int age, String name, int animalNumber, boolean hasLongNails) {
        super(isClean,age,name,animalNumber);
        this.hasLongNails = hasLongNails;
    }

    public boolean isHasLongNails() {
        return hasLongNails;
    }


    public void setHasLongNails(boolean hasLongNails) {
        this.hasLongNails = hasLongNails;
    }


    @Override
    public void treatAnimal() {
        if (this.isClean()==false) {
            System.out.println("The cat clean"+getName() + isClean()); ;
            setClean(true);}
        if (hasLongNails){
            System.out.println( getName()+ " the cat doesn't have longNails" );
            setHasLongNails(false);
        }
    }

    @Override
    public void vaccinateAnimal(Object o) {
        getIsVaccinated().put((Disease)o,true);
        System.out.println("The cat "+getName()+"is vaccinated"+o);

    }
}
