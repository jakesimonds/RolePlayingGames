public interface Gear {
    String getName();
    String getAdj();
    Gear combine(Gear other);
    TypeOfGear getTypeOfGear();
}
