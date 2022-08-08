import java.util.Comparator;

public class GearComparator implements Comparator<Gear> {
    @Override
    public int compare(Gear o1, Gear o2) {
        if(o1.getAttack()<o2.getAttack()){
            return 1;
        }
        if(o1.getAttack()==o2.getAttack()){
            if(o1.getDefence()<o2.getDefence()){
                return 1;
            }else if(o1.getDefence()==o2.getDefence()){
                return 0;
            }else if(o1.getDefence()>o2.getDefence()){
                return -1;
            }
        }
        else{
            return -1;
        }
        return 0;
    }
}

