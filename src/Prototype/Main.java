package Prototype;

public class Main {
    public static void main(String[] args){
        Car car = new Car();
        car.brand = "volvo";
        car.model = "WH 8";
        car.doors = 3;
        System.out.println(car.brand);

        try {
            Car clone = car.clonate();
            clone.brand = "Ford";
            System.out.println(clone.brand);
        } catch (CloneNotSupportedException e){
            System.out.println("Can't clone object" + e.getMessage());
        }
    }
}
