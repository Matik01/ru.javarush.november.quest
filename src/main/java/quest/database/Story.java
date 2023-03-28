package quest.database;

import java.util.ArrayList;
import java.util.List;

public class Story {
    private Integer id;
    private String storyText;
    private List<Answer> answerList = new ArrayList<>();

    public Story(Integer id) {
        this.id = id;
        getStoryFromContainer();
    }

    public boolean isRestartable(){
        return answerList.isEmpty();
    }
    public String getStoryText() {
        return storyText;
    }

    private void getStoryFromContainer(){
        String text = StoryTextContainer.getTextDB().get(this.id);
        this.storyText = text;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }
}
