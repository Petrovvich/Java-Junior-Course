package lesson_1_tasks;

/*
Исправить код так чтобы штраф был уменьшен в 2 раза если срок оплаты менее 30 дней
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_13_gibdd_2 {

    public static void main(String[] args) throws IOException {
        //Параметры программы
        Integer maxAccessSpeed = 80; // km/h максимально допустимая скорость
        Integer speedGrade = 20; // km/h граница скорости, т.е. каждые 20 км штраф увеличивается на fineGrade
        Integer fineGrade = 500; // RUB минимальный штраф
        Integer dangerSpeed = 180; // km/h критическая скорость
        Integer daysForDiscount = 30; //количество дней для оплаты со скидкой
        Integer dayOfPay = (int) (Math.random() * 60); //день оплаты штрафа - в интервале [0;60]

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        Integer oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if(oncomingSpeed >= dangerSpeed)
        {
            System.out.println("Немедленно остановитесь!");
        }
        else if(oncomingSpeed > maxAccessSpeed)
        {
            Integer overSpeed = oncomingSpeed - maxAccessSpeed;
            Integer gradesCount = overSpeed / speedGrade; //коэффициент штрафа

            if (dayOfPay <= daysForDiscount) {
                Integer fine = (fineGrade * gradesCount) / 2;
                System.out.println("Сумма штрафа: " + fine);
                System.out.println("День оплаты штрафа: " + dayOfPay);
            } else {
                Integer fine = fineGrade * gradesCount;
                System.out.println("Сумма штрафа: " + fine);
                System.out.println("День оплаты штрафа: " + dayOfPay);
            }
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}
