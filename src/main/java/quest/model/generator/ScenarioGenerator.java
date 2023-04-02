package quest.model.generator;

import quest.model.database.TextContainer;
import quest.model.Story;

import java.util.List;

public class ScenarioGenerator implements Generator{
    @Override
    public void generate(List list, TextContainer textContainer) {
        for (int i = 0; i < textContainer.getTextDB().size(); i++) {
            Story story = new Story(i, textContainer);
            story.getStoryFromContainer();
            list.add(story);
        }
    }
}
