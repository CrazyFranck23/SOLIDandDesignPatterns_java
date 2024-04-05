package fr.esiea.tools.solid.orchestra_ex5;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Instrument> instruments = new ArrayList<>();
    private List<CanBePaused> pausedInstruments = new ArrayList<>();

    void tune(Instrument instrument) {
        instrument.play();
    }

    void tuneAll() {
        for (Instrument instrument : instruments) {
            tune(instrument);
        }
        for (CanBePaused instrument : pausedInstruments) {
            instrument.play();
        }
    }

    void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }

    public void tuneTenor(Tenor i) {
        i.playLikeATenor();
    }

    public void tuneSoprano(Soprano i) {
        i.playLikeASoprano();
    }

    public void addInstrumentThatCanBePaused(CanBePaused instrument) {
        pausedInstruments.add(instrument);
    }

    public void pauseInstruments() {
        for (CanBePaused instrument : pausedInstruments) {
            instrument.pause();
        }
    }

}