import java.util.ArrayList;

public class ExampleGameRun {
    public static void main(String[] args) {
        HandGear testHandGear1 = new HandGear("Glove", "Middle", 5, 2);
        HandGear testHandGear2 = new HandGear("Ring", "Worst", 5, 1);
        HandGear testHandGear3 = new HandGear("Mitten", "Best", 20, 1);
        HandGear testHandGear4 = new HandGear("Foam Finger", "tall", 1, 1);
        HeadGear testHeadGear1 = new HeadGear("Football Helmet", "Green", 1);
        HeadGear testHeadGear2 = new HeadGear("Helmet", "Best", 10);
        FootWear testFootWear1 = new FootWear("flip flop", "Worst", 1, 1);
        FootWear testFootWear2 = new FootWear("sneaker", "old", 3, 2);
        FootWear testFootWear3 = new FootWear("cleat", "comfortable", 1, 2);
        FootWear testFootWear4 = new FootWear("Boot", "Greatest", 10, 5);


        ArrayList<Gear> gears = new ArrayList<>();
        gears.add(testHeadGear1);
        gears.add(testHeadGear2);
        gears.add(testFootWear4);
        gears.add(testFootWear1);
        gears.add(testFootWear2);
        gears.add(testFootWear3);
        gears.add(testHandGear1);
        gears.add(testHandGear2);
        gears.add(testHandGear3);
        gears.add(testHandGear4);
        FighterImpl testFighter = new FighterImpl("Joe", 10, 10);
        FighterImpl testFighter2 = new FighterImpl("Jane", 10, 20);

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,gears);

        driver.start();

    }

}
