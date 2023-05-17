package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String name;
    public static void greeting() {
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            name = scanner.nextLine();
            System.out.println("Hello," + " " + name + "!");
        }
    }
}
