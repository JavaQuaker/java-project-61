package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static final int UP_LIMIT = 100;

    public static void rulesGameCalc() {
        System.out.println("What is the result of the expression?");
    }
    public static void definitionRanNumb() {
        String[][] questionAnswer = new String[STR_ARR][COL_ARR];
        rulesGameCalc();
        String[] operations = {"+", "-", "*"};
        for (int i = 0; i < STR_ARR; i++) {
            int ranNmb1 = RandomClass.searchRanNumber(UP_LIMIT, 0);
            int ranNumb2 = RandomClass.searchRanNumber(UP_LIMIT, 0);
            int indexOperation = RandomClass.searchRanNumber(0, 2);

            questionAnswer[i] = new String[]{Integer.toString(ranNmb1) + " " + operations[indexOperation]
                    + " " + Integer.toString(ranNumb2),
                    Integer.toString(calculation(ranNmb1, indexOperation, ranNumb2))};
        }
        Engine.searchForAnswer(questionAnswer);
    }
    public static int calculation(int ranNmb1, int indexOperation, int ranNumb2) {
        int result = 0;
        switch (indexOperation) {
            case 0:
                result = ranNmb1 + ranNumb2;
                break;
            case 1:
                result = ranNmb1 - ranNumb2;
                break;
            case 2:
                result = ranNmb1 * ranNumb2;
                break;
            default:
                break;
        }
        return result;
    }
}

