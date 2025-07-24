package Adapter;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("Duck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
