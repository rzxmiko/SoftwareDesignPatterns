package facade;

import facade.subsystem.Amplifier;
import facade.subsystem.PopcornPopper;
import facade.subsystem.Projector;
import facade.subsystem.TheaterLights;

public class Main {
    public static void main(String[] args) {
        PopcornPopper popper = new PopcornPopper();
        TheaterLights lights = new TheaterLights();
        Projector projector = new Projector();
        Amplifier amp = new Amplifier();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(popper, lights, projector, amp);

        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}