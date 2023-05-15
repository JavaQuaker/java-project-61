package hexlet.code;
import hexlet.code.games.*;
import java.util.Scanner;

public class App {
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
                case 1:
                    System.out.println("Your choice: 1");
                    System.out.println("Welcome to the Brain Games!");
                    Cli.greeting();
                case 0:
                    System.out.println("Goodbye");
                    System.exit(0);
                case 2:
                    System.out.println("Your choice: 2");
                    System.out.println("Welcome to the Brain Games!");
                    Cli.greeting();
                    Even.playEven();
                    System.exit(0);
                case 3:
                    System.out.println("Your choice: 3");
                    System.out.println("Welcome to the Brain Games!");
                    Cli.greeting();
                    Calc.calculation();
                    System.exit(0);
                case 4:
                    System.out.println("Your choice: 4");
                    System.out.println("Welcome to the Brain Games!");
                    Cli.greeting();
                    GCD.maxNod();
                    System.exit(0);
                case 5:
                    System.out.println("Your choice: 5");
                    System.out.println("Welcome to the Brain Games!");
                    Cli.greeting();
                    Progression.progress();
                    System.exit(0);
                case 6:
                    System.out.println("Your choice: 6");
                    System.out.println("Welcome to the Brain Games!");
                    Cli.greeting();
                    Prime.prime();

            }
        }
    }
}