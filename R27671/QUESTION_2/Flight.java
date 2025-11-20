package R27671.QUESTION_2;

public class Flight extends Airline {
    private String flightNumber;
    private String departure;
    private String destination;
    private double baseFare;

    public Flight(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail);
        setFlightNumber(flightNumber);
        setDeparture(departure);
        setDestination(destination);
        setBaseFare(baseFare);
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        if (flightNumber == null || flightNumber.trim().isEmpty())
            throw new IllegalArgumentException("flightNumber cannot be empty");
        this.flightNumber = flightNumber;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        if (departure == null || departure.trim().isEmpty())
            throw new IllegalArgumentException("departure cannot be empty");
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination == null || destination.trim().isEmpty())
            throw new IllegalArgumentException("destination cannot be empty");
        this.destination = destination;
    }

    public double getBaseFare() {
        return baseFare;
    }

    public void setBaseFare(double baseFare) {
        if (baseFare <= 0) throw new IllegalArgumentException("baseFare must be > 0");
        this.baseFare = baseFare;
    }
}
