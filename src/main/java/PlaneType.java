public enum PlaneType {

    BOEING747(100, 750),
    BOEING767(80, 550),
    BOEING777(60, 500),
    BOEING787(35, 400),
    AIRBUSA330(22, 380),
    AIRBUSMINI(5, 100);

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
