package SmartHome.Stereos;


public class Stereo {
    private int volume;
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.printf("%s stereo is on!\n", name);
    }

    public void off() {
        System.out.printf("%s stereo is off!\n", name);
    }

    public void setCD() {
        System.out.println("Inserting CD...");
    }

    public void setDVD() {
        System.out.println("Inserting DVD...");
    }

    public void setRadio() {
        System.out.println("Selecting the radio station");
    }

    public void setVolume(int volume) {
        System.out.printf("Setting volume to %d\n", volume);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }
}
