import PizzaFranchise.*;
import PizzaFranchise.Regions.Chicago.ChicagoPizzaStore;
import PizzaFranchise.Regions.NewYork.NYPizzaStore;
import PizzaFranchise.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) throws Exception {
//        Duck mallardDuck = new MallardDuck();
//        Duck rubberDuck = new RubberDuck();
//        Duck modelDuck = new ModelDuck();

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

//        Character knight = new Knight();
//        knight.attack();
//        knight.setWeapon(new Spear());
//        knight.attack();
//
//        Character archer = new Archer();
//        archer.attack();
//        archer.setWeapon(new Axe());
//        archer.attack();

//        WeatherData weatherData = new WeatherData();
//        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
//        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
//        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
//        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
//
//        weatherData.setMeasurements(80, 65, 30.4f);
//        weatherData.setMeasurements(82, 70, 29.2f);
//        weatherData.setMeasurements(78, 90, 29.2f);

//        Beverage beverage = new Espresso();
//        System.out.println(beverage.getDescription()
//                + " $" + beverage.cost());
//
//        Beverage beverage2 = new DarkRoast();
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new Mocha(beverage2);
//        beverage2 = new WhippedCream(beverage2);
//        System.out.println(beverage2.getDescription()
//                + " $" + beverage2.cost());
//
//        Beverage beverage3 = new HouseBlend();
//        beverage3 = new Soy(beverage3);
//        beverage3 = new Mocha(beverage3);
//        beverage3 = new WhippedCream(beverage3);
//        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
//
//        InputStream io = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/home/hazemphoenix/IdeaProjects/HFDesignPatterns/src/test.txt")));
//        int c;
//        while ((c = io.read()) >= 0) {
//            System.out.print((char) c);
//        }
//
//        io.close();

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}


