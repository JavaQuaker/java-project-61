package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    private int ranNumb;
    public static final String AFFIRM_ANSWER = "yes";
    public static final String NEG_ANSWER = "no";
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static final int UP_LIMIT = 100;

    public int getRanNumb() {
        return ranNumb;
    }

    public static void defRulesGamePrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    public static void arrFormationPrime() {
        Prime prime = new Prime();
        String[][] questionAnswer = new String[STR_ARR][COL_ARR];
        defRulesGamePrime();
        for (int i = 0; i < STR_ARR; i++) {
            prime.ranNumb = RandomClass.searchRanNumber(UP_LIMIT, 2);
            if (findPrime(prime.getRanNumb())) {
                questionAnswer[i] = new String[]{Integer.toString(prime.ranNumb), NEG_ANSWER};
            } else {
                questionAnswer[i] = new String[]{Integer.toString(prime.ranNumb), AFFIRM_ANSWER};
            }
        }
        Engine.searchForAnswer(questionAnswer);
    }
    public static boolean findPrime(int ranNumber) {
        for (int i = 2; i < ranNumber; i++) {
            if (ranNumber % i == 0) {
                return true;
            }
        }
        return false;
    }
}


