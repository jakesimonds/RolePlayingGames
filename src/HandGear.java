public interface HandGear {
    void setName(String adj, String noun);
    String getName();
    void setDefense(int defense);
    int getDefense();
    void setAttack(int attack);
    int getAttack();

    //HandGearImpl combine(HandgearImpl other);
}
