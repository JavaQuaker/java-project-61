package hexlet.code.games;
import java.util.Scanner;
import static hexlet.code.Cli.name;
/*ranNmb1 - случайное число заданного интервала
 * ranNumb2 - случайное число заданного интервала */

public class Calc {
    public static void calculation() {
        int count = 0;
        while (true) {
            System.out.println("What is the result of the expression?");

            int ranNmb1 = (int) (Math.random() * 100);
            int ranNumb2 = (int) (Math.random() * 100);
            int[] array = {ranNmb1 + ranNumb2, ranNmb1 - ranNumb2, ranNmb1 * ranNumb2};

            int result = (int) (Math.random() * array.length);
            if (result == 0) {
                System.out.println("Question: " + " " + ranNmb1 + "+" + ranNumb2);
            }
            if (result == 1) {
                System.out.println("Question: " + " " + ranNmb1 + "-" + ranNumb2);
            }
            if (result == 2) {
                System.out.println("Question: " + " " + ranNmb1 + "*" + ranNumb2);
            }

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();

                String env = (array[result] == answer) ? "Your answer: " + answer + "\n" + "Correct!" : "Your answer: "
                        + answer + "\n" + "'" + answer + "'" + "is wrong answer ;(. Correct answer was" + "'"
                        + array[result] + "'" + "\n" +  "Let's try again, " + " " + name;
                System.out.println(env);
                if (array[result] == answer) {
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