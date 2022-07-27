public interface Fighter {

    String getName();

    void setName(String name);

    int getAttack();
    void setAttack(int attack);

    int getDefense();

    void setDefense(int defense);

    int getHealth();

    void setHealth(int health);

    boolean getAlive();

    void setAlive(boolean isAlive);

    void pickHeadGear(HeadGearImpl headgear);

    void pickHandGear(HandGearImpl handgear);

    void pickFootwear(FootwearImpl footwear);

    void takeDamage(FighterImpl other);

}
