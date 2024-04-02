package fr.esiea.tools.solid.orchestra_ex1;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<Wind> winds = new ArrayList<>();
    private List<Percussion> percussions = new ArrayList<>();

    void tuneWind(Wind wind) {
        wind.play();
    }

    void tunePercussion(Percussion percussion) {
        percussion.play();
    }

    void tuneAll() {
        for (Wind wind : winds) {
            tuneWind(wind);
        }
        for (Percussion percussion : percussions) {
            tunePercussion(percussion);
        }
    }

    void addWind(Wind wind) {
        winds.add(wind);
    }

    void addPercussion(Percussion percussion) {
        percussions.add(percussion);
    }
}
