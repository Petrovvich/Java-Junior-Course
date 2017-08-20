package lesson_1_tasks;

/*
Написать программу, которая проверяет принадлежит ли случайно
сгенерированное число из отрезка  (-10,10) интервалу [-3,5].
 */

public class Task_10 {

    public static void main(String[] args) {

        int randNumber = (int) (Math.random() * 20 - 10);

        if (randNumber >= (-3) && randNumber <= 5) {
            System.out.println("Случайное число принадлежит интервалу [-3;5]");
        } else {System.out.println("Случайное число не принадлежит интервалу [-3;5]");}
    }
}
