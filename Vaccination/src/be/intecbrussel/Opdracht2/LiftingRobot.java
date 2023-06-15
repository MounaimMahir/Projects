package be.intecbrussel.Opdracht2;

public class LiftingRobot extends Robot {

    private double maxLiftHeight;

    public LiftingRobot(String unitName, double maxLiftingHeight) {
        super(unitName);
        this.maxLiftHeight = maxLiftingHeight;
    }

    public double getMaxLiftHeight() {
        return maxLiftHeight;
    }

    public void setMaxLiftHeight(double maxLiftHeight) {
        this.maxLiftHeight = maxLiftHeight;
    }

    public void life(double height){
        if ( height > maxLiftHeight || height < 0){
            System.out.println("lifting not possible, height is to high = " + height);
        } else {
            System.out.println("lifting succesfull  = " +height);
        }
    }

    @Override
    public void boot() {

    }



    @Override
    public String toString() {
        return " LiftingRobot Bob {" + super.getUnitName()+
                "maxLiftHeight = " + maxLiftHeight +
                '}';
    }
}
