import java.util.ArrayList;

public class ExampleGameRun {
    public static void main(String[] args) {
        HandGear testHandGear1 = new HandGear("Glove", "Middle", 5, 2);
        HandGear testHandGear2 = new HandGear("Glove", "Worst", 5, 1);
        HandGear testHandGear3 = new HandGear("Glove", "Best", 10, 1);
        HandGear testHandGear4 = new HandGear("Glove", "worstWorst", 1, 1);
        HeadGear testHeadGear1 = new HeadGear("Footwear", "some", 1);
        HeadGear testHeadGear2 = new HeadGear("Helmet", "Best", 10);
        FootWear testFootWear1 = new FootWear("Boots", "Worst", 1, 1);
        FootWear testFootWear2 = new FootWear("Boots", "Best", 3, 2);
        FootWear testFootWear3 = new FootWear("Boots", "Middle", 1, 2);
        FootWear testFootWear4 = new FootWear("Boot", "BestBest", 10, 5);


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
        FighterImpl testFighter2 = new FighterImpl("Jane", 100, 10);

        Driver driver = new Driver(testFighter,testFighter2,gears);

        driver.start();

    }

}
