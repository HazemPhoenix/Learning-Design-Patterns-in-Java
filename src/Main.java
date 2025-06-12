import DuckSimulation.*;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck modelDuck = new ModelDuck();

        mallardDuck.performFly();
        rubberDuck.performFly();
        modelDuck.performFly();

        mallardDuck.performQuack();
        rubberDuck.performQuack();
        modelDuck.performQuack();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();

        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
    }
}