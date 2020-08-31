public enum PlaneType {

    BOEING747(400, 750),
    BOEING767(335, 550),
    BOEING777(380, 500),
    BOEING787(250, 400),
    AIRBUSA330(220, 380),
    AIRBUSMINI(3, 100);

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
