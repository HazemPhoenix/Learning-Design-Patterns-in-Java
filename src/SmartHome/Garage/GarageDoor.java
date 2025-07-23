package SmartHome.Garage;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.printf("%s garage door is open\n", name);
    }

    public void down(){
        System.out.printf("%s garage door is closed\n", name);
    }
}
