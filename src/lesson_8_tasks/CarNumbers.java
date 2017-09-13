package lesson_8_tasks;

/*
Подумайте над решением задачи:
Сгенерировать список номеров автомобилей и сделать метод, который будет проверять наличие номера в списке. 
 */


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class CarNumbers {

    public String generateRandomCarNumber() {
        String sample = "АВЕКМНОРСТУХ";
        String sampleNumber = "1234567890";
        int count = 8;
        String result = "";
        Random random = new Random();
        while(count > 0) {
            if(count > 6) {
                result += sample.charAt(random.nextInt(sample.length()));
            }
            if (count > 3 && count < 7) {
                result += sampleNumber.charAt(random.nextInt(sampleNumber.length()));
            }
            if (count == 3) {
                result += sample.charAt(random.nextInt(sample.length()));
            }
            if (count < 3) {
                result += sampleNumber.charAt(random.nextInt(sampleNumber.length()));
            }
            count--;
        }
        return result;
    }

    public ArrayList initializeArrayOfCarNumbers() {
        ArrayList<String> arrayCarNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayCarNumbers.add(this.generateRandomCarNumber());
        }
        return arrayCarNumbers;
    }

    public boolean searchNumberInArray(String number) {
        ArrayList arrayCarNumbers = this.initializeArrayOfCarNumbers();
        if (arrayCarNumbers.contains(number)) {
            return true;
        }
        return false;
    }

    public CarNumbers() {
        this.generateRandomCarNumber();
        this.initializeArrayOfCarNumbers();
    }

    public static void main(String[] args) throws IOException {
        CarNumbers carNumbers = new CarNumbers();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите, пожалуйста, номер для поиска в списке");
        String input = reader.readLine();
        boolean isContains = carNumbers.searchNumberInArray(input);
        if (isContains) {
            System.out.println("Номер содержится в списке!");
        }
        System.out.println("Номер не содержится в списке!");
    }
}
