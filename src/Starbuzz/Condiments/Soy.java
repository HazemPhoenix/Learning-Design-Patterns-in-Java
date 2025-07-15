package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class Soy extends Condiment{

    public Soy(Beverage b) {
        this.beverage = b;
        setPrice(.15);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with Soy" ;
    }
}
