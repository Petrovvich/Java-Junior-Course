package lesson_2_tasks;

/*
Составить программу поиска четырехзначных чисел, которые при делении на 47 дают в остатке 43,
а при делении на 43 дают в остатке 47
 */

public class Task_1 {

    public static void main(String[] args) {
        int start = 1000;
        int end = 10000;

        for (int i = start; i < end; i++) {
            if(i % 47 == 0 && i % 43 == 0){
                System.out.println("Мы тут число нашли:" + i);
                System.out.println("Оно делится на 47 и 43 одновременно! ШОК! Фантастика!");
            }
        }
    }
}
