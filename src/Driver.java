import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    Fighter fighter1;
    Fighter fighter2;
    ArrayList<Gear> gears;
    ArrayList<FootWear> footWears;
    ArrayList<HandGear> handGears;
    ArrayList<HeadGear> headGears;

    public Driver(Fighter fighter1, Fighter fighter2, ArrayList<Gear> gears) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.gears = gears;
        for(Gear gear: gears){
            if(gear.getTypeOfGear()==TypeOfGear.HeadGear){
                headGears.add((HeadGear) gear);
            } else if(gear.getTypeOfGear()==TypeOfGear.HandGear){
                handGears.add((HandGear) gear);
            } else if(gear.getTypeOfGear()==TypeOfGear.FootWear){
                footWears.add((FootWear) gear);
            }
        }
        Collections.sort(gears,new GearComparator());
        Collections.sort(footWears,new FootWearComparator());
        Collections.sort(handGears,new HandGearComparator());
        Collections.sort(headGears,new HeadGearComparator());
    }

    public void start() {


    }


    //Helper function
    public void takeTurn(Fighter fighter) {

        if (fighter.getLeftFootwear() == null) {
            if(this.footWears!=null){
                fighter.pickGear(footWears.get(0));
                footWears.remove(0);
                gears.remove(footWears.get(0));
            }

        } else if (fighter.getRightFootwear()==null) {
            if(this.footWears!=null){
                fighter.pickGear(footWears.get(0));
                footWears.remove(0);
                gears.remove(footWears.get(0));
            }
        } else if (fighter.getLeftHandGear()==null) {

        } else if (fighter.getRightHandGear()==null) {

        } else if (fighter.getHeadGear()==null) {

        }
    }

}


