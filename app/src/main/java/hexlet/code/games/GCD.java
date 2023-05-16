package hexlet.code.games;
import hexlet.code.Engine;

public class GCD {
    public static int ranNumb1;
    public static int ranNumb2;
    public static void maxNod() {
        String[][] arr = new String[3][2];

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {
            ranNumb1 = (int) ((Math.random() * (100 - 1)) + 1);
            ranNumb2 = (int) ((Math.random() * (100 - 1)) + 1);
            arr[i] = new String[]{Integer.toString(ranNumb1) + " " + Integer.toString(ranNumb2),
                    Integer.toString(findNod(ranNumb1, ranNumb2))};
        }
        Engine.logic(arr);
    }
    public static int findNod(int ranNumber1, int ranNumber2) {
        int rem = 0;
        for (int i = 1; i <= ranNumb1; i++) {
            for (int j = 1; j <= ranNumb2; j++) {
                if (((ranNumb1 % i == 0) & (ranNumb2 % j == 0)) & (i == j)) {
                    rem = i;

                    if ((ranNumb1 == 1) && (ranNumb2 == 1)) {
                        rem = 1;
                    }
                }
            }
        }
        return rem;
    }
}
