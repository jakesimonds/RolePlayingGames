 public class FootWear extends GearImpl {
    int attack;
        public FootWear(String name, String adj,int attack,int defence) {
            super(name, adj,defence);
            this.attack=attack;
            if (attack<0){throw new IllegalArgumentException("attack must be >0");}
        }

     public int getAttack() {
         return attack;
     }

     public void setAttack(int attack) {
         this.attack = attack;
     }


@Override
public FootWear combine(Gear other) {
    if(!(other instanceof FootWear)){
        throw new IllegalStateException("We combine footWear with a footWear only!");
    }
    FootWear that = (FootWear) other;
    return new FootWear(that.getName(),this.getAdj()+", "+that.getAdj(),this.getAttack()+that.getAttack(),this.getDefence()+ that.getDefence());
}

     @Override
     public boolean equals(Object obj) {
         if(!(obj instanceof FootWear)){
             return false;
         }
         FootWear other = (FootWear) obj;
         return this.getName()== other.getName() && this.getAdj()== other.getAdj();
     }

        @Override
        public String toString() {
            return "Name: "+this.getAdj()+" "+this.getName()+"  Attack: "+this.getAttack()+" Defence: "+this.getDefence();
        }
    }


//    @Override
//    public Gear combine(Gear other) {
//        return null;
//    }
//        @Override
//        protected Gear combineInternal(String newName, String newAdj) {
//            return new FootWear(newName, newAdj);
//        }