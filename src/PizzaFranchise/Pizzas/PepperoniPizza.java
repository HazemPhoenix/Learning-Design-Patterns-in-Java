package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory, String name) {
        super(ingredientFactory, name);
    }

    @Override
    public void prepare() {
        super.prepare();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
