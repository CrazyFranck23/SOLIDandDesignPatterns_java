package fr.esiea.tools.singleton;

public enum Level {
    ERROR("ERROR"),
    WARNING("WARNING"),
    INFO("INFO"),
    DEBUG("DEBUG");

    private final String levelValue;

    Level (String levelValue) {
        this.levelValue = levelValue;
    }

    public String getLevelValue() {
        return levelValue;
    }

    @Override
    public String toString() {
        return this.levelValue;
    }
}
