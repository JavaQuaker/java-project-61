package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Scanner;

public class Prime {
    public static String[][] arr;
    public static int ranNumb;

    public static void prime() {
        Engine.count = 0;
        while (Engine.count < 3) {
            ranNumb = (int) (Math.random() * (100 - 2) + 2);

            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            System.out.println("Question: " + " " + ranNumb);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                Engine.answer = scanner.nextLine();
                findPrime();
            }
        }
    }

    public static void findPrime() {
        int temp = 0;
        boolean x = false;
        for (int i = 2; i < ranNumb; i++) {
            if (ranNumb % i == 0) {
                x = true;
            }
        }
        if (x) {
            Engine.logic(arr = new String[][]{new String[]{Integer.toString(temp), "no"}});
        } else {

            Engine.logic(arr = new String[][]{new String[]{Integer.toString(temp), "yes"}});
        }
    }
}













