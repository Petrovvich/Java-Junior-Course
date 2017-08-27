package lesson_4_tasks;

/*
Дано слово. Верно ли, что оно начинается и заканчивается на одну и туже букву?
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String input = reader.readLine();

        char[] inputChar = input.toCharArray();

        if (inputChar[0] == inputChar[inputChar.length-1]) {
            System.out.println("Первая и последняя бувы совпадают!");
        }
        else {System.out.println("Первая и последняя бувы не совпадают!");}
    }
}