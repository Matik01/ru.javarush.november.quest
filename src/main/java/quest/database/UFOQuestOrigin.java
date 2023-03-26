package quest.database;

import java.util.*;

public class UFOQuestOrigin implements QuestOrigin {
    private final List<Story> storyList = new ArrayList<>();
    private final List<Answer> answerList = new ArrayList<>();

    @Override
    public void scenarioGenerator() {
        for (int i = 0; i < 4; i++) {
            Story story = new Story(i);
            storyList.add(story);
        }
    }

    @Override
    public void answersGenerator() {
        for (int i = 0; i < 6; i++) {
            Answer answer = new Answer(i);
            answerList.add(answer);
        }
    }

    @Override
    public void buildQuest() {
        storyList.get(0).getAnswerList().addAll(Arrays.asList(answerList.get(0), answerList.get(1)));
        storyList.get(1).getAnswerList().add(answerList.get(2));
        storyList.get(2).getAnswerList().addAll(Arrays.asList(answerList.get(3), answerList.get(4)));
        storyList.get(3).getAnswerList().add(answerList.get(5));
    }

    public List<Story> getStoryList() {
        return storyList;
    }
    
}
