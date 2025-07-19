package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza{

    public ClamPizza(PizzaIngredientFactory ingredientFactory, String name) {
        super(ingredientFactory, name);
    }

    @Override
    public void prepare() {
        super.prepare();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
    }
}
