package hexlet.code.games;
import java.util.Scanner;
import static hexlet.code.Cli.name;

public class Even {
    public static void playEven() {
        int count = 0;
        while (true) {
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int ranNumb = (int) (Math.random() * 100);
            System.out.println("Question: " + " " + ranNumb);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                String answer = scanner.nextLine();
                if (ranNumb % 2 == 0) {
                    String result1 = answer.equals("yes") ? "Correct!" : "'no' is wrong answer ;(. "
                                + "Correct answer 'yes'.\n"
                                + "Let's try again, " + " " + name;
                    System.out.println(result1);
                    if (result1.equals("Correct!")) {
                        count++;
                    } else {
                        count = 0;
                    }
                }
                if (ranNumb % 2 != 0) {
                    String result2 = answer.equals("no") ? "Correct!" : "'yes' is wrong answer ;(. "
                                + "Correct answer 'no'. \n "
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

