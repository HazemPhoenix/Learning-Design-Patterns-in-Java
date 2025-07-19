package PizzaFranchise.Regions.NewYork;

import PizzaFranchise.Ingredients.Clam.Clam;
import PizzaFranchise.Ingredients.PizzaIngredientFactory;
import PizzaFranchise.Pizzas.*;
import PizzaFranchise.PizzaStore;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        Pizza pizza = null;

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory, "New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory, "New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory, "New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory, "New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}