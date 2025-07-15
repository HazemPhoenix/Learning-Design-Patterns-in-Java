package Starbuzz.Condiments;

import Starbuzz.Beverage;

public abstract class Condiment extends Beverage {
    Beverage beverage;

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();

    @Override
    public double cost() {
        return Math.round((getPrice() + beverage.cost())* 100d) / 100d;
    }
}
