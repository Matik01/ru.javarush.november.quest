package quest.model.generator;

import quest.model.database.TextContainer;
import quest.model.Answer;

import java.util.List;

public class AnswerGenerator implements Generator{

    @Override
    public void generate(List list, TextContainer textContainer) {
        for (int i = 0; i < textContainer.getTextDB().size(); i++) {
            Answer answer = new Answer(i, textContainer);
            answer.getAnswerFromContainer();
            list.add(answer);
        }
    }
}
