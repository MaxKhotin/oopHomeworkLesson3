package Task2;

public class Ship extends Vehicle{
    private int numberOfPassengers;
    private String homePort;
    Ship(String coordinates, int price, int speed, int productionYear, String homePort, int numberOfPassengers) {
        super(coordinates, price, speed, productionYear);
        this.numberOfPassengers=numberOfPassengers;
        this.homePort=homePort;
    }
    @Override
    void showInfo(){
        super.showInfo();
        System.out.print(" Колличество пассажиров: " + numberOfPassengers +" Порт приписки: " +homePort);
    }
}
