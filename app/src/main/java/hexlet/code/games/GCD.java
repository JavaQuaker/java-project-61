package hexlet.code.games;

import hexlet.code.Engine;

public final class GCD {
    private int ranNumb1;
    private int ranNumb2;
    public static final int UP_LIMIT = 100;
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;

    public int getRanNumb1() {
        return ranNumb1;
    }

    public int getRanNumb2() {
        return ranNumb2;
    }

    public static void rulesGameGCD() {
        System.out.println("Find the greatest common divisor of given numbers.");
    }

    public static void arrFormationGCD() {
        GCD gcd = new GCD();
        String[][] questionAnswer = new String[STR_ARR][COL_ARR];
        rulesGameGCD();
        for (int i = 0; i < STR_ARR; i++) {
            gcd.ranNumb1 = RandomClass.searchRanNumber(UP_LIMIT, 1);
            gcd.ranNumb2 = RandomClass.searchRanNumber(UP_LIMIT, 1);
            questionAnswer[i] = new String[]{Integer.toString(gcd.getRanNumb1()) + " "
                    + Integer.toString(gcd.getRanNumb2()),
                    Integer.toString(searchMaxDev(gcd.getRanNumb1(), gcd.getRanNumb2()))};
        }
        Engine.searchForAnswer(questionAnswer);
    }
    public static int searchMaxDev(int ranNumber1, int ranNumber2) {

        while (ranNumber2 != 0) {
            int result = ranNumber1 % ranNumber2;
            ranNumber1 = ranNumber2;
            ranNumber2 = result;
        }
        return ranNumber1;
    }
}
