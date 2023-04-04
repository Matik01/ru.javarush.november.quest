package quest.servlet;

public class SessionData {
    private int round = 0;
    private String name;

    public SessionData(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRound() {
        return round;
    }

    public void increaseRound() {
        round++;
    }
}
