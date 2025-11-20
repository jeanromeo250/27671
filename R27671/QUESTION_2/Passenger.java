package R27671.QUESTION_2;

public class Passenger extends CabinCrew {
    private String passengerName;
    private int age;
    private String gender;
    private String contact;

    public Passenger(int id, String createdDate, String updatedDate, String airportName, String code, String location,
                     String airlineName, String airlineCode, String contactEmail,
                     String flightNumber, String departure, String destination, double baseFare,
                     String pilotName, String licenseNumber, int experienceYears,
                     String crewName, String role, String shift,
                     String passengerName, int age, String gender, String contact) {
        super(id, createdDate, updatedDate, airportName, code, location, airlineName, airlineCode, contactEmail,
                flightNumber, departure, destination, baseFare, pilotName, licenseNumber, experienceYears,
                crewName, role, shift);
        setPassengerName(passengerName);
        setAge(age);
        setGender(gender);
        setContact(contact);
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        if (passengerName == null || passengerName.trim().isEmpty())
            throw new IllegalArgumentException("passengerName cannot be empty");
        this.passengerName = passengerName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) throw new IllegalArgumentException("age must be > 0");
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null) throw new IllegalArgumentException("gender cannot be null");
        String g = gender.trim();
        if (!(g.equalsIgnoreCase("Male") || g.equalsIgnoreCase("Female") || g.equalsIgnoreCase("Other")))
            throw new IllegalArgumentException("gender must be Male, Female or Other");
        this.gender = g.substring(0,1).toUpperCase() + g.substring(1).toLowerCase();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        if (contact == null || contact.trim().isEmpty())
            throw new IllegalArgumentException("contact cannot be empty");
        this.contact = contact;
    }
}
