package lesson_7_tasks.shape;

/*
Создайте базовый класс, который определяет общие свойства геометрической фигуры.
Используя эти свойства, создайте класс для треугольника, прямоугольника, квадрата и определите их площадь.
Для треугольника проверить – является ли он равнобедренным.
 */


public class BaseShape {

    private int lenght;
    private int width;
    private int height;
    private int countOfSides;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getCountOfSides() {
        return countOfSides;
    }

    public void setCountOfSides(int countOfSides) {
        this.countOfSides = countOfSides;
    }
}
