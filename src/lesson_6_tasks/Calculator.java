package lesson_6_tasks;

/*
Разработать шаблон калькулятора, который должен производить 4 базовых действия – сложение, умножение,
вычитание и деление. Решить задачу, используя параметризованный конструктор.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    public int multiplicate(int a, int b) {
        int result = a * b;
        return result;
    }

    public int summary(int a, int b) {
        int result = a + b;
        return result;
    }

    public int deduction(int a, int b){
        int result = a - b;
        return result;
    }

    public String getOperation() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите, пожалуйста, операцию: +-*/");
        String operation = reader.readLine();
        return operation;
    }

    public int getNumber() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите, пожалуйста, число:");
        int number = Integer.parseInt(reader.readLine());
        return number;
    }

    public Calculator() throws IOException {
        int firstNumber = getNumber();
        int secondNumber = getNumber();
        String operation = getOperation();

        if (operation.equals("/") && secondNumber == 0) {
            System.out.println("Ну что же вы, сударь, на ноль делить вздумали!");
            return;
        }
        switch (operation) {
            case "/":
                System.out.println("Результат: " + divide(firstNumber, secondNumber));
                break;
            case "+":
                System.out.println("Результат: " + summary(firstNumber, secondNumber));
                break;
            case "-":
                System.out.println("Результат: " + deduction(firstNumber, secondNumber));
                break;
            case "*":
                System.out.println("Результат: " + multiplicate(firstNumber, secondNumber));
                break;
        }
    }

    public static void main(String[] args) throws IOException {

        new Calculator();
    }
}
