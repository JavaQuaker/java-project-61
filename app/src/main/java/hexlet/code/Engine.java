package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static String answer;
    public static void logic(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Question: " + arr[i][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                Engine.answer = scanner.nextLine();
                if (arr[i][1].equals(answer)) {
                    String result = (answer.equals(arr[i][1])) ? "Correct!" : answer + " " + "is wrong answer ;(. "
                            + "Correct answer was" + arr[i][1] + ".\n" + "Let's try again, " + " " + Cli.name + "!";
                    System.out.println(result);

                } else {
                    if (!answer.equals(arr[i][1])) {
                        System.out.println(answer + " " + "is wrong answer ;(. Correct answer was" + " " + arr[i][1]
                                + ".\n" + "Let's try again, " + " " + Cli.name + "!");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Congratulations, " + " " + Cli.name + "!");
    }
}
