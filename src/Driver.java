import java.util.ArrayList;

public interface Driver {

    int start();

    Fighter getFighter1();

    Fighter getFighter2();

    ArrayList<Gear> getGears();

    ArrayList<FootWear> getFootWears();

    ArrayList<HandGear> getHandGears();

    ArrayList<HeadGear> getHeadGears();

    void printFighterGear(Fighter fighter);

    void takeTurn(Fighter fighter);

    void pickFirstItem(Fighter fighter);

    int equip(Fighter fighter,TypeOfGear[] types);


}
