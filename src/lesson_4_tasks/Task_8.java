package lesson_4_tasks;

/*
Разработать программу вывода слова на экран справа – налево.
Через Scanner вводите предложение и на выходе получаем строку в обратной последовательности.
*/

import java.util.Scanner;

public class Task_8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку для переворота:");

        StringBuffer buffer = new StringBuffer(scanner.nextLine());

        System.out.println(buffer.reverse());
    }
}
