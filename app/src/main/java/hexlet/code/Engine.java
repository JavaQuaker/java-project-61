package hexlet.code;
public class Engine {
    public static String answer;
    public static int count;

    public static void logic(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][1].equals(answer)) {
                    String result = (answer.equals(arr[i][1])) ? "Correct!" : answer + " " + "is wrong answer ;(. "
                            + "Correct answer was" + arr[i][1] + ".\n" + "Let's try again, " + " " + Cli.name + "!";
                    System.out.println(result);
                    if (result == "Correct!") {
                        count++;
                        break;
                    }
                } else {
                    if (answer.equals(arr[i][1]) == false) {
                        System.out.println(answer + " " + "is wrong answer ;(. Correct answer was" + " " + arr[i][1]
                                + ".\n" + "Let's try again, " + " " + Cli.name + "!");
                        System.exit(0);
                    }
                }
            }
        }
        if (count == 3) {
            System.out.println("Congratulations, " + " " + Cli.name + "!");
        }
    }
}










