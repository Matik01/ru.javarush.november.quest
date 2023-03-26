package quest.database;

import java.util.HashMap;

public class StoryTextContainer {
    private static final HashMap<Integer, String> textDB = new HashMap<Integer, String>() {
        {
            put(0, "lalalala");
            put(1, "lololololo");
            put(2, "keekekkeek");
            put(3, "gagagagagag");
        }
    };
    private static final HashMap<Integer, String> answerDB = new HashMap<Integer, String>() {{
        put(0, "kek");
        put(1, "dppdpdpd");
        put(2, "klalal");
        put(3, "afwafwd");
        put(4, "es;f;sefksjehiL");
        put(5, "es;f;mefjeabklkwjbkhkjnd");
    }};

    public static HashMap<Integer, String> getTextDB() {
        return textDB;
    }

    public static HashMap<Integer, String> getAnswerDB(){
        return answerDB;
    }
}
