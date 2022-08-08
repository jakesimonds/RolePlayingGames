public interface Gear {
    String getName();
    String getAdj();
    int getDefense();

    int getDefence();

    int getAttack();
    Gear combine(Gear other);
    TypeOfGear getTypeOfGear();
}
