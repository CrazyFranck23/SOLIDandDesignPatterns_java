package fr.esiea.tools.solid.orchestra_ex5;

public class Violin extends Stringed implements Soprano {
    @Override
    void play() {
        System.out.print("Violin plays like an Instrument\r\n");
    }

    @Override
    public void playLikeASoprano() {
        System.out.print("Violin plays like a Soprano\r\n");
    }
}
