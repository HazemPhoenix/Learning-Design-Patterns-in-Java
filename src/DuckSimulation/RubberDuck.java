package DuckSimulation;

public class RubberDuck extends Duck {
    public RubberDuck() {
        this.setFlyBehavior(new FlyNoWay());
        this.setQuackBehavior(new Squeak());
    }
}
