package quest.model.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import quest.model.database.TextContainer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class AnswerGeneratorTest {
    @Mock
    AnswerGenerator answerGenerator;
    @Mock
    List list;
    @Mock
    TextContainer textContainer;
    @Test
    void generate() {
        answerGenerator.generate(list, textContainer);
        Mockito.verify(answerGenerator).generate(list, textContainer);
    }
}