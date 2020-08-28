import java.util.ArrayList;

public class Flight {

    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String airport;
    private String departure;

    public Flight(Plane plane, String flightNumber, String destination, String airport, String departure) {
        this.passengers = new ArrayList<Passenger>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.airport = airport;
        this.departure = departure;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public Plane getPlane() {
        return plane;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getAirport() {
        return airport;
    }

    public String getDeparture() {
        return departure;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public int numberPassengers() {
        return this.passengers.size();
    }

    public int availableSeats() {
        if (this.plane.getCapacity() >= numberPassengers()) {
            return this.plane.getCapacity() - numberPassengers());
        } else {
            return 0;
        }
    }

    public void addPassenger(Passenger passenger) {
        if (this.availableSeats() > 0) {
            this.passengers.add(passenger);
        }
    }

}

