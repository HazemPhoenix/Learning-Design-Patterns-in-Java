package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class Mocha extends Condiment{

    public Mocha(Beverage b) {
        this.beverage = b;
        setPrice(.20);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }
}
