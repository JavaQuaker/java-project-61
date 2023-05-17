package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    private static int ranNumb1;
    private static int ranNumb2;



    public static int getRanNumb1() {
        return ranNumb1;
    }

    public static int getRanNumb2() {
        return ranNumb2;
    }

    public static void maxNod() {
        String[][] arr = new String[3][2];

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            ranNumb1 = (int) ((Math.random() * (100 - 1)) + 1);
            ranNumb2 = (int) ((Math.random() * (100 - 1)) + 1);
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
