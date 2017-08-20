package lesson_1_tasks;

/*
Даны три числа. Увеличьте первое число в два раза, второе число уменьшите на 3, третье число
возведите в квадрат и затем найдите сумму новых трех чисел.
 **/

public class Task_2 {

    public static void main(String[] args) {
        int firstNumber = 156;
        int secondNumber = 15;
        int thirdNumber = 86;

        firstNumber *= 2;
        secondNumber -= 3;
        thirdNumber *= thirdNumber;

        System.out.println(firstNumber + secondNumber + thirdNumber);
    }
}
