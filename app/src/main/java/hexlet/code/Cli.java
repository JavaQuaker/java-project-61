package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greeting() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String name = scanner.nextLine();
            System.out.println("Hello," + " " + name + "!");
            System.exit(0);
        }
    }
}
