package hexlet.code.games;

import java.util.Scanner;
import static hexlet.code.Cli.name;
/* ranNumb1 - сдучайное число заданного интервала
 * ranNumb2 - случйное число заданного интервала */

public class GCD {
    public static void maxNod() {
        int count = 0;
        while (true) {
            System.out.println("Find the greatest common divisor of given numbers.");
            int ranNumb1 = (int) ((Math.random() * (100 - 1)) + 1);
            int ranNumb2 = (int) ((Math.random() * (100 - 1)) + 1);
            System.out.println("Question: " + " " + ranNumb1 + " " + ranNumb2);
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
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                String result = (rem == answer) ? "Your answer: " + answer + "\n" + "Correct!" : "Your answer: "
                        + answer + "\n" + "'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'"
                        + rem + "'" + "\n" + "Let's try again, " + " " + name + "!";
                System.out.println(result);
                if (rem == answer) {
                    count++;
                } else {
                    count = 0;
                }
            }
            if (count == 3) {
                System.out.println("Congratulations, " + " " + name + "!");
                break;
            }
        }
    }
}
