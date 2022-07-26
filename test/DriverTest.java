import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;

//Changes

public class DriverTest {

    @Test
    public void TestDriverConstructor() {
        //two fighters
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",10,10);

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

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

        int result = driver.start();
        //Test fight result
        assertEquals(result, 1);

        //Test all the items were picked
        assertEquals(driver.getGears().size(),0);
        assertEquals(driver.getHandGears().size(),0);
        assertEquals(driver.getHeadGears().size(),0);
        assertEquals(driver.getFootWears().size(),0);

        //Test status
        assertEquals(driver.getFighter1().getAttack(),27);
        assertEquals(driver.getFighter2().getAttack(),26);
        assertEquals(driver.getFighter1().getDefense(),42);
        assertEquals(driver.getFighter2().getDefense(),33);

        //Test the fighter equipped with correct item

    }
    @Test(expected=IllegalArgumentException.class)
    public void TestThrowErrorWhenItemsLessThan10(){
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",10,10);

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
        //FootWear footwear4 = new FootWear("Roller Skate","Green",7,3);

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
        //testGears.add(footwear4);

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

    }

    @Test(expected=IllegalArgumentException.class)
    public void TestThrowErrorWhenItemsMoreThan10(){
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",10,10);

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

        FootWear footwear5 = new FootWear("Roller Skate","Green",7,3);

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
        testGears.add(footwear5);

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

    }
    @Test(expected=IllegalArgumentException.class)
    public void TestThrowErrorWhenSameItemsInGears(){
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",10,10);

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
        //footwear 3 twice
        testGears.add(footwear3);
        testGears.add(footwear3);

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

    }

    @Test(expected=IllegalArgumentException.class)
    public void TestThrowErrorNullGears(){
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",10,10);

        //10 items
        ArrayList<Gear> testGears = null;


        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

    }

    @Test(expected=IllegalArgumentException.class)
    public void TestThrowErrorWhenFighterIsNull(){
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = null;

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
        //FootWear footwear4 = new FootWear("Roller Skate","Green",7,3);

        //FootWear footwear5 = new FootWear("Roller Skate","Green",7,3);

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
        testGears.add(footwear3);
        //testGears.add(footwear5);

        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

    }

    @Test(expected=IllegalArgumentException.class)
    public void TestThrowErrorWhenFighterObjectCalledTwice_ex_FightsThemselves(){
        FighterImpl testFighter = new FighterImpl("Joe",12,10);

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

        //FootWear footwear5 = new FootWear("Roller Skate","Green",7,3);

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
        testGears.add(footwear3);
        testGears.add(footwear4);

        DriverImpl driver = new DriverImpl(testFighter,testFighter,testGears);

    }

    @Test
    public void TestDriverAllHeadgear() {
        //two fighters
        FighterImpl testFighter = new FighterImpl("Joe",12,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",10,10);

        //10 items
        Gear headgear1 = new HeadGear("a","1",10);
        Gear headgear2 = new HeadGear("b","2",9);
        Gear headgear3 = new HeadGear("c","3",8);
        Gear headgear4 = new HeadGear("d","4",7);
        Gear headgear5 = new HeadGear("e","5",6);
        Gear headgear6 = new HeadGear("f","6",5);
        Gear headgear7 = new HeadGear("g","7",4);
        Gear headgear8 = new HeadGear("h","8",3);
        Gear headgear9 = new HeadGear("i","9",2);
        Gear headgear10 = new HeadGear("j","10",1);


        //gears list
        ArrayList<Gear> testGears = new ArrayList<Gear>();
        testGears.add(headgear1);
        testGears.add(headgear2);
        testGears.add(headgear3);
        testGears.add(headgear4);
        testGears.add(headgear5);
        testGears.add(headgear6);
        testGears.add(headgear7);
        testGears.add(headgear8);
        testGears.add(headgear9);
        testGears.add(headgear10);


        DriverImpl driver = new DriverImpl(testFighter,testFighter2,testGears);

        int result = driver.start();
        //Test fight result
        assertEquals("1, 3, 5, 7, 9", testFighter.getHeadGear().getAdj());
        assertEquals("i", testFighter.getHeadGear().getName());
        assertEquals("2, 4, 6, 8, 10", testFighter2.getHeadGear().getAdj());
        assertEquals("j", testFighter2.getHeadGear().getName());


    }



}
