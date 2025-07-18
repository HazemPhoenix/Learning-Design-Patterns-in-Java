package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza{
    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        super(ingredientFactory);
        setName("Pepperoni Pizza");
    }

    @Override
    public void prepare() {
        super.prepare();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
