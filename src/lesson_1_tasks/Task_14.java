package lesson_1_tasks;

/*
(*) Написать программу, которая производит разбиение трехзначного числа на цифры и находит максимальную цифру.
Трехзначное число является целым числом и вводится с клавиатуры.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_14 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите трехзначное число: ");

        int number = Integer.parseInt(reader.readLine());


        reader.close();

        int numOfHundreds = number/100;
        int numOfDozens = (number%100)/10;
        int numOfUnits = number%10;

        int max = Math.max(numOfHundreds, Math.max(numOfDozens, numOfUnits));

        System.out.println("Наибольшая цифра в введенном числе: " + max);
    }
}
