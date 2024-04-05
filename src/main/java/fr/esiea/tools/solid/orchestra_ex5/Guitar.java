package fr.esiea.tools.solid.orchestra_ex5;

public class Guitar extends Stringed implements Tenor {
    @Override
    void play() {
        System.out.print("Guitar plays like an Instrument\r\n");
    }

    @Override
    public void playLikeATenor() {
        // Implementer le comportement pour jouer comme un Tenor
        System.out.print("Guitar plays like a Tenor\r\n");
    }
}
