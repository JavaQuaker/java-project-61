package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.RandomClass;

public final class Even {

    public static final String AFFIRM_ANSWER = "yes";
    public static final String NEG_ANSWER = "no";
    public static final int UP_LIMIT = 100;

    public static void playEven() {
        String[][] questionAnswer = new String[Engine.STR_ARR][Engine.COL_ARR];
        for (int i = 0; i < Engine.STR_ARR; i++) {
            int ranNumb = RandomClass.searchRanNumber(UP_LIMIT, 1);
            if (ranNumb % 2 == 0) {
                questionAnswer[i] = new String[]{Integer.toString(ranNumb), AFFIRM_ANSWER};
            } else {
                questionAnswer[i] = new String[]{Integer.toString(ranNumb), NEG_ANSWER};
            }
        }
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.searchForAnswer(rules, questionAnswer);
    }
}
