package fr.esiea.tools.solid.orchestra_ex3;

public class Violin extends Stringed implements Soloist {
    @Override
    void play() {
        System.out.print("Violin plays like an Instrument\r\n");
    }

    @Override
    public void playLikeASoprano() {
        System.out.print("Violin plays like a Soprano\r\n");
    }

    @Override
    public void playLikeATenor() {
        System.out.print("Violin cannot play like a Tenor\r\n");
    }
}
