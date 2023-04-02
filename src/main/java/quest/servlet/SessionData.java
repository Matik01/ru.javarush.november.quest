package quest.servlet;

public class SessionData {
    public static int round = 0;
    private static String name;

    public SessionData(String name){
        this.name = name;
    }
    public static String getName() {
        return name;
    }

    public static int getRound() {
        return round;
    }
}
