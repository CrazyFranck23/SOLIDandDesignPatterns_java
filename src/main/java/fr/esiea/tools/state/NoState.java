package fr.esiea.tools.state;

class NoState implements DocumentState {
    @Override
    public void create(Document document) {
        // System.out.println("Creating document. Transitioning to Draft.");
        document.setState(new DraftState());
    }

    @Override
    public void review(Document document) {
        // System.out.println("Document must be created first.");
    }

    @Override
    public void publish(Document document) {
        // System.out.println("Document must be created first.");
    }

    @Override
    public String toString() {
        return "NoState";
    }
}
