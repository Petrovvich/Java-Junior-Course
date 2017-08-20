package lesson_1_tasks;

/*
Написать программу, которая просит пользователя ввести результат умножения двух чисел,
сформированных случайным образом в диапазоне от 1 до 10. Если пользователь допустит
ошибку – необходимо его проинформировать и выдать правильный ответ.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_11 {

    public static void main(String[] args) throws IOException {

        int firstNumber = (int) (Math.random()*9 + 1);
        int secondNumber = (int) (Math.random()*9 + 1);

        int multiplyOfNumbers = firstNumber * secondNumber;

        System.out.println("Введите предполагаемое произведение двух случайных чисел:");

        //неплохо было бы обернуть в try catch, но я не вспомнил как это правильно сделать
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int userNember = Integer.parseInt(reader.readLine());
        reader.close();

        if (userNember == multiplyOfNumbers) {
            System.out.println("Это было сложно, но правильно!");
        } else {
            System.out.println("Неправильно!\nИгра окончена, вы проиграли!");
            System.out.println("Правильный ответ: " + multiplyOfNumbers);
        }
    }
}
