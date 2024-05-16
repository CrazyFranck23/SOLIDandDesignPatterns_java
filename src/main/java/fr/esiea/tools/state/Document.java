package fr.esiea.tools.state;

public class Document {
    private DocumentState state;
    private int reviewFailedCount;

    public Document() {
        this.state = new NoState();
        this.reviewFailedCount = 0;
    }

    public void setState(DocumentState state) {
        this.state = state;
    }

    public DocumentState getState() {
        return state;
    }

    public int getReviewFailedCount() {
        return reviewFailedCount;
    }

    public void incrementReviewFailedCount() {
        this.reviewFailedCount++;
    }

    public void createDocument() {
        state.create(this);
    }

    public void reviewDocument() {
        state.review(this);
    }

    public void publishDocument() {
        state.publish(this);
    }

    @Override
    public String toString() {
        return state.toString();
    }
}

