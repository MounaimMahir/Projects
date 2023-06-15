package be.intecbrussel.Opdracht2;

public abstract class Robot {
    private String unitName;

    public Robot() {
        this("nameless Robot");
    }

    public Robot(String unitName) {
        this.unitName = unitName;
        boot();
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public void boot(){
        System.out.println("booting up" + unitName);
    };

    public  String getUnitName() {
        return unitName;
    };
}
