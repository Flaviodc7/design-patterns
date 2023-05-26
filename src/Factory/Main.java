package Factory;

public class Main {
    public static void main(String[]args){
        PriceFactory price = new PriceFactory("UsA");
        System.out.println(price.getPrice());
    }
}
