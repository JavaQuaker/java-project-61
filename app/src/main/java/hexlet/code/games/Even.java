package hexlet.code.games;
import hexlet.code.Engine;


public class Even {
    public static int ranNumb;
    public static String convertString;
    public static void playEven() {
        String[][] arr = new String[3][2];
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        for (int i = 0; i < 3; i++) {
            ranNumb = (int) (Math.random() * (100 - 1) + 1);
            if (ranNumb % 2 == 0) {
                arr[i] = new String[]{Integer.toString(ranNumb), "yes"};
            } else {
                arr[i] = new String[]{Integer.toString(ranNumb), "no"};
            }
        }
        Engine.logic(arr);
    }
}
