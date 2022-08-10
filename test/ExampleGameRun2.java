import java.util.ArrayList;

public class ExampleGameRun2 {
    public static void main(String[] args) {
        HeadGear testHeadGear1 = new HeadGear("Earmuffs", "New", 1);
        HeadGear testHeadGear2 = new HeadGear("Helmet", "Best", 10);
        HeadGear testHeadGear3 = new HeadGear("Cap", "Expensive", 2);
        HeadGear testHeadGear4 = new HeadGear("Baseball Hat", "Areodynamic", 3);
        HeadGear testHeadGear5 = new HeadGear("Football Helmet", "Funky", 7);

        FootWear testFootWear1 = new FootWear("Shoe","Blue",4,4);
        FootWear testFootWear2 = new FootWear("Sandal","Purple",1,6);
        FootWear testFootWear3 = new FootWear("Flip Flop","Black",3,5);
        FootWear testFootWear4 = new FootWear("Roller Skate","Green",7,3);
        FootWear testFootWear5 = new FootWear("In-Line Skate","Grey",9,3);


        ArrayList<Gear> gears = new ArrayList<>();
        gears.add(testHeadGear1);
        gears.add(testHeadGear2);
        gears.add(testFootWear4);
        gears.add(testFootWear1);
        gears.add(testFootWear2);
        gears.add(testFootWear3);
        gears.add(testFootWear5);
        gears.add(testHeadGear3);
        gears.add(testHeadGear4);
        gears.add(testHeadGear5);
        FighterImpl testFighter = new FighterImpl("Joe", 25, 10);
        FighterImpl testFighter2 = new FighterImpl("Jane", 35, 10);

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,gears);

        driver.start();

    }

}


