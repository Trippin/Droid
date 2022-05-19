package droid;

/**
 *
 * @author John
 */
public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName) {
        name = droidName;
        batteryLevel = 100;
    }

    public void performTask(String task) {
        System.out.println(name + " is perofrmaing task: " + task);
        batteryLevel = batteryLevel - 10;
    }

    public void energyReport() {
        System.out.println(name + " Has a %" + batteryLevel + " battery level");
    }

    public String toSting() {
        return "Hello, I'm the droid: " + name;
    }

    public static void main(String[] args) {
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dance");
        codey.energyReport();
    }

}
