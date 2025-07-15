package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class SkimmedMilk extends Condiment{

    public SkimmedMilk(Beverage b) {
        super(b);
        setPrice(0.15);
    }

    public String getDescription(){
        return beverage.getDescription() +   " with Skimmed Milk";
    }
}
