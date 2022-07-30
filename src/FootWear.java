 public class FootWear extends GearImpl {
        public FootWear(String name, String adj) {
            super(name, adj);
        }

        @Override
        protected Gear combineInternal(String newName, String newAdj) {
            return new FootWear(newName, newAdj);
        }

//    @Override
//    public Gear combine(Gear other) {
//        return null;
//    }

        @Override
        public String toString() {
            return "FootWear";
        }
    }


