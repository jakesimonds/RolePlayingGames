import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        HandGear testHandGear1 = new HandGear("Glove","Marvel",5,2);
        HandGear testHandGear2 = new HandGear("Glove","Ridiculous",8,1);
        HeadGear testHeadGear1 = new HeadGear("Helmet","Blue",5);
        FootWear testFootWear1 = new FootWear("Boots","white",2,1);
        FootWear testFootWear2 = new FootWear("Boots","black",1,2);


        ArrayList<Gear> gears= new ArrayList<>();
        gears.add(testFootWear1);
        gears.add(testFootWear2);
        gears.add(testHandGear1);
        gears.add(testHandGear2);
        gears.add(testHeadGear1);

        gears.remove(testHandGear1);
        for(Gear gear: gears){

            if(gear.getTypeOfGear()==TypeOfGear.FootWear){
                System.out.println(gear);
            }
        }
    }


}