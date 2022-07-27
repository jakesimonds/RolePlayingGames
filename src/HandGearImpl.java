public class HandGearImpl implements HandGear {

    private int defense;
    private int attack;
    private String name;
    private String nameAdj;
    private String nameNoun;
    private boolean isCombined;
    private boolean isTaken;


    public HandGearImpl(String adj, String noun, int attack, int defense)throws IllegalArgumentException{
        if (defense < 0){throw new IllegalArgumentException("Defense value must be positive");}
        if (attack <0){throw new IllegalArgumentException("Attack value must be positive");}
        this.nameAdj = adj;
        this.nameNoun = noun;
        this.attack = attack;
        this.defense = defense;
        this.name = adj + " " + noun;
        //when constructing, they won't be combined
        this.isCombined = false;
        this.isTaken = false;
    }


    @Override
    public void setName(String adj, String noun) {
        this.name = adj + " " + noun;
        this.nameAdj = adj;
        this.nameNoun = noun;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setDefense(int defense) {
        this.defense = defense;
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public void setAttack(int attack) {
    this.attack = attack;
    }

    @Override
    public int getAttack() {
        return this.attack;
    }

//    @Override
//    public HandGearImpl combine(HandgearImpl other) {
//        return null;
//    }

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Defense = " + defense + "\n" +
                "Attack = " + attack + "\n" +
                "Is taken = " + isTaken;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof HeadGearImpl)){
            System.out.println("Not headgear!");
            return false;
        }
        HeadGearImpl other = (HeadGearImpl) obj;
        if(this.name.equals(other.getName())) {
            return true;
        }
        else{
            return false;
        }
    }


}
