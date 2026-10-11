package facade;

import facade.subsystem.Amplifier;
import facade.subsystem.PopcornPopper;
import facade.subsystem.Projector;
import facade.subsystem.TheaterLights;

public class HomeTheaterFacade {
    private final PopcornPopper popper;
    private final TheaterLights lights;
    private final Projector projector;
    private final Amplifier amp;

    public HomeTheaterFacade(PopcornPopper popper, TheaterLights lights, Projector projector, Amplifier amp) {
        this.popper = popper;
        this.lights = lights;
        this.projector = projector;
        this.amp = amp;
    }

    public void watchMovie(String movie) {
        System.out.println("=== Get ready to watch a movie: " + movie + " ===");
        popper.on();
        popper.pop();
        lights.dim(10);
        projector.on();
        projector.setInput("DVD / HDMI 1");
        amp.on();
        amp.setVolume(7);
        System.out.println("=== Movie " + movie + " has started ===");
    }

    public void endMovie() {
        System.out.println("\n=== Shutting movie theater down... ===");
        popper.off();
        lights.on();
        projector.off();
        amp.off();
        System.out.println("=== Movie theater is OFF ===");
    }
}