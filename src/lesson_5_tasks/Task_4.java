package lesson_5_tasks;

/*
Даны два натуральных числа. Определить в каком из них сумма цифр больше.
(Определить метод для расчета суммы цифр целого числа)
Подсказка: для преобразования типа char в int используйте метод
getNumericValue(пепеменная типа char) из класса Character.
 */

public class Task_4 {

    void calculateAndCompareTwoNumbers(String firstNumber, String secondNumber) {

        char [] firstNumberInCharArray = firstNumber.toCharArray();
        char [] secondNumberInCharArray = secondNumber.toCharArray();
        int firstSum = 0;
        for (char c : firstNumberInCharArray) {
            firstSum += Character.getNumericValue(c);
        }
        int secondSum = 0;
        for (char c : secondNumberInCharArray) {
            secondSum+= Character.getNumericValue(c);
        }

        if (firstSum > secondSum) {
            System.out.println("Наибольшая сумма цифр у первого числа: " + firstNumber + "\n"
                    + "Сумма: " + firstSum);
        }
        else {
            System.out.println("Наибольшая сумма цифр у второго числа: " + secondNumber + "\n"
                    + "Сумма: " + secondSum);
        }
    }

    public static void main(String[] args) {
        new Task_4().calculateAndCompareTwoNumbers("145", "154");
    }
}
