package quest.servlet;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class SessionDataTest {
    @Mock
    SessionData sessionData;
    @Test
    void getName() {
        String name = "name_example";
        Mockito.doReturn(name).when(sessionData).getName();
        assertEquals(name, sessionData.getName());
    }

    @Test
    void getRound() {
        int round = 2;
        Mockito.doReturn(round).when(sessionData).getRound();
        assertEquals(round, sessionData.getRound());
    }

    @Test
    void increaseRound() {
        SessionData sessionData = new SessionData("example_name");
        int round = sessionData.getRound();
        sessionData.increaseRound();
        assertEquals(++round, sessionData.getRound());
    }
}