package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils.RandomClass;

public class Progression {
    public static final int STR_ARR = 3;
    public static final int COL_ARR = 2;
    public static final int UP_LIMIT_ARRAY = 20;
    public static final int DW_LIMIT_ARRAY = 10;
    public static final int UP_LIMIT_FIRST_IND = 20;
    public static final int DW_LIMIT_FIRST_IND = 2;
    public static final int UP_LIMIT_RAND_IND = 9;
    public static final int DW_LIMIT_RAND_IND = 2;

    public static void formProgress() {
        String[][] questionAnswer = new String[STR_ARR][COL_ARR];
        for (int k = 0; k < STR_ARR; k++) {
            int arrayLength = RandomClass.searchRanNumber(UP_LIMIT_ARRAY, DW_LIMIT_ARRAY);
            int firstInd = RandomClass.searchRanNumber(UP_LIMIT_FIRST_IND, DW_LIMIT_FIRST_IND);
            int randInd = RandomClass.searchRanNumber(UP_LIMIT_RAND_IND, DW_LIMIT_RAND_IND);
            int[] progression = new int[arrayLength];
            for (int i = 0; i < progression.length; i++) {
                progression[i] = firstInd + (i * randInd);
            }
            int randIndArr = RandomClass.searchRanNumber(arrayLength, 1);
            String[] trance = new String[arrayLength];
            questionAnswer[k] = new String[]{defProgress(trance, progression, randIndArr),
                    Integer.toString(progression[randIndArr])};
        }
        String rules = "What number is missing in the progression?";
        Engine.searchForAnswer(rules, questionAnswer);
    }

    public static String defProgress(String[] trance, int[] array, int randIndArr) {
        for (int i = 0; i < trance.length; i++) {
            trance[i] = Integer.toString(array[i]);
            if (i == randIndArr) {
                trance[i] = "..";
            }
        }
        StringBuilder builder = new StringBuilder();
        for (String value : trance) {
            builder.append(value + " ");
        }
        String str = builder.toString();
        return str;
    }
}
