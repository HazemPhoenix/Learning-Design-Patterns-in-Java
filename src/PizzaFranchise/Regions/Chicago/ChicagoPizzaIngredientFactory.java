package PizzaFranchise.Regions.Chicago;

import PizzaFranchise.Ingredients.Cheese.Cheese;
import PizzaFranchise.Ingredients.Cheese.MozzarellaCheese;
import PizzaFranchise.Ingredients.Clam.Clam;
import PizzaFranchise.Ingredients.Clam.FrozenClam;
import PizzaFranchise.Ingredients.Dough.Dough;
import PizzaFranchise.Ingredients.Dough.ThickCrustDough;
import PizzaFranchise.Ingredients.Pepperoni.Pepperoni;
import PizzaFranchise.Ingredients.Pepperoni.SlicedPepperoni;
import PizzaFranchise.Ingredients.PizzaIngredientFactory;
import PizzaFranchise.Ingredients.Sauce.PlumTomatoSauce;
import PizzaFranchise.Ingredients.Sauce.Sauce;
import PizzaFranchise.Ingredients.Veggies.BlackOlives;
import PizzaFranchise.Ingredients.Veggies.EggPlant;
import PizzaFranchise.Ingredients.Veggies.Spinach;
import PizzaFranchise.Ingredients.Veggies.Veggie;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Veggie[] createVeggies() {
        return new Veggie[] {new Spinach(), new EggPlant(), new BlackOlives()};
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }
}
