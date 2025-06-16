import DuckSimulation.*;
import MedievalFights.*;
import MedievalFights.Character;
import WeatherORama.*;

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

//        Character knight = new Knight();
//        knight.attack();
//        knight.setWeapon(new Spear());
//        knight.attack();
//
//        Character archer = new Archer();
//        archer.attack();
//        archer.setWeapon(new Axe());
//        archer.attack();

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}