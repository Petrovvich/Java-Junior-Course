package lesson_2_tasks;

/*
Написать программу, которая генерирует 10 случайных чисел и вычисляет их среднее арифметическое
 */

public class Task_3 {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += (int) (Math.random()*10);
        }
        System.out.println("Среднее арифметическое 10 случайных чисел: " + sum / 10);
    }
}
