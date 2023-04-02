package quest.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import quest.model.database.TextContainer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;

@ExtendWith(MockitoExtension.class)
class StoryTest {
    @Mock
    TextContainer textContainer;
    @Mock
    Story mock;

    @Test
    void getStoryText() {
        String text = "null";
        Mockito.doReturn(text).when(mock).getStoryText();
        assertEquals(text, mock.getStoryText());
    }

    @Test
    void getStoryFromContainer() {
        mock.getStoryFromContainer();
        Mockito.verify(mock).getStoryFromContainer();
    }

    @Test
    void getAnswerList() {
        Story story = new Story(1, textContainer);
        Class<? extends List> aClass = story.getAnswerList().getClass();
        assertEquals(ArrayList.class, aClass);
    }
}