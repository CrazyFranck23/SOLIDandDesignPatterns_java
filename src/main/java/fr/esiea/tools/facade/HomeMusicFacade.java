package fr.esiea.tools.facade;

public class HomeMusicFacade {

    private CdPlayer cd;
    private TheaterLights lights;
    private Amplifier amp;

    public HomeMusicFacade(CdPlayer cd, TheaterLights lights, Amplifier amp) {
        this.cd = cd;
        this.lights = lights;
        this.amp = amp;
    }

    public void listenCD(String title) {
        System.out.println("Get ready to listen to " + title);
        lights.dim(10);
        amp.on();
        amp.setVolume(5);
        amp.setSurroundSound();
        cd.on();
        cd.play(title);
        cd.play(0);
        cd.play(1);
        cd.play(2);
        cd.play(3);
        cd.play(4);
    }
    public void stopCD() {
        System.out.println("Stop listening to CD");
        cd.stop();
        cd.eject();
        cd.off();
        amp.setVolume(0);
        amp.off();
        lights.on();
    }
}
