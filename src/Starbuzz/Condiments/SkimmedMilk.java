package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class SkimmedMilk extends Condiment{

    public SkimmedMilk(Beverage b) {
        this.beverage = b;
        setPrice(.10);
    }

    public String getDescription(){
        return beverage.getDescription() +   " with Skimmed Milk";
    }
}
