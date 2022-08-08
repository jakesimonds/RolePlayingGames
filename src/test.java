import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        HandGear testHandGear1 = new HandGear("Glove", "Middle", 5, 2);
        HandGear testHandGear2 = new HandGear("Glove", "Worst", 5, 1);
        HandGear testHandGear3 = new HandGear("Glove", "Best", 10, 1);
        HandGear testHandGear4 = new HandGear("Glove", "worstWorst", 1, 1);
        HeadGear testHeadGear1 = new HeadGear("Helmet", "Worst", 1);
        HeadGear testHeadGear2 = new HeadGear("Helmet", "Best", 10);
        FootWear testFootWear1 = new FootWear("Boots", "Worst", 1, 1);
        FootWear testFootWear2 = new FootWear("Boots", "Best", 3, 2);
        FootWear testFootWear3 = new FootWear("Boots", "Middle", 1, 2);
        FootWear testFootWear4 = new FootWear("Boot", "BestBest", 10,5);


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
        FighterImpl testFighter = new FighterImpl("Joe",10,10);
        FighterImpl testFighter2 = new FighterImpl("Jane",100,10);
        Driver driver = new Driver(testFighter,testFighter2,gears);
        int result = driver.start();
        System.out.println("Should print -1,and result is "+String.valueOf(result));


//
//        System.out.println("Before take turn");
//        System.out.println("==========================================");
//        Driver driver = new Driver(testFighter,testFighter2,gears);
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 1");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 2");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 3");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 4");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 5");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 6");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());
//        driver.takeTurn(testFighter);
//        System.out.println("==========================================");
//        System.out.println("==========================================");
//        System.out.println("Turn 7");
//        for(Gear gear: driver.gears){
//            System.out.println(gear);
//        }
//        System.out.println(testFighter.toString());





//        //Test HandGear sort
//        System.out.println("Test HandGear sort");
//        ArrayList<HandGear> handGears = new ArrayList<>();
//        handGears.add(testHandGear1);
//        handGears.add(testHandGear2);
//        handGears.add(testHandGear3);
//        Collections.sort(handGears, new HandGearComparator());

//        for (Gear handGear : handGears) {
//            System.out.println(handGear);
//        }
//        System.out.println("==========================================");

//        //Test FootWear sort
//        System.out.println("Test FootWear sort");
//        ArrayList<FootWear> footWears = new ArrayList<>();
//        footWears.add(testFootWear1);
//        footWears.add(testFootWear2);
//        footWears.add(testFootWear3);
//        Collections.sort(footWears, new FootWearComparator());
//
//        for (Gear footwear : footWears) {
//            System.out.println(footwear);
//        }
//        System.out.println("==========================================");
//        //Test HeadGear sort
//        System.out.println("Test HeadGear sort");
//        ArrayList<HeadGear> headGears = new ArrayList<>();
//        headGears.add(testHeadGear1);
//        headGears.add(testHeadGear2);
//        headGears.add(testHeadGear3);
//        Collections.sort(headGears,new HeadGearComparator());
//        for (Gear headGear : headGears) {
//            System.out.println(headGear);
//        }
//        System.out.println("==========================================");
//        //Test Gear sort
//        System.out.println("Test Gear sort");
//        ArrayList<Gear> gears = new ArrayList<>();
//        gears.add(testHeadGear1);
//        gears.add(testHeadGear2);
//        gears.add(testHeadGear3);
//        gears.add(testFootWear1);
//        gears.add(testFootWear2);
//        gears.add(testFootWear3);
//        gears.add(testHandGear1);
//        gears.add(testHandGear2);
//        gears.add(testHandGear3);
//        Collections.sort(gears,new GearComparator());
//        for (Gear gear : gears) {
//            System.out.println(gear);
//        }
//    }
    }
}