package PizzaFranchise.Regions.Chicago;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;
import PizzaFranchise.Pizzas.*;
import PizzaFranchise.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String item) {
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        Pizza pizza = null;

        if (item.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory, "Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory, "Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory, "Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory, "Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
