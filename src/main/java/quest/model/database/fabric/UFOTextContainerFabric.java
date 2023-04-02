package quest.model.database.fabric;

import quest.model.database.TextContainer;
import quest.model.database.UFOTextContainer;

public class UFOTextContainerFabric extends TextContainerFabric{
    @Override
    public TextContainer create() {
        return new UFOTextContainer();
    }
}
