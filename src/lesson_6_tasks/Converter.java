package lesson_6_tasks;

/*
Создать конвертер денежной валюты. Программа работает с 3 типами валют: рубли, доллары, евро.
Необходимо запросить у пользователя входные и выходные данные.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Converter {
    private final double RUB_EUR_COURSE = 68.65;
    private final double EUR_USD_COURSE = 1.19;
    private final double RUB_USD_COURSE = 57.17;
    private final double USD_EUR_COURSE = 0.84;
    private final double USD_RUB_COURSE = 0.017;
    private final double EUR_RUB_COURSE = 0.014;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String input() throws IOException {
        String input = reader.readLine();
        return input;
    }

    public double calculate(String inputCurrency, int inputSymmary, String outputCurrency) {
        if (inputCurrency.equalsIgnoreCase("RUB") && outputCurrency.equalsIgnoreCase("EUR")) {
            double result = inputSymmary * EUR_RUB_COURSE;
            return result;
        }
        else if (inputCurrency.equalsIgnoreCase("RUB") && outputCurrency.equalsIgnoreCase("USD")) {
            double result = inputSymmary * USD_RUB_COURSE;
            return result;
        }
        else if (inputCurrency.equalsIgnoreCase("EUR") && outputCurrency.equalsIgnoreCase("USD")) {
            double result = inputSymmary * USD_EUR_COURSE;
            return result;
        }
        else if (inputCurrency.equalsIgnoreCase("EUR") && outputCurrency.equalsIgnoreCase("RUB")) {
            double result = inputSymmary * RUB_EUR_COURSE;
            return result;
        }
        else if (inputCurrency.equalsIgnoreCase("USD") && outputCurrency.equalsIgnoreCase("EUR")) {
            double result = inputSymmary * EUR_USD_COURSE;
            return result;
        }
        else {
            double result = inputSymmary * RUB_USD_COURSE;
            return result;
        }
    }

    public Converter() throws IOException {
        System.out.println("Введите, пожалуйста валюту, из которой необходимо перевести (RUB, USD, EUR):");
        String currency = input();
        int inputSummany = 0;
        try {
            System.out.println("Введите, пожалуйста сумму, которую необходимо перевести:");
            inputSummany = Integer.parseInt(input());
        } catch (Exception e) {
            System.out.println("Вы ввели некорректную сумму, повторите, пожалуйста, действие!");
        }

        System.out.println("Введите, пожалуйста валюту, в которую необходимо перевести (RUB, USD, EUR):");
        String outputCurrency = input();

        System.out.println("Получится:" + calculate(currency, inputSummany, outputCurrency) + " " + outputCurrency.toUpperCase());

    }

    public static void main(String[] args) throws IOException {
        new Converter();
    }
}