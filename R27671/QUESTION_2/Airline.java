package R27671.QUESTION_2;

public class Airline extends Airport {
    private String airlineName;
    private String airlineCode; // 2-4 letters
    private String contactEmail;

    public Airline(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                   String airlineName, String airlineCode, String contactEmail) {
        super(id, createdDate, updatedDate, airportName, code, location);
        setAirlineName(airlineName);
        setAirlineCode(airlineCode);
        setContactEmail(contactEmail);
    }

    public String getAirlineName() {
        return airlineName;
    }

    public void setAirlineName(String airlineName) {
        if (airlineName == null || airlineName.trim().isEmpty())
            throw new IllegalArgumentException("airlineName cannot be empty");
        this.airlineName = airlineName;
    }

    public String getAirlineCode() {
        return airlineCode;
    }

    public void setAirlineCode(String airlineCode) {
        if (airlineCode == null || !airlineCode.matches("[A-Za-z]{2,4}"))
            throw new IllegalArgumentException("airlineCode must be 2-4 letters");
        this.airlineCode = airlineCode.toUpperCase();
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        if (contactEmail == null || !contactEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
            throw new IllegalArgumentException("contactEmail is invalid");
        this.contactEmail = contactEmail;
    }
}
