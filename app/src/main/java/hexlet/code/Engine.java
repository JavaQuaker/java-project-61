package hexlet.code;

import java.util.Scanner;

public final class Engine {
    private String answer;
    private static String name;

    private static String getName() {
        return name;
    }

    public String getAnswer() {
        return answer;
    }

    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
            System.out.println("Hello," + " " + getName() + "!");
        }
    }
    public static void searchForAnswer(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Question: " + arr[i][0]);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                Engine engine = new Engine();
                engine.answer = scanner.nextLine();
                if (arr[i][1].equals(engine.getAnswer())) {
                    String result = "Correct!";
                    System.out.println(result);

                } else {
                    System.out.println(engine.getAnswer() + " " + "is wrong answer ;(. Correct answer was" + " "
                            + arr[i][1] + ".\n" + "Let's try again, " + getName() + "!");
                    System.exit(0);
                }
            }
        }
        System.out.println("Congratulations, " + getName() + "!");
    }
}
