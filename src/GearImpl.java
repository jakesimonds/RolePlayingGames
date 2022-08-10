//GearImpl
//some changes
public abstract class GearImpl implements Gear {
    public GearImpl(String name, String adj,int defence) {
        this.name = name;
        this.adj = adj;
        this.defence=defence;
        if (defence<0){throw new IllegalArgumentException("defence must be >0");}
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


}
