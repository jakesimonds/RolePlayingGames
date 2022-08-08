import java.util.Comparator;

public class FootWearComparator implements Comparator<FootWear> {
    public int compare(FootWear f1, FootWear f2){
        if(f1.getAttack()<f2.getAttack()){
            return 1;
        }
        if(f1.getAttack()==f2.getAttack()){
            if(f1.getDefence()<f2.getDefence()){
                return 1;
            }else if(f1.getDefence()==f2.getDefence()){
                return 0;
            }else if(f1.getDefence()>f2.getDefence()){
                return -1;
            }
        }
        else{
            return -1;
        }
        return 0;
    }
}
