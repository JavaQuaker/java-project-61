package hexlet.code.games;
import java.util.Scanner;
import static hexlet.code.Cli.name;
/*runNumb - случайное число заданного интервала */

public class Prime {
    public static void prime() {
        int count = 0;

        while (true) {
            int ranNumb = (int) (Math.random() * (100 - 1) + 1);
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            System.out.println("Question: " + " " + ranNumb);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String answer = scanner.nextLine();
                boolean y = false;
                for (int i = 2; i < ranNumb; i++) {
                    if (ranNumb % i == 0) {
                        y = true;
                    }
                }
                if (y) {
                    String result = answer.equals("no") ? "Correct!" : "'yes' is wrong answer ;(. "
                            + "Correct answer 'no'.\n"
                            + "Let's try again, " + " " + name;

                    System.out.println(result);
                    if (result.equals("Correct!")) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (!y) {
                    String result2 = answer.equals("yes") ? "Correct!" : "'no' is wrong answer ;(. "
                            + "Correct answer 'yes'.\n"
                            + "Let's try again, " + " " + name;
                    System.out.println(result2);
                    if (result2.equals("Correct!")) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
            }

            if (count == 3) {
                System.out.println("Congratulations, " + " " + name + "!");
                break;
            }
        }
    }
}
