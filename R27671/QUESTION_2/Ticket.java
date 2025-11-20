package R27671.QUESTION_2;

public final class Ticket extends Payment {
    private String ticketNumber;
    private String issueDate;

    public Ticket(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                  String airlineName, String airlineCode, String contactEmail,
                  String flightNumber, String departure, String destination, double baseFare,
                  String pilotName, String licenseNumber, int experienceYears,
                  String crewName, String role, String shift,
                  String passengerName, int age, String gender, String contact,
                  String bookingDate, String seatNumber, String travelClass,
                  String paymentDate, String paymentMethod, double amountPaid,
                  String ticketNumber, String issueDate) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass,
                paymentDate, paymentMethod, amountPaid);
        setTicketNumber(ticketNumber);
        setIssueDate(issueDate);
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        if (ticketNumber == null || ticketNumber.trim().isEmpty())
            throw new IllegalArgumentException("ticketNumber cannot be empty");
        this.ticketNumber = ticketNumber;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(String issueDate) {
        if (issueDate == null || issueDate.trim().isEmpty())
            throw new IllegalArgumentException("issueDate cannot be empty");
        if (!issueDate.matches("\\d{4}-\\d{2}-\\d{2}"))
            throw new IllegalArgumentException("issueDate must be in YYYY-MM-DD format");
        this.issueDate = issueDate;
    }

    /**
     * Calculate final fare: baseFare + taxes - discounts
     * taxes = 10% of baseFare
     * discounts: Business 10%, First 20% of baseFare; Economy 0%
     */
    public double calculateFare() {
        double base = getBaseFare();
        double taxes = base * 0.10;
        double discount = 0.0;
        String cls = getTravelClass();
        if (cls != null) {
            if (cls.equalsIgnoreCase("Business")) discount = base * 0.10;
            else if (cls.equalsIgnoreCase("First")) discount = base * 0.20;
        }
        return base + taxes - discount;
    }
}
