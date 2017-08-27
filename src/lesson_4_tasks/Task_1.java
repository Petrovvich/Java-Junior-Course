package lesson_4_tasks;

/*
Реализовать программу расчета прибыли от депозита в банке для нескольких клиентов.
Используйте массив
 */

public class Task_1 {

    public static void main(String[] args) {

        int[][] investors = {{100000, 9, 5},
                             {90000, 8, 6},
                             {150000, 6, 18}};

        for (int i = 0; i <= investors.length-1; i++) {

            int money = investors[i][0];

            System.out.println("Вкладчик #" + (i+1));

            for (int j = 1; j <= investors[i][1]; j++) {

                int profit = (money * investors[i][1]) / 100;

                money += profit;

                System.out.println("За " + j + " год сумма вклада вырастет на " + profit + " и составит " + money);
            }
            System.out.println();
        }

    }
}
