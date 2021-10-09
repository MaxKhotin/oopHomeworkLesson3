package Task2;

public class Plane extends Vehicle {
    private int flightAltitude;
    private int numberOfPassengers;
    Plane(String coordinates, int price, int speed, int productionYear, int flightAltitude, int numberOfPassengers) {
        super(coordinates,price,speed,productionYear);
        this.flightAltitude=flightAltitude;
        this.numberOfPassengers=numberOfPassengers;
    }
    @Override
    void showInfo(){
        super.showInfo();
        System.out.print(" Высота полёта: "+flightAltitude+" Количество пассажиров: " + numberOfPassengers);
    }
}
