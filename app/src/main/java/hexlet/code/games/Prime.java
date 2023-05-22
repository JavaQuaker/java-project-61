package hexlet.code.games;
import hexlet.code.Engine;

public final class Prime {
    public static final String AFFIRM_ANSWER = "yes";
    public static final String NEG_ANSWER = "no";
    public static final int UP_LIMIT = 100;

    public static void defRulesGamePrime() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }
    public static void arrFormationPrime() {
        String[][] questionAnswer = new String[Engine.STR_ARR][Engine.COL_ARR];
        defRulesGamePrime();
        for (int i = 0; i < Engine.STR_ARR; i++) {
            int ranNumb = RandomClass.searchRanNumber(UP_LIMIT, 2);
            if (findPrime(ranNumb)) {
                questionAnswer[i] = new String[]{Integer.toString(ranNumb), NEG_ANSWER};
            } else {
                questionAnswer[i] = new String[]{Integer.toString(ranNumb), AFFIRM_ANSWER};
            }
        }
        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        Engine.searchForAnswer(rules, questionAnswer);
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


