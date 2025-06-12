import DuckSimulation.*;
import MedievalFights.*;
import MedievalFights.Character;

public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        Duck rubberDuck = new RubberDuck();
        Duck modelDuck = new ModelDuck();

//        mallardDuck.performFly();
//        rubberDuck.performFly();
//        modelDuck.performFly();
//
//        mallardDuck.performQuack();
//        rubberDuck.performQuack();
//        modelDuck.performQuack();
//
//        mallardDuck.setQuackBehavior(new Squeak());
//        mallardDuck.performQuack();
//
//        modelDuck.setFlyBehavior(new FlyRocketPowered());
//        modelDuck.performFly();

//        DuckCall dc = new DuckCall();
//        dc.performQuack();
//
//        dc.setQuackBehavior(new Squeak());
//        dc.performQuack();

        Character knight = new Knight();
        knight.attack();
        knight.setWeapon(new Spear());
        knight.attack();

        Character archer = new Archer();
        archer.attack();
        archer.setWeapon(new Axe());
        archer.attack();
    }
}