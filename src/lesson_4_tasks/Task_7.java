package lesson_4_tasks;

/*
 Дано предложение. Необходимо проверить его на наличие ошибок в буквосочетании «жи» и «ши» и исправить их.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_7 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите, пожалуйста, предложение для поиска в нем ошибок типа жи-ши");

        String input = reader.readLine();

        //Для проверки: Маша с Мишей мыли жырную кастрюлю

        String result = input.replaceAll("жы", "жи");
        String result1 = result.replaceAll("шы", "ши");

        System.out.println(result1);
    }
}
