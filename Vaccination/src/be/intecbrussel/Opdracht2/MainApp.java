package be.intecbrussel.Opdracht2;

public class MainApp {
    public static void main(String[] args) {
        LiftingRobot liftingRobot = new LiftingRobot("Bob",52);
        BendingRobot bendingRobot = new BendingRobot("Jackie",360);
        CrazyRobot crazyRobot = new CrazyRobot("Johnson");
        System.out.println("------------");

        bendingRobot.bend(400);
        bendingRobot.bend(20);

        System.out.println("--------------");

       // liftingRobot.setMaxLiftHeight(400);
        liftingRobot.life(150);
        liftingRobot.life(40);

        System.out.println("------------");





        System.out.println(crazyRobot);

        System.out.println("-----------------");

        System.out.println(bendingRobot);
        System.out.println(liftingRobot);
        System.out.println(crazyRobot);
    }
}
