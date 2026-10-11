package facade.subsystem;

public class TheaterLights {
    public void dim(int level) {
        System.out.println("Theater Lights dimming to " + level + "%");
    }

    public void on() {
        System.out.println("Theater Lights are ON (100%)");
    }
}