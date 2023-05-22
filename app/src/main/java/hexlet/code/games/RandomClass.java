package hexlet.code.games;
public class RandomClass {
    public static int searchRanNumber(int upLimit, int dwLimit) {
        return (int) ((Math.random() * (upLimit - dwLimit)) + dwLimit);
    }
}
