package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static String answer;

    public static void setAnswer(String answer) {
        Engine.answer = answer;
    }

    public static String getAnswer() {
        return answer;
    }

    public static void logic(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Question: " + arr[i][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                Engine.setAnswer(scanner.nextLine());
                if (arr[i][1].equals(getAnswer())) {
                    String result = (getAnswer().equals(arr[i][1])) ? "Correct!" : getAnswer() + " "
                            + "is wrong answer ;(. Correct answer was" + arr[i][1] + ".\n" + "Let's try again, "
                            + Cli.getName() + "!";
                    System.out.println(result);

                } else {
                    if (!getAnswer().equals(arr[i][1])) {
                        System.out.println(getAnswer() + " " + "is wrong answer ;(. Correct answer was" + " "
                                + arr[i][1] + ".\n" + "Let's try again, " + Cli.getName() + "!");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Congratulations, " + Cli.getName() + "!");
    }
}
