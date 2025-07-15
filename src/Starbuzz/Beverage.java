package Starbuzz;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    private double price;
    public String description = "Unknown Beverage";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public double cost() {
        return Math.round(getPrice() * 100d) / 100d;
    }

    public String getDescription() {
        return description;
    }
}
