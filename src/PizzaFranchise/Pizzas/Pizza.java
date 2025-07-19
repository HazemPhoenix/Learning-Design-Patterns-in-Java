package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.Cheese.Cheese;
import PizzaFranchise.Ingredients.Clam.Clam;
import PizzaFranchise.Ingredients.Dough.Dough;
import PizzaFranchise.Ingredients.Pepperoni.Pepperoni;
import PizzaFranchise.Ingredients.PizzaIngredientFactory;
import PizzaFranchise.Ingredients.Sauce.Sauce;
import PizzaFranchise.Ingredients.Veggies.Veggie;

public abstract class Pizza {
    protected String name;

    Dough dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    PizzaIngredientFactory pizzaIngredientFactory;

    public Pizza(PizzaIngredientFactory pizzaIngredientFactory, String name) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
        setName(name);
    }

    public void  prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cut the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //    public String toString() {
//        StringBuffer display = new StringBuffer();
//        display.append("---- " + name + " ----\n");
//        display.append(dough + "\n");
//        display.append(sauce + "\n");
//        for (String topping : toppings) {
//            display.append(topping + "\n");
//        }
//        return display.toString();
//    }
}


