import java.util.ArrayList;
import java.util.Collections;
//NEW DRIVER
//Some changes
public class DriverImpl implements Driver{
    private Fighter fighter1;
    private Fighter fighter2;
    private ArrayList<Gear> gears;
    //remember to make it private
    private ArrayList<FootWear> footWears=new ArrayList<>();
    private ArrayList<HandGear> handGears=new ArrayList<>();
    private ArrayList<HeadGear> headGears=new ArrayList<>();

    public DriverImpl(Fighter fighter1, Fighter fighter2, ArrayList<Gear> gears) {
        if(gears==null){
            throw new IllegalArgumentException("Gears is null");
        }
        if(gears.size()!=10){
            throw new IllegalArgumentException("There should be 10 gears");
        }
        if(fighter1 ==null || fighter2 ==null){
            throw new IllegalArgumentException("There should be 2 fighters!");
        }
        for(int i=0;i< gears.size();i++){
            for(int j= gears.size()-1; j > i;j--){
                if(gears.get(i)==gears.get(j)){
                    throw new IllegalArgumentException("There cannot be two same items in gears");
                }
            }
        }
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

    public int start() {
        for(int i =1;i<=5;i++){
            takeTurn(this.fighter1);
            System.out.println("\n\nTurn #"+ (i*2 -1) );
            System.out.println(fighter1.getName() + " has " + fighter1.getAttack() + " attack points and " + fighter1.getDefense() + " defense strength.");
            printFighterGear(fighter1);
            //System.out.println(fighter1.getName()+" is wearing...");
            takeTurn(this.fighter2);
            System.out.println("\n\nTurn #"+ (i*2) );
            System.out.println(fighter2.toString());
            printFighterGear(fighter2);
            //System.out.println(fighter2.getName()+" is wearing...");
        }
        System.out.println("\n\n\n");
        return fighter1.fight(fighter2);
    }


    public Fighter getFighter1() {
        return fighter1;
    }

    public Fighter getFighter2() {
        return fighter2;
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public ArrayList<FootWear> getFootWears() {
        return footWears;
    }

    public ArrayList<HandGear> getHandGears() {
        return handGears;
    }

    public ArrayList<HeadGear> getHeadGears() {
        return headGears;
    }
    public void printFighterGear(Fighter fighter){
        if (fighter.getHeadGear() != null) {
            System.out.println("Headgear: " + fighter.getHeadGear());
        }
        if (fighter.getLeftHandGear() != null) {
            System.out.println("Left HandGear: " + fighter.getLeftHandGear());
        }
        if (fighter.getRightHandGear() != null) {
            System.out.println("Right HandGear: " + fighter.getRightHandGear());
        }
        if (fighter.getLeftFootwear() != null) {
            System.out.println("Left Footwear: " + fighter.getLeftFootwear());
        }
        if (fighter.getRightFootwear() != null) {
            System.out.println("Right Footwear: " + fighter.getRightFootwear());
        }

    }


    //Helper function
    public void takeTurn(Fighter fighter) {
        //if conditions implement rules for selecting item as indicated in project document
        if (fighter.getRightFootwear() == null && fighter.getRightHandGear() == null && fighter.getHeadGear() == null) {
            //fighter needs all three types
            equip(fighter, new TypeOfGear[]{TypeOfGear.FootWear, TypeOfGear.HandGear, TypeOfGear.HeadGear});
            return;
        } else if (fighter.getRightFootwear() == null && fighter.getRightHandGear() == null && fighter.getHeadGear() != null) {
            //fighter needs hand or foot
            int flag=equip(fighter,new TypeOfGear[]{TypeOfGear.FootWear, TypeOfGear.HandGear});
            if(flag==0){
                pickFirstItem(fighter);
                return;
            }
        }else if(fighter.getRightFootwear() != null && fighter.getRightHandGear() == null && fighter.getHeadGear() == null){
            //fighter needs hand or head
            int flag=equip(fighter,new TypeOfGear[]{TypeOfGear.HeadGear, TypeOfGear.HandGear});
            if(flag==0){
                pickFirstItem(fighter);
                return;
            }
        }else if(fighter.getRightFootwear() == null && fighter.getRightHandGear() != null && fighter.getHeadGear() == null) {
            //fighter needs foot or head
            int flag = equip(fighter, new TypeOfGear[]{TypeOfGear.FootWear, TypeOfGear.HeadGear});
            if (flag == 0) {
                pickFirstItem(fighter);
                return;
            }
        }

        else if (fighter.getRightFootwear() != null && fighter.getRightHandGear() != null && fighter.getHeadGear() == null){
            //fighter needs head
            int flag = equip(fighter,new TypeOfGear[]{TypeOfGear.HeadGear});
            if(flag==0){
                pickFirstItem(fighter);
                return;
            }else if(flag==1){
                return; //could be removed after test
            }

        }else if(fighter.getRightFootwear() != null && fighter.getRightHandGear() == null && fighter.getHeadGear() != null){
            //fighter needs hand
            int flag = equip(fighter,new TypeOfGear[]{TypeOfGear.HandGear});
            if(flag==0){
                pickFirstItem(fighter);
                return;
            }else if(flag==1) {
                return; //could be removed after test
            }
        }else if(fighter.getRightFootwear() == null && fighter.getRightHandGear() != null && fighter.getHeadGear() != null) {
            //fighter needs foot;
            int flag = equip(fighter, new TypeOfGear[]{TypeOfGear.FootWear});
            if (flag == 0) {
                pickFirstItem(fighter);
                return;
            } else if (flag == 1) {
                return; //could be removed after test
            }
        }else{
            pickFirstItem(fighter);//all items of the fighter are equipped, extra case
            return;
        }
    }


        public void pickFirstItem(Fighter fighter){
            fighter.pickGear(gears.get(0));

            if(gears.get(0).getTypeOfGear()==TypeOfGear.FootWear){
                footWears.remove(0);
            }else if(gears.get(0).getTypeOfGear()==TypeOfGear.HandGear){
                handGears.remove(0);
            }else{
                headGears.remove(0);
            }
            gears.remove(0);
            return;
        }
        public int equip(Fighter fighter,TypeOfGear[] types) {
            // if fighter can't take gear, return 0;
            //if fighter can take gear, add gear, return 1.remove item from al
            for (Gear g1 : this.gears) {
                for (TypeOfGear type : types) {
                    if (g1.getTypeOfGear() == type) {
                        fighter.pickGear(g1);
                        gears.remove(g1);
                        if (g1.getTypeOfGear() == TypeOfGear.FootWear) {
                            footWears.remove(g1);
                        } else if (g1.getTypeOfGear() == TypeOfGear.HandGear) {
                            handGears.remove(g1);
                        } else {
                            headGears.remove(g1);
                        }
                        return 1;
                    }
                }
            }
            return 0;
        }

//                if(g.getTypeOfGear()==TypeOfGear.HandGear){
//                    if(fighter.getLeftHandGear()==null){
//                        fighter.pickGear(gear);
//                        gears.remove(gear);
//                        handGears.remove(gear);
//                        return;
//                    } else if (fighter.getRightHandGear()==null) {
//                        fighter.pickGear(gear);
//                        gears.remove(gear);
//                        handGears.remove(gear);
//                        return;
//                    }
//                }else if(gear.getTypeOfGear()==TypeOfGear.FootWear){
//                    if(fighter.getLeftFootwear()==null){
//                        fighter.pickGear(gear);
//                        gears.remove(gear);
//                        footWears.remove(gear);
//                        return;
//                    } else if (fighter.getRightFootwear()==null) {
//                        fighter.pickGear(gear);
//                        gears.remove(gear);
//                        footWears.remove(gear);
//                        return;
//                    }
//                } else if (gear.getTypeOfGear()==TypeOfGear.HeadGear) {
//                    if(fighter.getHeadGear()==null){
//                        fighter.pickGear(gear);
//                        gears.remove(gear);
//                        headGears.remove(gear);
//                        return;
//                    }
//
//                }

}



//        if (fighter.getLeftFootwear() == null) {
//            if(this.footWears!=null){
//                fighter.pickGear(footWears.get(0));
//                footWears.remove(0);
//                gears.remove(footWears.get(0));
//            }
//
//        } else if (fighter.getRightFootwear()==null) {
//            if(this.footWears!=null){
//                fighter.pickGear(footWears.get(0));
//                footWears.remove(0);
//                gears.remove(footWears.get(0));
//            }
//        } else if (fighter.getLeftHandGear()==null) {
//
//        } else if (fighter.getRightHandGear()==null) {
//
//        } else if (fighter.getHeadGear()==null) {
//
//





