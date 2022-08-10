public interface Gear {
    String getName();
    String getAdj();

    int getDefence();

    int getAttack();
    Gear combine(Gear other);
    TypeOfGear getTypeOfGear();
}
