package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class SkimmedMilk extends Condiment{

    public SkimmedMilk(Beverage b) {
        this.beverage = b;
        price.put(Size.TALL, 0.10);
        price.put(Size.GRANDE, 0.15);
        price.put(Size.VENTI, 0.20);
    }

    public String getDescription(){
        return beverage.getDescription() +   ", Skimmed Milk";
    }
}
