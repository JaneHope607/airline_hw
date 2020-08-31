public class Passenger {

    private String name;
    private int bags;
    private final int standardBagWeight = 10;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
    }

    public String getName() {
        return name;
    }

    public int getBags() {
        return bags;
    }

    public int getBagWeight() {
        return bags * standardBagWeight;
    }
}
