public class FighterImpl implements Fighter{
    private String name;
    private int attack;
    private int defense;

    private HeadGear headGear;

    public HeadGear getHeadGear() {
        return headGear;
    }

    public HandGear getLeftHandGear() {
        return leftHandGear;
    }

    public HandGear getRightHandGear() {
        return rightHandGear;
    }

    public FootWear getLeftFootwear() {
        return leftFootwear;
    }

    public FootWear getRightFootwear() {
        return rightFootwear;
    }

    private HandGear leftHandGear;
    private HandGear rightHandGear;
    private FootWear leftFootwear;
    private FootWear rightFootwear;

    public FighterImpl(String name, int attack, int defense){
        if (attack < 0 || defense < 0){throw new IllegalArgumentException("Attack & Defense values must be >0");}
        this.name=name;
        this.attack=attack;
        this.defense=defense;
    }



    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
    this.name = name;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

    @Override
    public void setAttack(int attack) {
        if (attack < 0){throw new IllegalArgumentException("Attack must be >0");}
    this.attack = attack;
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public void setDefense(int defense) {
        if (defense <0){throw new IllegalArgumentException("Defense must be >0");}
    this.defense = defense;
    }

    @Override
    public void pickGear(Gear gear) {
        if(gear instanceof HeadGear){
            this.defense+=((HeadGear) gear).getDefence();
            if(this.headGear==null){
                this.headGear = (HeadGear) gear;
            }else{
                HeadGear newItem = this.headGear.combine((HeadGear) gear);
                this.headGear = newItem;
            }
        } else if (gear instanceof HandGear) {
            this.attack+=((HandGear) gear).getAttack();
            this.defense+=((HandGear) gear).getDefence();
            if(this.leftHandGear==null){
                this.leftHandGear=(HandGear) gear;
            } else if (this.rightHandGear==null) {
                this.rightHandGear=(HandGear) gear;
            }else{
                HandGear newItem = this.leftHandGear.combine((HandGear) gear);
                this.leftHandGear=newItem;
            }
        } else if (gear instanceof FootWear) {
                this.attack+=((FootWear) gear).getAttack();
                this.defense+=((FootWear) gear).getDefence();
                if(this.leftFootwear==null){
                    this.leftFootwear=(FootWear) gear;
                } else if (this.rightFootwear==null) {
                    this.rightFootwear=(FootWear) gear;
                }else{
                    FootWear newItem = this.leftFootwear.combine((FootWear) gear);
                    this.leftFootwear=newItem;
                }
        }
    }



    @Override
    //Return 1 when this character wins, 0 when ties, -1 when loses.
    public int fight(Fighter other) {
        if(this.attack-other.getDefense()> other.getAttack()-this.defense){
            return 1;
        } else if (this.attack-other.getDefense()== other.getAttack()-this.defense) {
            return 0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "Name: " + this.name+"     Attack: "+this.attack+" Defense: "+this.defense;
    }

    //    @Override
//    public void pickHeadGear(HeadGearImpl headgear) {
//
//    }
//
//    @Override
//    public void pickHandGear(HandGearImpl handgear) {
//
//    }
//
//    @Override
//    public void pickFootwear(FootwearImpl footwear) {
//
//    }


}
