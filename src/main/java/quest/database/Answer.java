package quest.database;

import java.util.List;

public class Answer {
    private int id;
    private String answerText;

    public Answer(int id) {
        this.id = id;
        getAnswerFromContainer();
    }

    private void getAnswerFromContainer(){
        String text = StoryTextContainer.getAnswerDB().get(this.id);
        this.answerText = text;
    }

    public String getAnswerText() {
        return answerText;
    }
}
