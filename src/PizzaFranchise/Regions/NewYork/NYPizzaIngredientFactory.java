package PizzaFranchise.Regions.NewYork;


import PizzaFranchise.Ingredients.Cheese.Cheese;
import PizzaFranchise.Ingredients.Cheese.ReggianoCheese;
import PizzaFranchise.Ingredients.Clam.Clam;
import PizzaFranchise.Ingredients.Clam.FreshClam;
import PizzaFranchise.Ingredients.Dough.Dough;
import PizzaFranchise.Ingredients.Dough.ThinCrustDough;
import PizzaFranchise.Ingredients.Pepperoni.Pepperoni;
import PizzaFranchise.Ingredients.Pepperoni.SlicedPepperoni;
import PizzaFranchise.Ingredients.PizzaIngredientFactory;
import PizzaFranchise.Ingredients.Sauce.MarinaraSauce;
import PizzaFranchise.Ingredients.Sauce.Sauce;
import PizzaFranchise.Ingredients.Veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[] {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }
}
