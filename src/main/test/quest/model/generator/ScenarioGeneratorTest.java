package quest.model.generator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import quest.model.database.TextContainer;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class ScenarioGeneratorTest {
    @Mock
    ScenarioGenerator scenarioGenerator;
    @Mock
    List list;
    @Mock
    TextContainer textContainer;
    @Test
    void generate() {
        scenarioGenerator.generate(list, textContainer);
        Mockito.verify(scenarioGenerator).generate(list, textContainer);
    }
}