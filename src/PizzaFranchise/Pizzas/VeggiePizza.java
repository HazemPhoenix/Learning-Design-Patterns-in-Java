package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    public VeggiePizza(PizzaIngredientFactory ingredientFactory, String name){
        super(ingredientFactory, name);
    }

    @Override
    public void prepare() {
        super.prepare();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
