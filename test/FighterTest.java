import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;


public class FighterTest {


    //=================================== Testing Fighter constructor =======================================
    //testing for expected errors with negative attack or defense values
    @Test(expected = IllegalArgumentException.class)
    public void TestConstructor(){
        FighterImpl testFighter = new FighterImpl("Joe",-1,2);
        FighterImpl testFighter2 = new FighterImpl("Joe",1,-1);

    }

    //=================================== Testing Fighter constructor =======================================
    //testing expected values
    @Test
    public void TestConstructor2(){
        FighterImpl testFighter = new FighterImpl("Joe",5,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",2,4);

        assertEquals("Joe",testFighter.getName());
        assertEquals(5,testFighter.getAttack());
        assertEquals(10,testFighter.getDefense());

        assertEquals("Jane",testFighter2.getName());
        assertEquals(2,testFighter2.getAttack());
        assertEquals(4,testFighter2.getDefense());

    }

    //=================================== Testing Fighter getName/setName =======================================
    @Test
    public void TestGetSetName(){
        FighterImpl testFighter = new FighterImpl("Joe",5,10);
        assertEquals("Joe",testFighter.getName());
        testFighter.setName("Hank");
        assertEquals("Hank",testFighter.getName());
    }

    //=================================== Testing Fighter get/set attack =======================================
    @Test
    public void TestGetSetAttack(){
        FighterImpl testFighter = new FighterImpl("Joe",5,10);
        assertEquals(5,testFighter.getAttack());
        testFighter.setAttack(33);
        assertEquals(33,testFighter.getAttack());
    }

    //=================================== Testing setAttack =======================================
    //testing for expected errors with negative attack
    @Test(expected = IllegalArgumentException.class)
    public void TestSetAttack(){
        FighterImpl testFighter = new FighterImpl("Joe",1,2);
        testFighter.setAttack(-3);

    }

    //=================================== Testing Fighter get/set defense =======================================
    @Test
    public void TestGetSetDefense(){
        FighterImpl testFighter = new FighterImpl("Joe",5,10);
        assertEquals(10,testFighter.getDefense());
        testFighter.setDefense(33);
        assertEquals(33,testFighter.getDefense());


    }

    //=================================== Testing setDefense =======================================
    //testing for expected errors with negative defense
    @Test(expected = IllegalArgumentException.class)
    public void TestSetDefense(){
        FighterImpl testFighter = new FighterImpl("Joe",1,2);
        testFighter.setDefense(-3);
    }

    //=================================== Testing Fighter pickGear =======================================
    @Test
    public void TestPickGear(){

        HandGear testHandGear3 = new HandGear("Glove", "Best", 10, 1);
        HeadGear testHeadGear1 = new HeadGear("Helmet", "Worst", 1);
        FootWear testFootWear1 = new FootWear("Boots", "Worst", 1, 1);

        FighterImpl testFighter2 = new FighterImpl("Jane",20,20);

        testFighter2.pickGear(testHandGear3);
        testFighter2.pickGear(testFootWear1);
        testFighter2.pickGear(testHeadGear1);


        assertEquals(31,testFighter2.getAttack());
        assertEquals(23,testFighter2.getDefense());

    }

    //=================================== Testing Fighter fight =======================================
    @Test
    public void TestFight(){

        FighterImpl testFighter = new FighterImpl("Joe",10,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",20,20);
        FighterImpl testFighter3 = new FighterImpl("Elsie",20,20);

        HeadGear testHeadGear1 = new HeadGear("Helmet", "Worst", 1);

        //unrealistic use of function, but testing its fundamentals to make sure it does what we predict
        assertEquals(-1,testFighter.fight(testFighter2));
        assertEquals(0,testFighter3.fight(testFighter3));
        testFighter3.pickGear(testHeadGear1);
        assertEquals(1,testFighter3.fight(testFighter2));


    }

    //=================================== Testing Fighter getHeadGear =======================================
    @Test
    public void TestGetHeadgear(){
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
        testFighter2.pickGear(headgear1);

        assertEquals(testFighter2.getHeadGear(),headgear1);

    }

    //=================================== Testing Fighter getLeftHandGear =======================================
    @Test
    public void TestGetLeftHandGear(){
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

        testFighter2.pickGear(handGear1);


        assertEquals(testFighter2.getLeftHandGear(),handGear1);
    }

    //=================================== Testing Fighter GetRightHandGear =======================================
    @Test
    public void TestGetRightHandGear(){
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

        testFighter2.pickGear(handGear1);
        testFighter2.pickGear(handGear2);
        testFighter2.pickGear(handGear3);


        assertEquals(testFighter2.getRightHandGear(),handGear2);


    }

    //=================================== Testing Fighter getLeftFootwear =======================================
    @Test
    public void TestGetLeftFootwear(){
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
        FootWear footwear3 = new FootWear("Sandalll","Purpleee",1,3);

        testFighter2.pickGear(footwear1);
        assertEquals(testFighter2.getLeftFootwear(),footwear1);
        testFighter2.pickGear(footwear2);
        assertEquals(testFighter2.getLeftFootwear(),footwear1);
        testFighter2.pickGear(footwear3);
        assertNotEquals(testFighter2.getLeftFootwear(),footwear1);


    }

    //=================================== Testing Fighter getRightFootwear =======================================
    @Test
    public void TestGetRightFootwear(){
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
        FootWear footwear3 = new FootWear("Sandalll","Purpleee",1,3);


        testFighter2.pickGear(footwear1);
        testFighter2.pickGear(footwear2);
        testFighter2.pickGear(footwear3);

        assertEquals(testFighter2.getRightFootwear(),footwear2);

    }



}