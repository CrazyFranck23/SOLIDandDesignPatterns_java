package fr.esiea.tools.solid.orchestra_ex5;

public class Flute extends Woodwind implements Soprano {
    @Override
    void play() {
        System.out.print("Flute plays like an Instrument\r\n");
    }

    @Override
    public void playLikeASoprano() {
        System.out.print("Flute plays like a Soprano\r\n");
    }
}
