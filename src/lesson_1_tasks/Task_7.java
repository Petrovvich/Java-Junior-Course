package lesson_1_tasks;

/*
Написать программу определения стоимости разговора по телефону с учетом скидки 20%,
предоставляемой по субботам и воскресеньям
 */

public class Task_7 {

    public static void main(String[] args) {

        int dayOfWeek = (int) (Math.random() * 6 + 1);

        //тарификация посеундная
        int durationOfCalls = 123;

        //стоимость секунды в копейках (дорого, но, допустим, что это междугородные переговоры)
        int price = 3;

        double discount = 0.7;

        System.out.println("День недели: " + dayOfWeek);

        if (dayOfWeek == 6 || dayOfWeek == 7) {
            price = (int) (durationOfCalls * price * discount);
            System.out.println(price);
        } else {
            System.out.println(durationOfCalls * price);
        }
    }
}
