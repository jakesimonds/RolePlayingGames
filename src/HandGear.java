public class HandGear extends GearImpl {
    public HandGear(String name, String adj) {
        super(name, adj);
    }

    @Override
    protected Gear combineInternal(String newName, String newAdj) {
        return new HandGear(newName, newAdj);
    }

    //    @Override
//    public Gear combine(Gear other) {
//        return null;
//    }

    @Override
    public String toString() {
        return "HandGear";
    }
}

