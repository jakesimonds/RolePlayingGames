import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        HandGear testHandGear1 = new HandGear("Glove", "Middle", 4, 2);
        HandGear testHandGear2 = new HandGear("Glovee", "Worst", 5, 2);
        HandGear testHandGear3 = new HandGear("Gloveee", "Best", 10, 2);
        HeadGear testHeadGear1 = new HeadGear("Helmet", "Worst", 1);
        HeadGear testHeadGear2 = new HeadGear("Helmet", "Best", 10);
        HeadGear testHeadGear3 = new HeadGear("Helmet", "Middle", 5);

        FootWear testFootWear1 = new FootWear("Boots", "Worst", 1, 1);
        FootWear testFootWear2 = new FootWear("Boots", "Best", 3, 2);
        FootWear testFootWear3 = new FootWear("Boots", "Middle", 1, 2);


        //Test HandGear sort
        System.out.println("Test HandGear sort");
        ArrayList<HandGear> handGears = new ArrayList<>();
        handGears.add(testHandGear1);
        handGears.add(testHandGear2);
        handGears.add(testHandGear3);
        Collections.sort(handGears, new HandGearComparator());

        for (Gear handGear : handGears) {
            System.out.println(handGear);
        }
        System.out.println("==========================================");

        //Test FootWear sort
        System.out.println("Test FootWear sort");
        ArrayList<FootWear> footWears = new ArrayList<>();
        footWears.add(testFootWear1);
        footWears.add(testFootWear2);
        footWears.add(testFootWear3);
        Collections.sort(footWears, new FootWearComparator());

        for (Gear footwear : footWears) {
            System.out.println(footwear);
        }
        System.out.println("==========================================");
        //Test HeadGear sort
        System.out.println("Test HeadGear sort");
        ArrayList<HeadGear> headGears = new ArrayList<>();
        headGears.add(testHeadGear1);
        headGears.add(testHeadGear2);
        headGears.add(testHeadGear3);
        Collections.sort(headGears,new HeadGearComparator());
        for (Gear headGear : headGears) {
            System.out.println(headGear);
        }
        System.out.println("==========================================");
        //Test Gear sort
        System.out.println("Test Gear sort");
        ArrayList<Gear> gears = new ArrayList<>();
        gears.add(testHeadGear1);
        gears.add(testHeadGear2);
        gears.add(testHeadGear3);
        gears.add(testFootWear1);
        gears.add(testFootWear2);
        gears.add(testFootWear3);
        gears.add(testHandGear1);
        gears.add(testHandGear2);
        gears.add(testHandGear3);
        Collections.sort(gears,new GearComparator());
        for (Gear gear : gears) {
            System.out.println(gear);
        }


        HandGear CombineTest = testHandGear1.combine(testHandGear2);
        HandGear CombineTest1 = testHandGear2.combine(testHandGear3);

        System.out.println(CombineTest.toString());
        System.out.println(CombineTest1.toString());
        System.out.println(CombineTest.combine(CombineTest1).toString());
    }
}