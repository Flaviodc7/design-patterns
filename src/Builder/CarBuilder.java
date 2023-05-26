package Builder;

public class CarBuilder {
    Vehicle vehicle;
    public CarBuilder(String brand){
        vehicle = new Vehicle();
        vehicle.setBrand(brand);
    }
    public CarBuilder setDoors(int doors){
        vehicle.setDoors(doors);
        return this;
    }

    public CarBuilder setEngine(String engine){
        vehicle.setEngine(engine);
        return this;
    }
    public Vehicle build(){
        return vehicle;
    }
}
