import SmartHome.*;
import SmartHome.Garage.GarageDoor;
import SmartHome.Garage.GarageDoorCloseCommand;
import SmartHome.Garage.GarageDoorOpenCommand;
import SmartHome.Lights.Light;
import SmartHome.Lights.LightOffCommand;
import SmartHome.Lights.LightOnCommand;
import SmartHome.Stereos.Stereo;
import SmartHome.Stereos.StereoOffCommand;
import SmartHome.Stereos.StereoOnWithCDCommand;
import SmartHome.Stereos.StereoOnWithDVDCommand;

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

//        PizzaStore nyStore = new NYPizzaStore();
//        PizzaStore chicagoStore = new ChicagoPizzaStore();
//
//        Pizza pizza = nyStore.orderPizza("cheese");
//        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
//
//        pizza = chicagoStore.orderPizza("cheese");
//        System.out.println("Joel ordered a " + pizza.getName() + "\n");

//        ChocolateBoiler chocolateBoiler = ChocolateBoiler.UNIQUE_INSTANCE;
//        System.out.println("isEmpty before filling: " + chocolateBoiler.isEmpty());
//        chocolateBoiler.fill();
//        System.out.println("isEmpty after filling: " + chocolateBoiler.isEmpty());
//        System.out.println("isBoiled before boiling: " + chocolateBoiler.isBoiled());
//        chocolateBoiler.boil();
//        System.out.println("isBoiled After boiling: " + chocolateBoiler.isBoiled());
//        chocolateBoiler.drain();
//        System.out.println("isEmpty after draining: " + chocolateBoiler.isEmpty());
//        System.out.println("isBoiled After draining: " + chocolateBoiler.isBoiled());


        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Stereo stereo = new Stereo("Living Room");
        Stereo stereo2 = new Stereo("Bedroom Room");

        LightOnCommand livingRoomLightOn =
                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =
                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =
                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff =
                new LightOffCommand(kitchenLight);

        GarageDoorOpenCommand garageDoorUp =
                new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorDown =
                new GarageDoorCloseCommand(garageDoor);

        StereoOnWithCDCommand stereoOnWithCD =
                new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff =
                new StereoOffCommand(stereo);

        StereoOnWithDVDCommand stereoOnWithDVDCommand = new StereoOnWithDVDCommand(stereo2);
        StereoOffCommand stereoOffCommand = new StereoOffCommand(stereo2);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, stereoOnWithCD, stereoOff);
        remoteControl.setCommand(3, stereoOnWithDVDCommand, stereoOffCommand);
        remoteControl.setCommand(4, garageDoorUp, garageDoorDown);


//        remoteControl.setCommand(0, () -> livingRoomLight.on(), () -> livingRoomLight.off());
//        remoteControl.setCommand(1, () -> kitchenLight.on(), () -> kitchenLight.off());
//        remoteControl.setCommand(2, () -> stereo.on(), () -> stereo.off());
//        remoteControl.setCommand(3, () -> stereo2.on(), () -> stereo2.off());

        System.out.println(remoteControl);

        remoteControl.pressOnButton(0);
        remoteControl.pressOffButton(0);
        remoteControl.pressOnButton(1);
        remoteControl.pressOffButton(1);
        remoteControl.pressOnButton(2);
        remoteControl.pressOffButton(2);
        remoteControl.pressOnButton(3);
        remoteControl.pressOffButton(3);
        remoteControl.pressOnButton(4);
        remoteControl.pressOffButton(4);
        remoteControl.pressUndoButton();
    }
}
