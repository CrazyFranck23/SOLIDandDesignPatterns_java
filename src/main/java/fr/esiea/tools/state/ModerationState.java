package fr.esiea.tools.state;

class ModerationState implements DocumentState {
    @Override
    public void create(Document document) {
        // System.out.println("Document is already created.");
    }

    @Override
    public void review(Document document) {
        document.incrementReviewFailedCount();
        if (document.getReviewFailedCount() >= 2) {
            document.setState(new RemovedState());
        }
    }

    @Override
    public void publish(Document document) {
        // System.out.println("Publishing document. Transitioning to Published.");
        document.setState(new PublishedState());
    }

    @Override
    public String toString() {
        return "ModerationState";
    }
}

