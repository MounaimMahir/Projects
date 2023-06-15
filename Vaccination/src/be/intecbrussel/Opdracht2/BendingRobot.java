package be.intecbrussel.Opdracht2;

public class BendingRobot extends Robot{

    private double maxBendAngle;

    public BendingRobot(String unitName, double maxBendAngle) {
        super(unitName);
        this.maxBendAngle = maxBendAngle;
    }

    public double getMaxBendAngle() {
        return maxBendAngle;
    }

    public void setMaxBendAngle(double maxBendAngle) {
        this.maxBendAngle = maxBendAngle;
    }

    public void bend(double bendAngle){
        if (bendAngle > maxBendAngle|| 360==0){
            System.out.println("Can't bend " + bendAngle +" is grater than 360");
        }else {
            System.out.println("Bending " + bendAngle+" is succesfull ");
        }

    }


    @Override
    public void boot() {

    }

    @Override
    public String getUnitName() {
        return null;
    }

    @Override
    public String toString() {
        return "BendingRobot Jackie {" +
                "maxBendAngle=" + maxBendAngle +
                '}';
    }
}
