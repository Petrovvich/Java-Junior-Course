package lesson_1_tasks;

/*
Дано два числа. Если хотя бы одно из них больше 30, то вывести yes, иначе no.
 */

public class Task_6 {
    public static void main(String[] args) {

        int a = (int) (Math.random() * 100);
        int b = (int) (Math.random() * 100);

        if (a > 30 || b > 30) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
