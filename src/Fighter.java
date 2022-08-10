public interface Fighter {

    String getName();

    void setName(String name);

    int getAttack();
    void setAttack(int attack);

    int getDefense();

    void setDefense(int defense);

    void pickGear(Gear gear);

    int fight(Fighter other);

    public HeadGear getHeadGear();

    public HandGear getLeftHandGear();

    public HandGear getRightHandGear();

    public FootWear getLeftFootwear() ;

    public FootWear getRightFootwear() ;
}
