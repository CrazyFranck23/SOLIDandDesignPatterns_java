package fr.esiea.tools.state;

class DraftState implements DocumentState {
    @Override
    public void create(Document document) {
        // System.out.println("Document is already created.");
    }

    @Override
    public void review(Document document) {
        // System.out.println("Reviewing document. Transitioning to Moderation.");
        document.setState(new ModerationState());
    }

    @Override
    public void publish(Document document) {
        // System.out.println("Document must be reviewed before publishing.");
    }

    @Override
    public String toString() {
        return "DraftState";
    }
}
