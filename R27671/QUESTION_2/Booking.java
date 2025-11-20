package R27671.QUESTION_2;

public class Booking extends Passenger {
    private String bookingDate;
    private String seatNumber;
    private String travelClass; // Economy/Business/First

    public Booking(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact);
        setBookingDate(bookingDate);
        setSeatNumber(seatNumber);
        setTravelClass(travelClass);
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        if (bookingDate == null || bookingDate.trim().isEmpty())
            throw new IllegalArgumentException("bookingDate cannot be empty");
        if (!bookingDate.matches("\\d{4}-\\d{2}-\\d{2}"))
            throw new IllegalArgumentException("bookingDate must be in YYYY-MM-DD format");
        this.bookingDate = bookingDate;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        if (seatNumber == null || seatNumber.trim().isEmpty())
            throw new IllegalArgumentException("seatNumber cannot be empty");
        this.seatNumber = seatNumber;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public void setTravelClass(String travelClass) {
        if (travelClass == null) throw new IllegalArgumentException("travelClass cannot be null");
        String t = travelClass.trim();
        if (!(t.equalsIgnoreCase("Economy") || t.equalsIgnoreCase("Business") || t.equalsIgnoreCase("First")))
            throw new IllegalArgumentException("travelClass must be Economy, Business, or First");
        this.travelClass = t.substring(0,1).toUpperCase() + t.substring(1).toLowerCase();
    }
}
