package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Arrays;
import java.util.Scanner;
/*Генерируем случайныe чсила:
 * аrrayLength - длина массива
 * firstInd - первое значение массива
 * randInd = шаг массива
 *
 * Генерируем массив с вышеобозначенными параметрами
 * randIndArr - случайный скрываемый индекс. */
public class Progression {
    public static String[][] arr;

    public static void progress() {
        System.out.println("What number is missing in the progression?");

        while (Engine.count < 3) {
            int arrayLength = (int) ((Math.random() * (20 - 10)) + 10);
            int firstInd = (int) ((Math.random() * (20 - 2)) + 2);
            int randInd = (int) ((Math.random() * (9 - 2)) + 2);

            System.out.println("Question: " + " ");
            int[] array = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {
                array[i] = firstInd + (i * randInd);
            }
            int randIndArr = (int) (Math.random() * (array.length - 1) + 1);
            String[] stringArr = new String[arrayLength];
            for (int i = 0; i < stringArr.length; i++) {
                stringArr[i] = Integer.toString(array[i]);
                if (i == randIndArr) {
                    stringArr[i] = "..";
                }
                System.out.print(stringArr[i] + " ");
            }
            System.out.println();
            System.out.println("Your answer: " + " ");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                Engine.answer = scanner.nextLine();
            }
            arr = new String[][]{new String[]{Arrays.toString(stringArr),
                    Integer.toString(array[randIndArr])}};
            Engine.logic(arr);
        }
    }
}
