package Builder;

public class Main {
    public static void main(String[] args){
        Vehicle car = new CarBuilder("Volvo").setDoors(4).setEngine("GNC").build();
        System.out.println(car.getDoors());
    }
}
