package quest.model;

import quest.model.database.TextContainer;
import quest.model.generator.AnswerGenerator;
import quest.model.generator.ScenarioGenerator;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractQuestOrigin {
    protected TextContainer textContainer;
    protected AnswerGenerator answerGenerator;
    protected ScenarioGenerator scenarioGenerator;
    protected final List<Story> storyList = new ArrayList<>();
    protected final List<Answer> answerList = new ArrayList<>();

    public AbstractQuestOrigin(AnswerGenerator answerGenerator, ScenarioGenerator scenarioGenerator, TextContainer textContainer) {
        this.answerGenerator = answerGenerator;
        this.scenarioGenerator = scenarioGenerator;
        this.textContainer = textContainer;
    }

    public abstract void buildQuest();

    public abstract List<Story> getStoryList();
}
