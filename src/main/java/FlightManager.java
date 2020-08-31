public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public int baggageWeightEachPassenger() {
        int weightBags = flight.getPlaneWeight();
        return weightBags / flight.getCapacity();
    }

    public int baggageWeightTotal() {
        int total = 0;
        for (Passenger passenger: flight.getPassengers()) {
            total += passenger.getBagWeight();
        }
        return total;
    }

    public int getRemainingBaggageWeight() {
        int weightBags = flight.getPlaneWeight();
        return weightBags - this.baggageWeightTotal();
    }
}
