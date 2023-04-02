package quest.model;

import quest.model.database.TextContainer;

import java.util.ArrayList;
import java.util.List;

public class Story {
    private final Integer id;
    private String storyText;
    private final List<Answer> answerList = new ArrayList<>();
    private final TextContainer textContainer;

    public Story(Integer id, TextContainer textContainer) {
        this.id = id;
        this.textContainer = textContainer;
    }

    public String getStoryText() {
        return storyText;
    }

    public void getStoryFromContainer() {
        this.storyText = textContainer.getTextDB().get(this.id);
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }

}
