package lesson_4_tasks;

/*
2) Дано предложение. Определить долю (в %) последней буквы в нем.
(находим последнюю букву в слове, находим количество таких букв в предложении и считаем пропорцией)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_5 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите, пожалуйста, предложение для подсчета доли (в %) последней буквы в нем: ");

        String input = reader.readLine();

        char[] inputChar = input.toCharArray();

        char lastChar = input.charAt(input.length()-1);

        int count = 0;

        for (char d : inputChar) {
            if (d == lastChar) {
                count++;
            }
        }

        int result = (count * 100) /inputChar.length;

        System.out.println("Массовая доля буквы " + lastChar + " в предложении составляет: " + result + "%");
    }
}
