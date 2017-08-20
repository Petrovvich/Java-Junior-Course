package lesson_1_tasks;

/*
Создать 3 переменные с годами выпуска автомобиля.
Переменные должны создаваться случайным образом в определенном диапазоне.
Вывести года выпуска в порядке убывания.
 */

public class Task_9 {

    public static void main(String[] args) {

        //интервал 1960-2017
        int firstYear = (int) (Math.random()*57 + 1960);
        int secondYear = (int) (Math.random()*57 + 1960);
        int thirdYear = (int) (Math.random()*57 + 1960);

        System.out.println("Первый год выпуска: " + firstYear);
        System.out.println("Второй год выпуска: " + secondYear);
        System.out.println("Третий год выпуска: " + thirdYear);
        System.out.println();

        int max = Math.max(firstYear, Math.max(secondYear, thirdYear));

        int min = Math.min(firstYear, Math.min(secondYear, thirdYear));

        if (max != firstYear && min != firstYear) {
            System.out.println(max);
            System.out.println(firstYear);
            System.out.println(min);
        } else if (max != secondYear && min != secondYear) {
            System.out.println(max);
            System.out.println(secondYear);
            System.out.println(min);
        } else {
            System.out.println(max);
            System.out.println(thirdYear);
            System.out.println(min);
        }

    }
}
