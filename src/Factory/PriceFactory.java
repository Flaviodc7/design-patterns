package Factory;

import java.util.Objects;

public class PriceFactory {
    Price price;
    private PriceFactory(){};

    public PriceFactory(String country){
        if (country.equalsIgnoreCase("Spain")){
            System.out.println("The country is Spain");
            this.price = new PriceEUR();
        } else if (country.equalsIgnoreCase("USA")){
            System.out.println("The country is USA");
            this.price = new PriceUSD();
        }

    }
    public double getPrice(){
        return price.getPrice();
    }
}
