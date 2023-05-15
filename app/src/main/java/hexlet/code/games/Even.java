package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;

public class Even {
    public static int ranNumb;
    public static String[][] arr;
    public static String convertString;

    public static void playEven() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            ranNumb = (int) (Math.random() * (100 - 1) + 1);
            System.out.println("Question: " + " " + ranNumb);
            Scanner scanner = new Scanner(System.in);
            convertString = Integer.toString(ranNumb);
            if (scanner.hasNextLine()) {
                Engine.answer = scanner.nextLine();
            }
            if (ranNumb % 2 == 0) {
                arr = new String[][]{new String[]{convertString, "yes"}};
                Engine.logic(arr);

            } else {
                arr = new String[][]{new String[]{convertString, "no"}};
                Engine.logic(arr);
            }
        }
    }
}
