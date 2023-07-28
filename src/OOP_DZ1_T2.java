//Задача 2:
//Реализуйте класс "Прямоугольник" (Rectangle), который имеет свойства ширина (width) и высота (height). Класс должен обладать следующими методами:
//Конструктор без параметров, который создает прямоугольник с шириной и высотой по умолчанию.
//Конструктор, который принимает значения ширины и высоты и создает прямоугольник с заданными значениями.
//Методы доступа (геттеры и сеттеры) для свойств ширины и высоты.
//Метод "вычислить площадь" (calculateArea), который возвращает площадь прямоугольника (ширина * высота).
//Метод "вычислить периметр" (calculatePerimeter), который возвращает периметр прямоугольника (2 * (ширина + высота)).


public class OOP_DZ1_T2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle (9.0, 16);
        System.out.println("Ширина: " + rectangle.getWidth() + " Длина: " + rectangle.getHeight());
        rectangle.havecalculateAreay();
        rectangle.havecalculatePerimeter();
    }
}
class Rectangle {
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    private void calculateArea() { //
        double res1 = width * height;
        System.out.println("Площадь прямоугольника равна: " + res1);
    }
    public void havecalculateAreay() {
        calculateArea();
    }
    private void calculatePerimeter() { //
        double res2 = 2 * (width + height);
        System.out.println("Периметр прямоугольника равен: " + res2);
    }
    public void havecalculatePerimeter() {
        calculatePerimeter();
    }
}