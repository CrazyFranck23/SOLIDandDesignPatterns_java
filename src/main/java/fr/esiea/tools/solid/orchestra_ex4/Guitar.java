package fr.esiea.tools.solid.orchestra_ex4;

public class Guitar extends Stringed implements Soloist {
    @Override
    void play() {
        System.out.print("Guitar plays like an Instrument\r\n");
    }

    @Override
    public void playLikeASoprano() {
        // Implementer le comportement pour jouer comme un Soprano
        System.out.print("Guitar cannot play like a Soprano\r\n");
    }

    @Override
    public void playLikeATenor() {
        // Implementer le comportement pour jouer comme un Tenor
        System.out.print("Guitar plays like a Tenor\r\n");
    }
}
