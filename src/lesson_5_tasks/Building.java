package lesson_5_tasks;

/*
Создать класс Building, который хранит информацию о зданиях(количество этажей, общая площадь этажа, количество жильцов).
Необходимо вычислить площадь, приходящуюся на одного жильца дома.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Building {

    private int numOfFloors;
    private double squareOfFloor;
    private int numOfDwellers;

    public void initializeFields(int numOfFloors, double squareOfFloor, int numOfDwellers) {
        this.numOfFloors = numOfFloors;
        this.squareOfFloor = squareOfFloor;
        this.numOfDwellers = numOfDwellers;
    }

    public double calculate (int numOfFloors, double squareOfFloor, int numOfDwellers) {
        double result = (double) ((numOfFloors * squareOfFloor)/numOfDwellers);
        return result;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите, пожалуйста, количество этажей в доме:");
        int inputNumOfFloors = Integer.parseInt(reader.readLine());

        System.out.println("Введите, пожалуйста, площадь этажа:");
        double inputSquareOfFloor = Double.parseDouble(reader.readLine());

        System.out.println("Введите, пожалуйста, количество жильцов в доме:");
        int inputNumOfDwellers = Integer.parseInt(reader.readLine());

        Building building = new Building();

        building.initializeFields(inputNumOfFloors, inputSquareOfFloor, inputNumOfDwellers);

        System.out.println("Площадь, приходящаяся на одного жильца: "
                + building.calculate(building.numOfFloors, building.squareOfFloor, building.numOfDwellers));
    }
}
