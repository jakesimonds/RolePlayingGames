public abstract class GearImpl implements Gear {
    public GearImpl(String name, String adj) {
        //name same as noun
        this.name = name;
        this.adj = adj;
    }

    private String name;
    private String adj;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getAdj() {
        return this.adj;
    }

    abstract protected Gear combineInternal(String newName,
                                            String newAdj);

    @Override
    abstract public Gear combine(Gear other);

//        String newName = this.name + other.getName();
//        String newAdj = this.adj + other.getAdj();
//
//        return combineInternal(newName, newAdj);

//        if (other instanceof HandGear) {
//            return new HandGear(newName, newAdj);
//        } else if (other instanceof FootWear) {
//            return new FootWear(newName, newAdj);
//        } else {
//            return new GearImpl(newName, newAdj);
//        }
//    }

    public static void main(String[] args) {
        Gear hg1 = new HandGear("handgear", "1");
        Gear hg2 = new HandGear("handgear", "2");
        Gear hg3 = hg1.combine(hg2);
        System.out.println(hg3.toString());
    }
}
