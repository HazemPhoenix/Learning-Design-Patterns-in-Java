package Starbuzz.Condiments;

import Starbuzz.Beverage;
import com.sun.jdi.InvalidTypeException;

import java.util.HashMap;
import java.util.Map;

public abstract class Condiment extends Beverage {
    Beverage beverage;
    Map<Size, Double> price = new HashMap<>();

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public abstract String getDescription();

    @Override
    public double cost() throws Exception {
        switch(beverage.getSize()) {
            case Size.TALL: return Math.round((price.get(Size.TALL) + beverage.cost())* 100d) / 100d;
            case Size.GRANDE: return Math.round((price.get(Size.GRANDE) + beverage.cost())* 100d) / 100d;
            case Size.VENTI: return Math.round((price.get(Size.VENTI) + beverage.cost())* 100d) / 100d;
            default: throw new Exception("Invalid size");
        }
    }
}
