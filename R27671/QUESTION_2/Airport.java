package R27671.QUESTION_2;

public class Airport extends Entity {
    private String airportName;
    private String code; // 3 uppercase letters
    private String location;

    public Airport(int id, String createdDate, String updatedDate, String airportName, String code, String location) {
        super(id, createdDate, updatedDate);
        setAirportName(airportName);
        setCode(code);
        setLocation(location);
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        if (airportName == null || airportName.trim().isEmpty())
            throw new IllegalArgumentException("airportName cannot be empty");
        this.airportName = airportName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        if (code == null || !code.matches("[A-Z]{3}"))
            throw new IllegalArgumentException("code must be 3 uppercase letters");
        this.code = code;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        if (location == null || location.trim().isEmpty())
            throw new IllegalArgumentException("location cannot be empty");
        this.location = location;
    }
}
