public class FootwearImpl implements Footwear {
    private int defense;
    private int attack;
    private String name;
    private String nameAdj;
    private String nameNoun;
    private boolean isCombined;
    private boolean isTaken;

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

    @Override
    public String toString() {
        return "Name = " + name + "\n" +
                "Defense = " + defense + "\n" +
                "Attack = " + attack + "\n" +
                "Is taken = " + isTaken;
    }

    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof FootwearImpl)){
            System.out.println("Not headgear!");
            return false;
        }
        FootwearImpl other = (FootwearImpl) obj;
        if(this.name.equals(other.getName())) {
            return true;
        }
        else{
            return false;
        }
    }
}
