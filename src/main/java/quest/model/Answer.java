package quest.model;

import quest.model.database.TextContainer;


public class Answer {
    private final int id;
    private String answerText;
    private final TextContainer textContainer;

    public Answer(int id, TextContainer textContainer) {
        this.id = id;
        this.textContainer = textContainer;
    }

    public void getAnswerFromContainer() {
        this.answerText = textContainer.getAnswerDB().get(this.id);
    }

    public String getAnswerText() {
        return answerText;
    }
}
