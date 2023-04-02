package quest.model.database.fabric;

import org.junit.jupiter.api.Test;
import quest.model.database.TextContainer;
import quest.model.database.UFOTextContainer;

import static org.junit.jupiter.api.Assertions.*;

class UFOTextContainerFabricTest {
    TextContainerFabric textContainer = new UFOTextContainerFabric();
    @Test
    void create() {
        Class<? extends TextContainer> aClass = textContainer.create().getClass();
        assertEquals(UFOTextContainer.class, aClass);
    }
}