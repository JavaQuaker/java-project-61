package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    public static int ranNumb;
    public static String convertString;
    public static final String AFFIRM_ANSWER = "yes";
    public static final String NEG_ANSWER = "no";
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static void playEven() {
        String[][] arr = new String[STR_ARR][COL_ARR];
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            ranNumb = (int) (Math.random() * (100 - 1) + 1);
            if (ranNumb % 2 == 0) {
                arr[i] = new String[]{Integer.toString(ranNumb), AFFIRM_ANSWER};
            } else {
                arr[i] = new String[]{Integer.toString(ranNumb), NEG_ANSWER};
            }
        }
        Engine.logic(arr);
    }
}
