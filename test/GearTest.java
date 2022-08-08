import java.util.ArrayList;

import org.junit.Test;

import static org.junit.Assert.*;


public class GearTest {

    //=================================== Testing Gear constructor-Headgear =======================================
    @Test
    public void TestGearConstructorHeadgear(){
        HeadGear test = new HeadGear("Helmet","Funny",4);
        assertEquals("Helmet",test.getName());
        assertEquals("Funny",test.getAdj());
        assertEquals(4,test.getDefence());

    }


    //=================================== Testing Gear constructor-Headgear w error =======================================
    @Test(expected=IllegalArgumentException.class)
    public void TestGearConstructorHeadgearError(){
        HeadGear test = new HeadGear("Helmet","Funny",-4);
    }

    //=================================== Testing Gear constructor-FootWear =======================================
    @Test
    public void TestGearConstructorFootWear(){
        FootWear test = new FootWear("Shoe","Big",4,3);
        assertEquals("Shoe",test.getName());
        assertEquals("Big",test.getAdj());
        assertEquals(3,test.getDefence());
        assertEquals(4,test.getAttack());

    }

    //=================================== Testing Gear constructor-Handgear w error =======================================
    @Test(expected=IllegalArgumentException.class)
    public void TestGearConstructorFootWearError(){
        FootWear test = new FootWear("Shoe","Big",-4,3);
    }

    //=================================== Testing Gear constructor-Handgear w error =======================================
    @Test(expected=IllegalArgumentException.class)
    public void TestGearConstructorFootWearError2(){
        FootWear test = new FootWear("Shoe","Big",4,-3);
    }

    //=================================== Testing Gear constructor-Handgear =======================================
    @Test
    public void TestGearConstructorHandGear(){
        HandGear test = new HandGear("Glove","Big",4,3);
        assertEquals("Glove",test.getName());
        assertEquals("Big",test.getAdj());
        assertEquals(3,test.getDefence());
        assertEquals(4,test.getAttack());

    }

    //=================================== Testing Gear constructor-Handgear w error =======================================
    @Test(expected=IllegalArgumentException.class)
    public void TestGearConstructorHandGearError(){
        HandGear test = new HandGear("Glove","Big",-4,3);
    }

    //=================================== Testing Gear constructor-Handgear w error =======================================
    @Test(expected=IllegalArgumentException.class)
    public void TestGearConstructorHandGearError2(){
        HandGear test = new HandGear("Glove","Big",4,-3);
    }


    //=================================== Testing Gear GetName =======================================
    @Test
    public void TestGearGetName(){
        HandGear test = new HandGear("Glove","Big",4,3);
        FootWear test1 = new FootWear("Shoe","Big",4,3);
        HeadGear test2 = new HeadGear("Helmet","Funny",4);
        assertEquals("Glove",test.getName());
        assertEquals("Shoe",test1.getName());
        assertEquals("Helmet",test2.getName());


    }

    //=================================== Testing Gear GetAdj =======================================
    @Test
    public void TestGearGetAdj(){
        HandGear test = new HandGear("Glove","Big",4,3);
        FootWear test1 = new FootWear("Shoe","Huge",4,3);
        HeadGear test2 = new HeadGear("Helmet","Funny",4);
        assertEquals("Big",test.getAdj());
        assertEquals("Huge",test1.getAdj());
        assertEquals("Funny",test2.getAdj());


    }

    //=================================== Testing Gear combine =======================================
    @Test
    public void TestGearcombine(){


    }

    //=================================== Testing Gear GetTypeOfGear =======================================
    @Test
    public void TestTypeofGear(){
        HandGear test = new HandGear("Glove","Big",4,3);
        FootWear test1 = new FootWear("Shoe","Huge",4,3);
        HeadGear test2 = new HeadGear("Helmet","Funny",4);
        assertEquals(TypeOfGear.HandGear,test.getTypeOfGear());
        assertEquals(TypeOfGear.FootWear,test1.getTypeOfGear());
        assertEquals(TypeOfGear.HeadGear,test2.getTypeOfGear());

    }




}
