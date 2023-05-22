package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static int ranNumb;

    public static final String AFFIRM_ANSWER = "yes";
    public static final String NEG_ANSWER = "no";
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static final int UP_LIMIT = 100;

    public static int getRanNumb() {
        return ranNumb;
    }
    public static void rulesGameEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    }
    public static void playEven() {
        String[][] questionAnswer = new String[STR_ARR][COL_ARR];
        rulesGameEven();
        for (int i = 0; i < STR_ARR; i++) {
            ranNumb = RandomClass.searchRanNumber(UP_LIMIT, 1);
            if (getRanNumb() % 2 == 0) {
                questionAnswer[i] = new String[]{Integer.toString(getRanNumb()), AFFIRM_ANSWER};
            } else {
                questionAnswer[i] = new String[]{Integer.toString(getRanNumb()), NEG_ANSWER};
            }
        }
        Engine.searchForAnswer(questionAnswer);
    }
}
