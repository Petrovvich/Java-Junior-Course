package codeWarsTasks.task_2;

public class FindOutlier {
    static int find(int[] integers) {

        int countOfOdd = 0;
        int countOfEven = 0;
        int result = 0;

        for (int num = 0; num < integers.length; num++) {
            if (integers[num] % 2 == 0) {
                countOfEven++;
            } else {
                countOfOdd++;
            }

            if (countOfEven > countOfOdd) {
                for (int i : integers) {
                    if (i % 2 != 0) {
                        result = i;
                        break;
                    }
                }
            } else {
                for (int i : integers) {
                    if (i % 2 == 0) {
                        result = i;
                        break;
                    }
                }

            }
        }
        return result;
    }
}