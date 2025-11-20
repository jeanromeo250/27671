package R27671.QUESTION_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        InputValidator v = new InputValidator(sc);

        try {
            System.out.println("--- Flight Booking System Demo ---");

            int id = v.readPositiveInt("Entity ID: ");
            String created = v.readDate("Created date (YYYY-MM-DD): ");
            String updated = v.readDate("Updated date (YYYY-MM-DD): ");

            String airportName = v.readNonEmptyString("Airport name: ");
            String airportCode = v.readAirportCode("Airport code (3 uppercase letters): ");
            String location = v.readNonEmptyString("Airport location: ");

            String airlineName = v.readNonEmptyString("Airline name: ");
            String airlineCode = v.readAirlineCode("Airline code (2-4 letters): ");
            String airlineEmail = v.readEmail("Airline contact email: ");

            String flightNumber = v.readNonEmptyString("Flight number: ");
            String departure = v.readNonEmptyString("Departure: ");
            String destination = v.readNonEmptyString("Destination: ");
            double baseFare = v.readPositiveDouble("Base fare: ");

            String pilotName = v.readNonEmptyString("Pilot name: ");
            String license = v.readNonEmptyString("Pilot license number: ");
            int expYears = v.readPositiveInt("Pilot experience years: ");

            String crewName = v.readNonEmptyString("Cabin crew name: ");
            String role = v.readNonEmptyString("Cabin crew role: ");
            String shift = v.readShift("Cabin crew shift (Day/Night): ");

            String passengerName = v.readNonEmptyString("Passenger name: ");
            int age = v.readPositiveInt("Passenger age: ");
            String gender = v.readGender("Passenger gender (Male/Female/Other): ");
            String contact = v.readNonEmptyString("Passenger contact: ");

            String bookingDate = v.readDate("Booking date (YYYY-MM-DD): ");
            String seatNumber = v.readNonEmptyString("Seat number: ");
            String travelClass = v.readTravelClass("Travel class (Economy/Business/First): ");

            String paymentDate = v.readDate("Payment date (YYYY-MM-DD): ");
            String paymentMethod = v.readNonEmptyString("Payment method: ");
            double amountPaid = v.readPositiveDouble("Amount paid: ");

            String ticketNumber = v.readNonEmptyString("Ticket number: ");
            String issueDate = v.readDate("Issue date (YYYY-MM-DD): ");

            // Build the chain: Ticket extends Payment -> Booking -> Passenger -> CabinCrew -> Pilot -> Flight -> Airline -> Airport -> Entity
            Ticket ticket = new Ticket(id, created, updated, airportName, airportCode, location,
                    airlineName, airlineCode, airlineEmail, flightNumber, departure, destination, baseFare,
                    pilotName, license, expYears, crewName, role, shift, passengerName, age, gender, contact,
                    bookingDate, seatNumber, travelClass, paymentDate, paymentMethod, amountPaid, ticketNumber, issueDate);

            System.out.println("\n--- Ticket Summary ---");
            System.out.println("Ticket: " + ticket.getTicketNumber() + " issued: " + ticket.getIssueDate());
            System.out.println("Passenger: " + ticket.getPassengerName() + " (" + ticket.getAge() + ")");
            System.out.println("Flight: " + ticket.getFlightNumber() + " " + ticket.getDeparture() + "->" + ticket.getDestination());
            System.out.println("Class: " + ticket.getTravelClass() + " Seat: " + ticket.getSeatNumber());
            System.out.println("Base fare: " + ticket.getBaseFare());
            System.out.println("Calculated fare: " + ticket.calculateFare());

            // Optionally show payment summary
            System.out.println("Amount paid: " + ticket.getAmountPaid() + " via " + ticket.getPaymentMethod());

        } catch (Exception ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            sc.close();
        }
    }
}
