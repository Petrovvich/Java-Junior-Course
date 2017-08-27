package lesson_4_tasks;

/*
1) В предложении заменить все пробелы символом «_»
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_6 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите, пожалуйста, предложение для замены в нем пробелов на \"_\"");

        String input = reader.readLine();

        System.out.println("Результат замены: \n" + input.replaceAll(" ", "_"));
    }
}
