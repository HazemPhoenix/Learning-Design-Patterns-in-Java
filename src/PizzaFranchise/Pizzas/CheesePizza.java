package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

    public CheesePizza(PizzaIngredientFactory ingredientFactory, String name) {
        super(ingredientFactory, name);
    }

    public void prepare() {
        super.prepare();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
