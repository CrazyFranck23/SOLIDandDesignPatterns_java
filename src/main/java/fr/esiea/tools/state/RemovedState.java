package fr.esiea.tools.state;

class RemovedState implements DocumentState {
    @Override
    public void create(Document document) {
        // System.out.println("Document is removed and cannot be recreated.");
    }

    @Override
    public void review(Document document) {
        // System.out.println("Document is removed and cannot be reviewed.");
    }

    @Override
    public void publish(Document document) {
        // System.out.println("Document is removed and cannot be published.");
    }

    @Override
    public String toString() {
        return "RemovedState";
    }
}
