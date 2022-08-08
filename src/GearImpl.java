//GearImpl
//some changes
public abstract class GearImpl implements Gear {
    public GearImpl(String name, String adj,int defence) {
        this.name = name;
        this.adj = adj;
        this.defence=defence;
        if(this instanceof HandGear){
            this.typeOfGear = TypeOfGear.HandGear;
        } else if (this instanceof HeadGear) {
            this.typeOfGear = TypeOfGear.HeadGear;
        } else if (this instanceof FootWear) {
            this.typeOfGear = TypeOfGear.FootWear;
        }
        this.attack=0;
    }

    private String name;
    private String adj;
    protected int defence;
    protected int attack;
    private TypeOfGear typeOfGear;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public TypeOfGear getTypeOfGear() {
        return typeOfGear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdj(String adj) {
        this.adj = adj;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    @Override
    public int getDefence() {
        return defence;
    }

    @Override
    public int getAttack(){
        return attack;
    }

    @Override
    public String
    getAdj() {
        return this.adj;
    }



    abstract public Gear combine(Gear other);




    //    abstract protected Gear combineInternal(String newName,
//                                            String newAdj);
//    @Override
//    public Gear combine(Gear other) {
//        String newName = this.name + other.getName();
//        String newAdj = this.adj + other.getAdj();
//
//        return combineInternal(newName, newAdj);
//    }
//        if (other instanceof HandGear) {
//            return new HandGear(newName, newAdj);
//        } else if (other instanceof FootWear) {
//            return new FootWear(newName, newAdj);
//        } else {
//            return new GearImpl(newName, newAdj);
//        }
//    }

//    public static void main(String[] args) {
////        Gear hg1 = new HandGear("handgear", "1");
////        Gear hg2 = new HandGear("handgear", "2");
////        Gear hg3 = hg1.combine(hg2);
////        System.out.println(hg3.toString());
//    }
}
