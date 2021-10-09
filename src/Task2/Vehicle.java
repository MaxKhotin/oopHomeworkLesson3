package Task2;

public class Vehicle {
    private String coordinates;
    private int price;
    private int speed;
    private int productionYear;

    Vehicle(){}

    Vehicle(String coordinates, int price, int speed, int productionYear){
        this.coordinates=coordinates;
        this.price=price;
        this.speed=speed;
        this.productionYear=productionYear;
    }

    void showInfo(){
        System.out.println(" Координаты: " + coordinates + " Цена: " + price + " Скорость: " + speed + " Год производства: " + productionYear);
    }
}
