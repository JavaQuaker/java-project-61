package hexlet.code.games;
import java.util.Arrays;
import java.util.Scanner;

import static hexlet.code.Cli.name;
/*Генерируем случайнычсила:
 * аrrayLength - длина массива
 * firstInd - первое значение массива
 * randInd = шаг массива
 *
 * Генерируем массив с вышеобозначенными параметрами
 * randIndArr - случайный скрываемый индекс. */

public class Progression {
    public static void progress() {
        int count = 0;
        while (true) {
            int arrayLength = (int) ((Math.random() * (20 - 10)) + 10);
            int firstInd = (int) ((Math.random() * (20 - 2)) + 2);
            int randInd = (int) ((Math.random() * (9 - 2)) + 2);

            int[] arr = new int[arrayLength];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (i * randInd) + firstInd;
            }
            int randIndArr = (int) ((Math.random() * (arr.length - 1)) + 1);

            String[] stringArr = new String[arrayLength];
            for (int i = 0; i < stringArr.length; i++) {
                stringArr[i] = Integer.toString(arr[i]);
                if (i == randIndArr) {
                    stringArr[i] = "..";
                }
            }
            System.out.println("Question: " + " " + Arrays.toString(stringArr));

            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int answer = scanner.nextInt();
                String result = (arr[randIndArr] == answer) ? "Your answer: " + answer + "\n" + "Correct!"
                        : "Your answer:" + answer + "\n" + "'" + answer + "'" + "is wrong answer ;(. Correct answer was"
                        + "'" + arr[randIndArr] + "'" + "\n" + "Let's try again, " + " " + name + "!";
                System.out.println(result);
                if (arr[randIndArr] == answer) {
                    count++;
                } else {
                    count = 0;
                }
            }
            if (count == 3) {
                System.out.println("Congratulations, " + " " + name + "!");
                break;
            }
        }
    }
}

