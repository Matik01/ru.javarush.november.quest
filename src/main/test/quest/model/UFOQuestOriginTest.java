package quest.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class UFOQuestOriginTest {
    @Mock
    UFOQuestOrigin ufoQuestOrigin;
    @Test
    void buildQuest() {
        ufoQuestOrigin.buildQuest();
        Mockito.verify(ufoQuestOrigin, Mockito.times(1)).buildQuest();
    }

    @Test
    void getStoryList() {
        Class<? extends List> aClass = ufoQuestOrigin.getStoryList().getClass();
        assertEquals(LinkedList.class, aClass);
    }
}