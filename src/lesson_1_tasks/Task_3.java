package lesson_1_tasks;

/*
Поменяйте местами значения двух переменных, не используя дополнительных переменных*.
**/

public class Task_3 {
    public static void main(String[] args) {

        int a = 5;
        int b = 4;

        System.out.println("Значения переменных до перестановки:");
        System.out.println("a равно: " + a);
        System.out.println("b равно: " + b);

        a = a - b;
        b = b + a;
        a = -a + b;

        System.out.println();
        System.out.println("Значения переменных после перестановки:");
        System.out.println("a равно: " + a);
        System.out.println("b равно: " + b);
    }
}
