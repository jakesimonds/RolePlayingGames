public class HandGear extends GearImpl {
    int attack;
    public HandGear(String name, String adj,int attack,int defence) {
        super(name, adj,defence);
        this.attack=attack;
        if (attack<0){throw new IllegalArgumentException("attack must be >0");}

    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public int getDefense() {
        return this.defence;
    }
    @Override
    public int getAttack() {
        return attack;
    }

    @Override
    public HandGear combine(Gear other) {
        if(!(other instanceof HandGear)){
            throw new IllegalStateException("We combine handGear with a handGear only!");
        }
        HandGear that = (HandGear) other;
        return new HandGear(that.getName(),this.getAdj()+", "+that.getAdj(),this.getAttack()+that.getAttack(),this.getDefence()+ that.getDefence());
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof HandGear)){
            return false;
        }
        HandGear other = (HandGear) obj;
        return this.getName()== other.getName() && this.getAdj()== other.getAdj();

    }

    @Override
    public String toString() {
        return "Name: "+this.getAdj()+" "+this.getName()+"  Attack: "+this.getAttack()+" Defence: "+this.getDefence();
    }
}



//    @Override
//    protected Gear combineInternal(String newName, String newAdj) {
//        return new HandGear(newName, newAdj);
//    }

//    @Override
//    public Gear combine(Gear other) {
//        return null;
//    }