package lesson_1_tasks;

/*
Исправить код таким образом чтобы ГИБДД не выписывала штраф в случае если скорость движения ТС ниже 80 км/ч.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task_12_gibdd_1 {

    public static void main(String[] args) throws IOException
    {
        //Параметры программы
        Integer maxAccessSpeed = 80; // km/h максимально допустимая скорость
        Integer speedGrade = 20; // km/h граница скорости, т.е. каждые 20 км штраф увеличивается на fineGrade
        Integer fineGrade = 500; // RUB минимальный штраф
        Integer dangerSpeed = 180; // km/h критическая скорость

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
            Integer fine = fineGrade * gradesCount;
            System.out.println("Сумма штрафа: " + fine);
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}