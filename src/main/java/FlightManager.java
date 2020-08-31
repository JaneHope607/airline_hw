public class FlightManager {

    public int baggageWeightEachPassenger(Flight flight) {
        int weightBags = flight.getPlaneWeight();
        return weightBags / flight.getCapacity();
    }

    public int baggageWeightTotal(Flight flight) {
        int passengers = flight.numberPassengers();
        return passengers * this.baggageWeightEachPassenger(flight);
    }

    public int getRemainingBaggageWeight(Flight flight) {
        int weightBags = flight.getPlaneWeight();
        return weightBags - this.baggageWeightTotal(flight);
    }
}
