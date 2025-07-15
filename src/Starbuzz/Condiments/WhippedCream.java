package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class WhippedCream extends Condiment{

    public WhippedCream(Beverage b) {
        this.beverage = b;
        setPrice(.10);
    }

    public String getDescription(){
        return beverage.getDescription() + " with Whipped Cream";
    }

}
