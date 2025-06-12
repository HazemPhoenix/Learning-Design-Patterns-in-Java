//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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