package lesson_7_tasks.shape;

public class Rectangle extends  BaseShape {

    public double square(int lenght, int height) {
        double square = (lenght * height) / 2;
        return square;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        rectangle.setCountOfSides(3);
        rectangle.setLenght(20);
        rectangle.setHeight(24);

        int length = rectangle.getLenght();
        int height = rectangle.getHeight();
        System.out.println("Площадь треугольника: " + rectangle.square(length, height));
    }
}
