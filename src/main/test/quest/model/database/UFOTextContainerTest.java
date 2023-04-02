package quest.model.database;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UFOTextContainerTest {
    UFOTextContainer ufoTextContainer = new UFOTextContainer();
    @Test
    void getTextDB() {
        int size = ufoTextContainer.getTextDB().size();
        assertEquals(6, size);
    }

    @Test
    void getAnswerDB() {
        int size = ufoTextContainer.getAnswerDB().size();
        assertEquals(4, size);
    }
}