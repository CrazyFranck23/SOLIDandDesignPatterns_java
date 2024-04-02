package fr.esiea.tools.solid.orchestra_ex2;

import java.util.ArrayList;
import java.util.List;

public class Orchestra {
    private List<fr.esiea.tools.solid.orchestra_ex1.Wind> winds = new ArrayList<>();
    private List<fr.esiea.tools.solid.orchestra_ex1.Percussion> percussions = new ArrayList<>();

    void tuneWind(fr.esiea.tools.solid.orchestra_ex1.Wind wind) {
        wind.play();
    }

    void tunePercussion(fr.esiea.tools.solid.orchestra_ex1.Percussion percussion) {
        percussion.play();
    }

    void tuneAll() {
        for (fr.esiea.tools.solid.orchestra_ex1.Wind wind : winds) {
            tuneWind(wind);
        }
        for (fr.esiea.tools.solid.orchestra_ex1.Percussion percussion : percussions) {
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
