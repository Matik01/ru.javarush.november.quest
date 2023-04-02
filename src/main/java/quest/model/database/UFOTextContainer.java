package quest.model.database;

import java.util.HashMap;

public class UFOTextContainer implements TextContainer{
    private final HashMap<Integer, String> textDB = new HashMap<Integer, String>() {
        {
            put(0, "Ты принял вызов.\n Поднимаешься на мостик к капитану?");
            put(1, "Ты отклонил вызов.\n Поражение");
            put(2, "Ты поднялся на мостик.\n Ты кто?");
            put(3, "Ты не пошёл на переговоры.\n Поражение");
            put(4, "Тебя вернули домой.\n Победа");
            put(5, "Твою ложь разоблачили.\n Поражение");
        }
    };
    private  final HashMap<Integer, String> answerDB = new HashMap<Integer, String>() {{
        put(0, "Подняться на мостик");
        put(1, "Отказаться подниматься на мостик");
        put(2, "Рассказать о себе правду");
        put(3, "Солгать о себе");
    }};

    @Override
    public  HashMap<Integer, String> getTextDB() {
        return textDB;
    }

    @Override
    public HashMap<Integer, String> getAnswerDB(){
        return answerDB;
    }
}
