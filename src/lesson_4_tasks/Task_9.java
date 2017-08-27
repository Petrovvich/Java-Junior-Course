package lesson_4_tasks;

/*
Написать программу, которая проверяет является ли введенное с клавиатуры число – дробным
и
Написать программу, которая проверяет является ли введенное с клавиатуры число - целым
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_9 {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            Double input = Double.parseDouble(reader.readLine());

            if(input%1.0 == 0.0) {
                System.out.println("Число не является дробным!");
            }
            else {System.out.println("Число является дробным!");}
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
