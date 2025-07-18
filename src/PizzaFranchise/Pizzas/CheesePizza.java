package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        setName("Cheese Pizza");
    }

    public void prepare() {
        super.prepare();
        cheese = pizzaIngredientFactory.createCheese();
    }
}
