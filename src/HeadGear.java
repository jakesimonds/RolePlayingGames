public class HeadGear extends GearImpl{
    public HeadGear(String name, String adj) {
        super(name, adj);
    }

    @Override
    protected Gear combineInternal(String newName, String newAdj) {
        return null;
    }
}
