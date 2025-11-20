package R27671.QUESTION_2;

public class Pilot extends Flight {
    private String pilotName;
    private String licenseNumber;
    private int experienceYears;

    public Pilot(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                 String airlineName, String airlineCode, String contactEmail,
                 String flightNumber, String departure, String destination, double baseFare,
                 String pilotName, String licenseNumber, int experienceYears) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare);
        setPilotName(pilotName);
        setLicenseNumber(licenseNumber);
        setExperienceYears(experienceYears);
    }

    public String getPilotName() {
        return pilotName;
    }

    public void setPilotName(String pilotName) {
        if (pilotName == null || pilotName.trim().isEmpty())
            throw new IllegalArgumentException("pilotName cannot be empty");
        this.pilotName = pilotName;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.trim().isEmpty())
            throw new IllegalArgumentException("licenseNumber cannot be empty");
        this.licenseNumber = licenseNumber;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        if (experienceYears < 2) throw new IllegalArgumentException("experienceYears must be >= 2");
        this.experienceYears = experienceYears;
    }
}
