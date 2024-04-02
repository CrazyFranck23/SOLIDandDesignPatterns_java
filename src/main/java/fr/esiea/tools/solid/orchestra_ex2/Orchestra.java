package fr.esiea.tools.solid.orchestra_ex2;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Instrument> instruments = new ArrayList<>();

    void tune(Instrument instrument) {
        instrument.play();
    }

    void tuneAll() {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
    }

    void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }
}
