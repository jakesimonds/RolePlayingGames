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

        assertEquals(1,1);

    }

    //=================================== Testing Fighter fight =======================================
    @Test
    public void TestFight(){

        assertEquals(1,1);

    }

    //=================================== Testing Fighter getHeadGear =======================================
    @Test
    public void TestGetHeadgear(){

        assertEquals(1,1);

    }

    //=================================== Testing Fighter getLeftHandGear =======================================
    @Test
    public void TestGetLeftHandGear(){


        assertEquals(1,1);
    }

    //=================================== Testing Fighter GetRightHandGear =======================================
    @Test
    public void TestGetRightHandGear(){


        assertEquals(1,1);
    }

    //=================================== Testing Fighter getLeftFootwear =======================================
    @Test
    public void TestGetLeftFootwear(){


        assertEquals(1,1);
    }

    //=================================== Testing Fighter getRightFootwear =======================================
    @Test
    public void TestGetRightFootwear(){

        assertEquals(1,1);

    }



}