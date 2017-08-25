package lesson_2_tasks;

/*
Написать код с использованием цикла do... while, который будет последовательно
распечатывать в консоли номера билетов от 200000 до 210000.
 */

public class Task_4 {

    public static void main(String[] args) {

        int start = 200000;
        int finish = 210001;

        do {
            System.out.println(start);
            start++;
        }  while (start < finish);
    }
}
