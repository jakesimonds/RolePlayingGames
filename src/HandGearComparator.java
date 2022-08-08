import java.util.Comparator;

public class HandGearComparator implements Comparator<HandGear> {
    public int compare(HandGear g1, HandGear g2){
        if(g1.getAttack()<g2.getAttack()){
            return 1;
        }
        if(g1.getAttack()==g2.getAttack()){
            if(g1.getDefence()<g2.getDefence()){
                return 1;
            }else if(g1.getDefence()==g2.getDefence()){
                return 0;
            }else if(g1.getDefence()>g2.getDefence()){
                return -1;
            }
        }
        else{
            return -1;
        }
        return 0;
    }
}
