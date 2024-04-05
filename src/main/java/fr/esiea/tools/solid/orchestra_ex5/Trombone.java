package fr.esiea.tools.solid.orchestra_ex5;

public class Trombone extends Brass implements Tenor {
    @Override
    public void play() {
        System.out.print("Trombone plays like an Instrument\r\n");
    }

    @Override
    public void playLikeATenor() {
        System.out.print("Trombone plays like a Tenor\r\n");
    }
}
