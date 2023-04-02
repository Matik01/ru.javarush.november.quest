package quest.model;

import quest.model.database.fabric.UFOTextContainerFabric;
import quest.model.generator.AnswerGenerator;
import quest.model.generator.ScenarioGenerator;

import java.util.*;

public class UFOQuestOrigin extends AbstractQuestOrigin {

    public UFOQuestOrigin(AnswerGenerator answerGenerator, ScenarioGenerator scenarioGenerator) {
        super(answerGenerator, scenarioGenerator, new UFOTextContainerFabric().create());
    }

    @Override
    public void buildQuest() {
        scenarioGenerator.generate(storyList, textContainer);
        answerGenerator.generate(answerList, textContainer);
        storyList.get(0).getAnswerList().addAll(Arrays.asList(answerList.get(0), answerList.get(1)));
        storyList.get(2).getAnswerList().addAll(Arrays.asList(answerList.get(2), answerList.get(3)));
    }

    @Override
    public List<Story> getStoryList() {
        return storyList;
    }
}
