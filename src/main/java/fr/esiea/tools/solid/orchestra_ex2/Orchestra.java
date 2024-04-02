package fr.esiea.tools.solid.orchestra_ex2;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Wind> winds = new ArrayList<>();
    private List<Percussion> percussions = new ArrayList<>();
    private List<Instrument> instruments = new ArrayList<>();

    void tuneWind(Wind wind) {
        wind.play();
    }

    void tunePercussion(Percussion percussion) {
        percussion.play();
    }

    void tuneInstrument(Instrument instrument) {
        instrument.play();
    }

    void tuneAll() {
        for (Wind wind : winds) {
            tuneWind(wind);
        }
        for (Percussion percussion : percussions) {
            tunePercussion(percussion);
        }

        for (Instrument instrument : instruments) {
            tuneInstrument(instrument);
        }
    }

    void addWind(Wind wind) {
        winds.add(wind);
    }

    void addPercussion(Percussion percussion) {
        percussions.add(percussion);
    }

    void addInstrument(Instrument instrument) {
        instruments.add(instrument);
    }
}
