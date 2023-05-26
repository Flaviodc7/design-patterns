package Prototype;

public class Car implements Cloneable {
    public String brand;
    public String model;
    int doors;

    public Car(){}

    public Car clonate() throws CloneNotSupportedException{
        return (Car)this.clone();
    }
}
