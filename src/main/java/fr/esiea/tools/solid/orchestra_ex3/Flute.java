package fr.esiea.tools.solid.orchestra_ex3;

public class Flute extends Woodwind implements Soloist {
    @Override
    void play() {
        System.out.print("Flute plays like an Instrument\r\n");
    }

    @Override
    public void playLikeASoprano() {
        System.out.print("Flute plays like a Soprano\r\n");
    }

    @Override
    public void playLikeATenor() {
        System.out.print("Flute cannot play like a Tenor\r\n");
    }
}
