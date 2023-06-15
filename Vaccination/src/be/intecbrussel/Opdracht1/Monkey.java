package be.intecbrussel.Opdracht1;

import java.util.Map;

public class Monkey extends Animal{
    private boolean isHyperActive;

    public Monkey() {
    }

    public Monkey(boolean isClean, int age, String name, int animalNumber, boolean isHyperActive) {
        super(isClean,age,name,animalNumber);
        this.isHyperActive = isHyperActive;
    }

    public boolean isHyperActive() {
        return isHyperActive;
    }

    public void setHyperActive(boolean hyperActive) {
        isHyperActive = hyperActive;
    }

    @Override
    public void treatAnimal() {
        if (this.isClean()==false) {
            System.out.println(" The monkey clean"+getName() + isClean()); ;
            setClean(true);}
        if (isHyperActive){
            System.out.println(getName()+" the monkey is not hyperactive" );
            setHyperActive(false);
        }
    }

    @Override
    public void vaccinateAnimal(Object o) {
        getIsVaccinated().put((Disease)o,true);
        System.out.println(" The monkey "+getName()+" is vaccinated"+o);

    }



}
