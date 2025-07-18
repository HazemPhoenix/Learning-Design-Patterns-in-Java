package PizzaFranchise.Pizzas;

import PizzaFranchise.Ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza{
    public VeggiePizza(PizzaIngredientFactory ingredientFactory){
        super(ingredientFactory);
        setName("Veggie Pizza");
    }

    @Override
    public void prepare() {
        super.prepare();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
