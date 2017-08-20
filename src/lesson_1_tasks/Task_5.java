package lesson_1_tasks;

/*
Объявить две целочисленные переменные «a» и «b» и задать им произвольные начальные значения.
Затем написать скрипт, который работает по следующему принципу:
	если $a и $b положительные, вывести их разность;
	если $а и $b отрицательные, вывести их произведение;
	если $а и $b разных знаков, вывести их сумму;
 */

public class Task_5 {

    public static void main(String[] args) {

        int a = (int) (Math.random() * 100 + 50);
        int b = (int) (Math.random() * 50 + 25);

        if (a > 0 && b > 0) {
            System.out.println(a - b);
        }
        else if (a < 0 && b < 0) {
            System.out.println(a * b);
        }
        else if (a > 0 && b < 0 || a < 0 && b > 0) {
            System.out.println(a + b);
        }
    }
}
