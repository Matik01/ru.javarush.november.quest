package quest.database;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class UFOQuestOrigin implements QuestOrigin {
    private final List<Story> storyList = new ArrayList<>();
    private final List<Answer> answerList = new ArrayList<>();
    // private final ConcurrentLinkedQueue<Story> storyQueue = new ConcurrentLinkedQueue<>();

    @Override
    public void scenarioGenerator() {
        for (int i = 0; i < StoryTextContainer.getTextDB().size(); i++) {
            Story story = new Story(i);
            storyList.add(story);
        }
    }

    @Override
    public void answersGenerator() {
        for (int i = 0; i < StoryTextContainer.getAnswerDB().size(); i++) {
            Answer answer = new Answer(i);
            answerList.add(answer);
        }
    }

    @Override
    public void buildQuest() {
        storyList.get(0).getAnswerList().addAll(Arrays.asList(answerList.get(0), answerList.get(1)));
        storyList.get(2).getAnswerList().addAll(Arrays.asList(answerList.get(2), answerList.get(3)));
    }

    public List<Story> getStoryList() {
        return storyList;
    }
}
