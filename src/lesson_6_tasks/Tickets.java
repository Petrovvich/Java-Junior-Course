package lesson_6_tasks;

/*
Разработать программу, которая называется «счастливые билетики» - трамвайный билет
называется счастливым если сумма цифр с правой стороны равна сумме цифр с левой xxxx|xxxx.
Если в билете нечетное количество цифр то предполагается, что он обычный.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tickets {

    public String getNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите, пожалуйста, номер билета для проверки:");
        String number = reader.readLine();
        return number;
    }

    public boolean isValid(String number) {
        char[] charNumber = number.toCharArray();
        if (charNumber.length%2 == 0 && charNumber.length > 5) {
            return true;
        }
        return false;
    }

    public boolean isHappiness(String number) {
        char[] firstHalf = number.substring(0, (number.length()/2-1)).toCharArray();
        char[] secondHalf = number.substring(number.length()/2, number.length() - 1).toCharArray();

        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;

        for (int d = 0; d < firstHalf.length - 1; d++) {
            sumOfFirstHalf +=Character.getNumericValue(firstHalf[d]);
        }
        for (int i = 0; i < secondHalf.length - 1; i++) {
            sumOfSecondHalf +=Character.getNumericValue(secondHalf[i]);
        }

        if (sumOfFirstHalf == sumOfSecondHalf) {
            return true;
        }
        return false;
    }

    public Tickets() throws IOException {

        String number = getNumber();
        boolean isValid = isValid(number);
        boolean isHappiness = isHappiness(number);

        if (isValid && isHappiness) {
            System.out.println("Введенный номер билета счастливый!");
        }
        else {
            System.out.println("Введенный номер билета не счастливый :(");
        }
    }

    public static void main(String[] args) throws IOException {
        new Tickets();
    }
}
