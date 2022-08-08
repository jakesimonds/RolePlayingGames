import java.util.Comparator;

public class HeadGearComparator implements Comparator<HeadGear> {

    @Override
    public int compare(HeadGear o1, HeadGear o2) {
        if(o1.getDefence()<o2.getDefence()){
            return 1;
        }
        if(o1.getDefence()==o2.getDefence()) {
            return 0;
        }
        else{
            return -1;
        }
    }
}
