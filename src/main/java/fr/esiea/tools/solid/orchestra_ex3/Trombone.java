package fr.esiea.tools.solid.orchestra_ex3;

public class Trombone extends Brass implements Soloist {
    @Override
    void play() {
        System.out.print("Trombone plays like an Instrument\r\n");
    }

    @Override
    public void playLikeASoprano() {
        System.out.print("Trombone cannot play like a Soprano\r\n");
    }

    @Override
    public void playLikeATenor() {
        System.out.print("Trombone plays like a Tenor\r\n");
    }
}
