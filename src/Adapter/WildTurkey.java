package Adapter;

public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("Turkey is flying for a short distance!");
    }
}
