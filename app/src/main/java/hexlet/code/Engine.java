package hexlet.code;

import java.util.Scanner;

public final class Engine {
    public static final int ROUNDS_COUNT = 3;
    public static final int COL_ARR = 2;

    public static void findForAnswer(String rules, String[][] arr) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = "";
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
            System.out.println("Hello," + " " + name + "!");
        }
        System.out.println(rules);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Question: " + arr[i][0]);
            System.out.print("Your answer: ");
            if (scanner.hasNextLine()) {
                String answer = scanner.nextLine();
                if (arr[i][1].equals(answer)) {
                    String result = "Correct!";
                    System.out.println(result);

                } else {
                    System.out.println(answer + " " + "is wrong answer ;(. Correct answer was" + " "
                            + arr[i][1] + ".\n" + "Let's try again, " + name + "!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + name + "!");
        System.exit(0);
    }
}
