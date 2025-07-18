package PizzaFranchise.Ingredients;

import PizzaFranchise.Ingredients.Cheese.Cheese;
import PizzaFranchise.Ingredients.Clam.Clam;
import PizzaFranchise.Ingredients.Dough.Dough;
import PizzaFranchise.Ingredients.Pepperoni.Pepperoni;
import PizzaFranchise.Ingredients.Sauce.Sauce;
import PizzaFranchise.Ingredients.Veggies.Veggie;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();
    public Clam createClam();
    public Veggie[] createVeggies();
}
