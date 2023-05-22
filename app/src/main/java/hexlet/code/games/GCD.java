package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.RandomClass;

public final class GCD {
    public static final int UP_LIMIT = 100;
    public static void formatGCD() {
        String[][] questionAnswer = new String[Engine.STR_ARR][Engine.COL_ARR];
        for (int i = 0; i < Engine.STR_ARR; i++) {
            int ranNumb1 = RandomClass.searchRanNumber(UP_LIMIT, 1);
            int ranNumb2 = RandomClass.searchRanNumber(UP_LIMIT, 1);
            questionAnswer[i] = new String[]{Integer.toString(ranNumb1) + " "
                    + Integer.toString(ranNumb2),
                    Integer.toString(findMaxDev(ranNumb1, ranNumb2))};
        }
        String rules = "Find the greatest common divisor of given numbers.";
        Engine.searchForAnswer(rules, questionAnswer);
    }
    public static int findMaxDev(int ranNumber1, int ranNumber2) {

        while (ranNumber2 != 0) {
            int result = ranNumber1 % ranNumber2;
            ranNumber1 = ranNumber2;
            ranNumber2 = result;
        }
        return ranNumber1;
    }
}
