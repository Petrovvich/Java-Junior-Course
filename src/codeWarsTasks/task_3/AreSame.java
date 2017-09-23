package codeWarsTasks.task_3;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {
        boolean isContains = false;

        if(a.length == 0 || b.length == 0) {
            return isContains;
        }

        if(a.length == 0 && b.length == 0) {
            return isContains;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i] * a[i]) {
                    isContains = true;
                    break;
                }
            }
        }
        return isContains;
    }

    public static void main(String[] args) {

        int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(AreSame.comp(a, b));
    }
}
