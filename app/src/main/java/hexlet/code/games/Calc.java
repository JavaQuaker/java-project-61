package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Scanner;
public class Calc {
    public static void calculation() {
        String[][] arr = new String[3][2];
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < 3; i++) {

            int ranNmb1 = (int) (Math.random() * 100);
            int ranNumb2 = (int) (Math.random() * 100);
            int[] array = {ranNmb1 + ranNumb2, ranNmb1 - ranNumb2, ranNmb1 * ranNumb2};
            int result = (int) (Math.random() * array.length);
            String[] operations = {"+", "-", "*"};

            arr[i] = new String[]{Integer.toString(ranNmb1) + operations[result]
                    + Integer.toString(ranNumb2), Integer.toString(array[result])};
        }
        Engine.logic(arr);
    }
}
