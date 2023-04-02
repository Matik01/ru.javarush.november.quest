package quest.model.generator;

import quest.model.database.TextContainer;

import java.util.List;

public interface Generator<T> {
    void generate(List<T> list, TextContainer textContainer);
}
