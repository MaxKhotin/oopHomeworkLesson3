package Task2;
//Используя IntelliJ IDEA, создайте проект.
//        Требуется:
//        Создать класс Vehicle.
//        В теле класса создайте поля: координаты и параметры средств передвижения (цена, скорость, год
//        выпуска).
//        Создайте 3 производных класса Plane, Саг и Ship.
//        Для класса Plane должна быть определена высота и количество пассажиров.
//        Для класса Ship – количество пассажиров и порт приписки.
//        Написать программу, которая выводит на экран информацию о каждом средстве передвижения.
public class Main {
    public static void main(String[] args) {
        Ship ship = new Ship("325.167",20000000, 100, 1989,"Kyiv",1800);
        Car car = new Car("145.333",1000000,240,2020);
        Plane plane = new Plane("567.123",153241414,800,1999,10000,300);
        ship.showInfo();
        car.showInfo();
        plane.showInfo();
    }
}