public class FighterImpl implements Fighter{
    private String name;
    private int attack;
    private int defense;
    private int health;
    private boolean IsAlive;
    private HeadGearImpl Headgear;
    private HandGearImpl Handgear;
    private FootwearImpl Footwear;
    boolean hasHeadGear;
    boolean hasHandGear;
    boolean hasFootwear;

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
    this.attack = attack;
    }

    @Override
    public int getDefense() {
        return this.defense;
    }

    @Override
    public void setDefense(int defense) {
    this.defense = defense;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public void setHealth(int health) {
    this.health = health;
    }

    @Override
    public boolean getAlive() {
        return this.IsAlive;
    }

    @Override
    public void setAlive(boolean isAlive) {
        this.IsAlive = isAlive;
    }

    @Override
    public void pickHeadGear(HeadGearImpl headgear) {


    }

    @Override
    public void pickHandGear(HandGearImpl handgear) {

    }

    @Override
    public void pickFootwear(FootwearImpl footwear) {

    }

    @Override
    public void takeDamage(FighterImpl other) {
    }

    //To string

    //Equals
}
