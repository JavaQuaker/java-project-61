package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Scanner;
public class Prime {
    public static int ranNumb;

    public static void prime() {
        String[][] arr = new String[3][2];
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            ranNumb = (int) (Math.random() * (100 - 2) + 2);
            arr[i] = new String[]{Integer.toString(ranNumb), findPrime(ranNumb)};
        }
        Engine.logic(arr);
    }
    public static String findPrime(int ranNumb) {
        int temp = 0;
        boolean x = false;
        for (int i = 2; i < ranNumb; i++) {
            if (ranNumb % i == 0) {
                x = true;
            }
            if (x) {
                return "no";
            } else {
                return "yes";
            }
        }
        return "yes";
    }
}

