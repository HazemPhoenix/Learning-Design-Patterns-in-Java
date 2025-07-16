package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class Soy extends Condiment{

    public Soy(Beverage b) {
        this.beverage = b;
        price.put(Size.TALL, 0.10);
        price.put(Size.GRANDE, 0.15);
        price.put(Size.VENTI, 0.20);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy" ;
    }
}
