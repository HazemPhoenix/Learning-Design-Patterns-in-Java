package Starbuzz.Condiments;

import Starbuzz.Beverage;

public class WhippedCream extends Condiment{

    public WhippedCream(Beverage b) {
        super(b);
        setPrice(0.30);
    }

    public String getDescription(){
        return beverage.getDescription() + " with Whipped Cream";
    }

}
