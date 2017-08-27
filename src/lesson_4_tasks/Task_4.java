package lesson_4_tasks;

/*
1) Дано предложение. Определить число слов в нем.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task_4 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите, пожалуйста, предложение для подсчета слов в нем: ");

        String input = reader.readLine();

        //Задача решается многими способами и самый простой и очевидный и
        //быстрый - использование метода split стандартного класса String
        //Также в выражении учтен кейс, когда могут идти подряд несколько пробелов.

        int numOfSpaces =  input.split(" +").length;

        System.out.println("Количество слов во введенном предложении: " + numOfSpaces);
    }
}
