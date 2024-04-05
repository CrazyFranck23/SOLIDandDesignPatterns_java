package fr.esiea.tools.solid.orchestra_ex5;

public class Brass extends Wind implements CanBePaused {
    @Override
    public void play() {
        System.out.print("Brass.play()\r\n");
    }

    @Override
    public void pause() {
        System.out.print("Brass.pause()\r\n");
    }
}
