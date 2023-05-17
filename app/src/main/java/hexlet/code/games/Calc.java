package hexlet.code.games;
import hexlet.code.Engine;


public class Calc {
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static final int UP_LIMIT = 100;
    public static void calculation() {
        String[][] arr = new String[STR_ARR][COL_ARR];
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < STR_ARR; i++) {

            int ranNmb1 = (int) (Math.random() * UP_LIMIT);
            int ranNumb2 = (int) (Math.random() * UP_LIMIT);
            int[] array = {ranNmb1 + ranNumb2, ranNmb1 - ranNumb2, ranNmb1 * ranNumb2};
            int result = (int) (Math.random() * array.length);
            String[] operations = {"+", "-", "*"};

            arr[i] = new String[]{Integer.toString(ranNmb1) + " " + operations[result]
                    + " " + Integer.toString(ranNumb2), Integer.toString(array[result])};
        }
        Engine.logic(arr);
    }
}
