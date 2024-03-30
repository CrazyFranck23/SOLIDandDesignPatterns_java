package fr.esiea.tools.state;

public interface DocumentState {
    void create(Document document);
    void review(Document document);
    void publish(Document document);
}
