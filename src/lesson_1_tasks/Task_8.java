package lesson_1_tasks;

/*
Напишите программу вывода суммы двух случайных чисел.
Первое число может принимать значение из диапазона [0,10], второе число может принимать значение из отрезка [25,35]

 */

public class Task_8 {

    public static void main(String[] args) {

        int firstNumber = (int) (Math.random()*10);
        int secondNumber = (int) (Math.random()*10 + 35);

        System.out.println("Сумма двух случайных чисел: " + (firstNumber + secondNumber));
    }
}
