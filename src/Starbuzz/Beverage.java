package Starbuzz;

import java.util.ArrayList;
import java.util.List;

public abstract class Beverage {
    private double price;
    public enum Size {TALL, GRANDE, VENTI};
    private Size size = Size.VENTI;
    public String description = "Unknown Beverage";

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public double cost() throws Exception {
        return Math.round(getPrice() * 100d) / 100d;
    }

    public String getDescription() {
        return description;
    }
}
