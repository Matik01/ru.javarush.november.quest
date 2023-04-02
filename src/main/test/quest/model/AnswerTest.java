package quest.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AnswerTest {
    @Mock
    Answer answer;
    @Test
    void getAnswerFromContainer() {
        answer.getAnswerFromContainer();
        Mockito.verify(answer).getAnswerFromContainer();
    }

    @Test
    void getAnswerText() {
        String text = "null";
        Mockito.doReturn(text).when(answer).getAnswerText();
        assertEquals(text, answer.getAnswerText());
        Mockito.verify(answer).getAnswerText();
    }

}