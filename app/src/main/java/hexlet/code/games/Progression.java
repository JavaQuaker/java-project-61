package hexlet.code.games;
import hexlet.code.Engine;


/*Генерируем случайныe чсила:
 * аrrayLength - длина массива
 * firstInd - первое значение массива
 * randInd = шаг массива
 *
 * Генерируем массив с вышеобозначенными параметрами
 * randIndArr - случайный скрываемый индекс. */
public class Progression {
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static final int UP_LIMIT_ARRAY = 20;
    public static final int DW_LIMIT_ARRAY = 10;
    public static final int UP_LIMIT_FIRST_IND = 20;
    public static final int DW_LIMIT_FIRST_IND = 2;
    public static final int UP_LIMIT_RAND_IND = 9;
    public static final int DW_LIMIT_RAND_IND = 2;
    public static void progress() {
        String[][] arr = new String[STR_ARR][COL_ARR];
        System.out.println("What number is missing in the progression?");
        for (int k = 0; k < STR_ARR; k++) {
            int arrayLength = (int) ((Math.random() * (UP_LIMIT_ARRAY - DW_LIMIT_ARRAY)) + DW_LIMIT_ARRAY);
            int firstInd = (int) ((Math.random() * (UP_LIMIT_FIRST_IND - DW_LIMIT_FIRST_IND)) + DW_LIMIT_FIRST_IND);
            int randInd = (int) ((Math.random() * (UP_LIMIT_RAND_IND - DW_LIMIT_RAND_IND)) + DW_LIMIT_RAND_IND);
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
            StringBuilder builder = new StringBuilder();
            for (String value : stringArr) {
                builder.append(value + " ");
            }
            String str = builder.toString();
            arr[k] = new String[]{str, Integer.toString(array[randIndArr])};
        }
        Engine.logic(arr);
    }
}
