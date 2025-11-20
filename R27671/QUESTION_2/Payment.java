package R27671.QUESTION_2;

public class Payment extends Booking {
    private String paymentDate;
    private String paymentMethod;
    private double amountPaid;

    public Payment(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail,
                   String flightNumber, String departure, String destination, double baseFare,
                   String pilotName, String licenseNumber, int experienceYears,
                   String crewName, String role, String shift,
                   String passengerName, int age, String gender, String contact,
                   String bookingDate, String seatNumber, String travelClass,
                   String paymentDate, String paymentMethod, double amountPaid) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift, passengerName, age, gender, contact, bookingDate, seatNumber, travelClass);
        setPaymentDate(paymentDate);
        setPaymentMethod(paymentMethod);
        setAmountPaid(amountPaid);
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        if (paymentDate == null || paymentDate.trim().isEmpty())
            throw new IllegalArgumentException("paymentDate cannot be empty");
        if (!paymentDate.matches("\\d{4}-\\d{2}-\\d{2}"))
            throw new IllegalArgumentException("paymentDate must be in YYYY-MM-DD format");
        this.paymentDate = paymentDate;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        if (paymentMethod == null || paymentMethod.trim().isEmpty())
            throw new IllegalArgumentException("paymentMethod cannot be empty");
        this.paymentMethod = paymentMethod;
    }

    public double getAmountPaid() {
        return amountPaid;
    }

    public void setAmountPaid(double amountPaid) {
        if (amountPaid <= 0) throw new IllegalArgumentException("amountPaid must be > 0");
        this.amountPaid = amountPaid;
    }
}
