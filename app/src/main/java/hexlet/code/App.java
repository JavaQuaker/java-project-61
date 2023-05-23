package hexlet.code;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Calc;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int CHOICE_0 = 0;
    public static final int CHOICE_1 = 1;
    public static final int CHOICE_2 = 2;
    public static final int CHOICE_3 = 3;
    public static final int CHOICE_4 = 4;
    public static final int CHOICE_5 = 5;
    public static final int CHOICE_6 = 6;

    public static void main(String[] args) {

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greeting");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            switch (x) {
                case CHOICE_1:
                    System.out.println("Your choice: 1");
                    Cli.greeting();
                    break;

                case CHOICE_0:
                    System.out.println("Goodbye");
                    break;

                case CHOICE_2:
                    System.out.println("Your choice: 2");
                    Even.playEven();
                    break;

                case CHOICE_3:
                    System.out.println("Your choice: 3");
                    Calc.defineRanNumb();
                    break;

                case CHOICE_4:
                    System.out.println("Your choice: 4");
                    GCD.formatGCD();
                    break;

                case CHOICE_5:
                    System.out.println("Your choice: 5");
                    Progression.formProgress();
                    break;

                case CHOICE_6:
                    System.out.println("Your choice: 6");
                    Prime.formatPrime();
                default:
                    break;

            }
        }
    }
}
