package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    private static int ranNumb1;
    private static int ranNumb2;
    public static final int UP_LIMIT = 100;
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;



    public static int getRanNumb1() {
        return ranNumb1;
    }

    public static int getRanNumb2() {
        return ranNumb2;
    }

    public static void maxNod() {
        String[][] arr = new String[STR_ARR][COL_ARR];

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < STR_ARR; i++) {
            ranNumb1 = (int) ((Math.random() * (UP_LIMIT - 1)) + 1);
            ranNumb2 = (int) ((Math.random() * (UP_LIMIT - 1)) + 1);
            arr[i] = new String[]{Integer.toString(getRanNumb1()) + " " + Integer.toString(getRanNumb2()),
                    Integer.toString(findNod(getRanNumb1(), getRanNumb2()))};
        }
        Engine.logic(arr);
    }
    public static int findNod(int ranNumber1, int ranNumber2) {
        int rem = 0;
        for (int i = 1; i <= getRanNumb1(); i++) {
            for (int j = 1; j <= getRanNumb2(); j++) {
                if (((getRanNumb1() % i == 0) & (getRanNumb2() % j == 0)) & (i == j)) {
                    rem = i;

                    if ((getRanNumb1() == 1) && (getRanNumb2() == 1)) {
                        rem = 1;
                    }
                }
            }
        }
        return rem;
    }
}
