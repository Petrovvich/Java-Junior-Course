package lesson_1_tasks;

/*
 Дано трехзначное число. Найти число десятков, число единиц и произведение цифр
 **/

public class Task_4 {

    public static void main(String[] args) {

        int a = 123;

        int numOfHundreds = a/100;
        int numOfDozens = (a%100)/10;
        int numOfUnits = a%10;

        System.out.println("Количество сотен в числе: " + numOfHundreds);
        System.out.println("Количество десяток в числе: " + numOfDozens);
        System.out.println("Количество единиц в числе: " + numOfUnits);

        System.out.println("Произведение цифр: " + (numOfHundreds * numOfDozens * numOfUnits));

    }
}
