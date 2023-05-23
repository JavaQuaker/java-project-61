package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.RandomClass;

public class Calc {
    public static final int UP_LIMIT = 100;
    public static void defineRanNumb() {
        String[][] questionAnswer = new String[Engine.ROUNDS_COUNT][Engine.COL_ARR];
        String[] operations = {"+", "-", "*"};
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int ranNmb1 = RandomClass.searchRanNumber(UP_LIMIT, 0);
            int ranNumb2 = RandomClass.searchRanNumber(UP_LIMIT, 0);
            int indexOperation = RandomClass.searchRanNumber(0, 2);

            questionAnswer[i] = new String[]{Integer.toString(ranNmb1) + " " + operations[indexOperation]
                    + " " + Integer.toString(ranNumb2),
                    Integer.toString(calculate(ranNmb1, indexOperation, ranNumb2))};
        }
        String rules = "What is the result of the expression?";
        Engine.findForAnswer(rules, questionAnswer);
    }
    public static int calculate(int ranNmb1, int indexOperation, int ranNumb2) {
        int result = 0;
        switch (indexOperation) {
            case '+':
                result = ranNmb1 + ranNumb2;
                break;
            case '-':
                result = ranNmb1 - ranNumb2;
                break;
            case '*':
                result = ranNmb1 * ranNumb2;
                break;
            default:
                break;
        }
        return result;
    }
}

