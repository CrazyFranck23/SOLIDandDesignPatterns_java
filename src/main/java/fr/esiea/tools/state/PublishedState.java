package fr.esiea.tools.state;

class PublishedState implements DocumentState {
    @Override
    public void create(Document document) {
        // System.out.println("Document is already published.");
    }

    @Override
    public void review(Document document) {
        // System.out.println("Document is already published.");
    }

    @Override
    public void publish(Document document) {
        // System.out.println("Document is already published.");
    }

    @Override
    public String toString() {
        return "PublishedState";
    }
}
