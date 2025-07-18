package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza{

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        setName("Clam Pizza");
    }

    @Override
    public void prepare() {
        super.prepare();
        cheese = pizzaIngredientFactory.createCheese();
        clam = pizzaIngredientFactory.createClam();
    }
}
