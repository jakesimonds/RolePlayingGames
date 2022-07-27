public class HeadGearImpl implements HeadGear {
    private int defense;
    private String name;
    private String nameAdj;
    private String nameNoun;
    private boolean isTaken;


    public HeadGearImpl(String adj, String noun, int defense)throws IllegalArgumentException{
        if (defense < 0){throw new IllegalArgumentException("Defense value must be positive");}
        this.nameAdj = adj;
        this.nameNoun = noun;
        this.defense = defense;
        this.name = adj + " " + noun;
        this.isTaken = false;
    }


    @Override
    public void setName(String adj, String noun) {
        this.name = adj + " " + noun;
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
    public String toString() {
        return "Name = " + name + "\n" +
                "Defense = " + defense + "\n" +
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

    //Jake commenting here
}
