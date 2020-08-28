public enum PlaneType {

    BOEING747(400, 183500),
    BOEING767(335, 122000),
    BOEING777(380, 143000),
    BOEING787(250, 110230),
    AIRBUSA330(220, 101500),
    AIRBUSA350(440, 194120);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getWeight() {
        return weight;
    }
}
