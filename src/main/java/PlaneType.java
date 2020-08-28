public enum PlaneType {

    BOEING747(400, 50000),
    BOEING767(335, 25000),
    BOEING777(380, 30000),
    BOEING787(250, 20000),
    AIRBUSA330(220, 15000),
    AIRBUSMINI(3, 500);

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
