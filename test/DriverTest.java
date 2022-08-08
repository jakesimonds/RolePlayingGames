import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;



public class DriverTest {

    @Test
    public void TestDriverConstructor() {
        //two fighters
        FighterImpl testFighter = new FighterImpl("Joe",10,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",20,20);

        //10 items
        Gear headgear1 = new HeadGear("Hat","Large",5);
        Gear headgear2 = new HeadGear("Helmet","Old",10);

        HandGear handGear1 = new HandGear("Shield","Red",2,8);
        HandGear handGear2 = new HandGear("Glove","Pink",4,6);
        HandGear handGear3 = new HandGear("Ring","Yellow",7,5);
        HandGear handGear4 = new HandGear("Fingerless Glove","Blue",3,3);

        FootWear footwear1 = new FootWear("Shoe","Blue",4,4);
        FootWear footwear2 = new FootWear("Sandal","Purple",1,6);
        FootWear footwear3 = new FootWear("Flip Flop","Black",3,5);
        FootWear footwear4 = new FootWear("Roller Skate","Green",7,3);

        //gears list
        ArrayList<Gear> testGears = new ArrayList<Gear>();
        testGears.add(headgear1);
        testGears.add(headgear2);
        testGears.add(handGear1);
        testGears.add(handGear2);
        testGears.add(handGear3);
        testGears.add(handGear4);
        testGears.add(footwear1);
        testGears.add(footwear2);
        testGears.add(footwear3);
        testGears.add(footwear4);

        Driver test = new Driver(testFighter,testFighter2,testGears);

    }


}
