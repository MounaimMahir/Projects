package be.intecbrussel.Opdracht1;

import java.util.Map;

public class Dog extends Animal {
    private boolean hasFoulBreath;

    public Dog() {
    }

    public Dog( boolean isClean, int age, String name, int animalNumber, boolean hasFoulBreath) {
        super(isClean,age,name,animalNumber);
        this.hasFoulBreath = hasFoulBreath;
    }

    public boolean isHasFoulBreath() {
        return hasFoulBreath;
    }

    public void setHasFoulBreath(boolean hasFoulBreath) {
        this.hasFoulBreath = hasFoulBreath;
    }

    @Override
    public void treatAnimal() {
        if (this.isClean()==false) {
            System.out.println("The dog clean"+getName() + isClean()); ;
        setClean(true);}


        if (hasFoulBreath){
            System.out.println(getName()+" the dog doesn't have foulbreath" );
            setHasFoulBreath(false);
        }



    }

    @Override
    public void vaccinateAnimal(Object o) {
        getIsVaccinated().put((Disease)o,true);
        System.out.println("The dog "+getName()+"is vaccinated"+o);


    }
}
