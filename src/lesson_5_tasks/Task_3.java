package lesson_5_tasks;

/*
Создать метод вычисляющий степень числа через рекурсию
 */

public class Task_3 {

    public double calculatePow (int number, int pow) {
        if (number == 0) {
            return 0;
        }
        else if (pow == 0) {
            return 1;
        }
        else if (pow < 0) {
            return (double) (calculatePow(number, pow+1) * (1/number));
        }
        else {
            return calculatePow(number, pow-1) * number;
        }
    }

    public static void main(String[] args) {

        Task_3 pow = new Task_3();

        System.out.println(pow.calculatePow(4, 18));

    }
}
