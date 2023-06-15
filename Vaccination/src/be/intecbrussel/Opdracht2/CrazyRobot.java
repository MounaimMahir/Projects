package be.intecbrussel.Opdracht2;

public class CrazyRobot extends Robot {

    public CrazyRobot() {
        super();
    }

    public CrazyRobot(String unitName) {
        super(unitName);
    }


    @Override
    public void boot() {
        StringBuilder name = new StringBuilder(getUnitName()).reverse();
        setUnitName(name.toString());
        System.out.println("boot" +getUnitName());

    }

    @Override
    public String toString() {
        return "CrazyRobot Johnson - "+getUnitName();
    }
}
