import DuckSimulation.Duck;
import DuckSimulation.MallardDuck;
import DuckSimulation.RubberDuck;
import DuckSimulation.Squeak;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();

        mallardDuck.performFly();
        rubberDuck.performFly();

        mallardDuck.performQuack();
        rubberDuck.performQuack();

        mallardDuck.setQuackBehavior(new Squeak());
        mallardDuck.performQuack();
    }
}