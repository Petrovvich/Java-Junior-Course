package lesson_2_tasks;

/*
Напечатать таблицу умножения на число n, которое вводится с клавиатуры
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(reader.readLine());

        for (int i = 1; i < 11 ; i++) {
            System.out.print(input * i + " ");
        }
    }
}
