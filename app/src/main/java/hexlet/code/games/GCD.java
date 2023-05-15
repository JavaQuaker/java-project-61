package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
public class GCD {
    public static String[][] arr;
    public static int ranNumb1;
    public static int ranNumb2;

    public static void maxNod() {

        System.out.println("Find the greatest common divisor of given numbers.");
        for (int i = 0; i < 3; i++) {

            ranNumb1 = (int) ((Math.random() * (100 - 1)) + 1);
            ranNumb2 = (int) ((Math.random() * (100 - 1)) + 1);
            System.out.println("Question: " + " " + ranNumb1 + " " + ranNumb2);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                Engine.answer = scanner.nextLine();
                findNod();
            }
        }
    }

    public static void findNod() {
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
        arr = new String[][]{new String[]{Integer.toString(ranNumb1) + " " + Integer.toString(ranNumb2),
                Integer.toString(rem)}};
        Engine.logic(arr);
    }
}
