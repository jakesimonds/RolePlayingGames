public class HeadGear extends GearImpl{
    public HeadGear(String name, String adj,int defence) {
        super(name, adj,defence);

    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof HeadGear)){
            return false;
        }
        HeadGear other = (HeadGear) obj;
        return this.getName()== other.getName() && this.getAdj()== other.getAdj();

    }

    @Override
    public String toString() {

        return "Name: "+this.getAdj()+" "+this.getName()+"  Defence: "+this.getDefence();
    }

    @Override
    public int getDefense() {
        return this.defence;
    }
    @Override
    public int getAttack(){
        return 0;
    }

    @Override
    public HeadGear combine(Gear other) {
        if(!(other instanceof HeadGear)){
            throw new IllegalStateException("We combine headGear with a headGear only!");
        }
        HeadGear that = (HeadGear) other;
        return new HeadGear(that.getName(),this.getAdj()+", "+that.getAdj(),this.getDefence()+ that.getDefence());
    }
}
