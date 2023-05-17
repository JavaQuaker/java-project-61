package hexlet.code.games;
import hexlet.code.Engine;

public class Prime {
    private static int ranNumb;
    public static final String AFFIRM_ANSWER = "yes";
    public static final String NEG_ANSWER = "no";
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;

    public static void setRanNumb(int ranNumb) {
        Prime.ranNumb = ranNumb;
    }

    public static int getRanNumb() {
        return ranNumb;
    }

    public static void prime() {
        String[][] arr = new String[STR_ARR][COL_ARR];
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            setRanNumb((int) (Math.random() * (100 - 2) + 2));
            arr[i] = new String[]{Integer.toString(getRanNumb()), findPrime(getRanNumb())};
        }
        Engine.logic(arr);
    }
    public static String findPrime(int ranNumber) {
        boolean x = false;
        for (int i = 2; i < getRanNumb(); i++) {
            if (getRanNumb() % i == 0) {
                x = true;
            }
        }
        if (x) {
            return NEG_ANSWER;
        } else {
            return AFFIRM_ANSWER;
        }
    }
}


