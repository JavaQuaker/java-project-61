package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Arrays;

/*Генерируем случайныe чсила:
 * аrrayLength - длина массива
 * firstInd - первое значение массива
 * randInd = шаг массива
 *
 * Генерируем массив с вышеобозначенными параметрами
 * randIndArr - случайный скрываемый индекс. */
public class Progression {
    public static void progress() {
        String[][] arr = new String[3][2];
        System.out.println("What number is missing in the progression?");
        for (int k = 0; k < 3; k++) {
            int arrayLength = (int) ((Math.random() * (20 - 10)) + 10);
            int firstInd = (int) ((Math.random() * (20 - 2)) + 2);
            int randInd = (int) ((Math.random() * (9 - 2)) + 2);
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
            }
            arr[k] = new String[]{Arrays.toString(stringArr), Integer.toString(array[randIndArr])};
        }
        Engine.logic(arr);
    }
}
