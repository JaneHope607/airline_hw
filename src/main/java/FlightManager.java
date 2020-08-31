public class FlightManager {

    public int baggageWeightEachPassenger(Flight flight) {
        Plane plane = flight.getPlane();
        return plane.maxBaggage() / plane.getCapacity();
    }

    public int baggageWeightTotal(Flight flight) {
        int passengers = flight.numberPassengers();
        return passengers * this.baggageWeightEachPassenger(flight);
    }

    public int getRemainingBaggageWeight(Flight flight) {
        Plane plane = flight.getPlane();
        return plane.maxBaggage() - this.baggageWeightTotal(flight);
    }
}
