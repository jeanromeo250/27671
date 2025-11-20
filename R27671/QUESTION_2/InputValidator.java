package R27671.QUESTION_2;

import java.util.Scanner;

public class InputValidator {
    private Scanner sc;

    public InputValidator(Scanner sc) {
        this.sc = sc;
    }

    public int readPositiveInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int v = Integer.parseInt(sc.nextLine());
                if (v <= 0) { System.out.println("ERROR: must be > 0"); continue; }
                return v;
            } catch (NumberFormatException ex) { System.out.println("ERROR: invalid integer"); }
        }
    }

    public double readPositiveDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double v = Double.parseDouble(sc.nextLine());
                if (v <= 0) { System.out.println("ERROR: must be > 0"); continue; }
                return v;
            } catch (NumberFormatException ex) { System.out.println("ERROR: invalid number"); }
        }
    }

    public String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.isEmpty()) { System.out.println("ERROR: cannot be empty"); continue; }
            return s;
        }
    }

    public String readDate(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.matches("\\d{4}-\\d{2}-\\d{2}")) return s;
            System.out.println("ERROR: date must be YYYY-MM-DD");
        }
    }

    public String readAirportCode(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim().toUpperCase();
            if (s.matches("[A-Z]{3}")) return s;
            System.out.println("ERROR: airport code must be 3 uppercase letters");
        }
    }

    public String readAirlineCode(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.matches("[A-Za-z]{2,4}")) return s.toUpperCase();
            System.out.println("ERROR: airline code must be 2-4 letters");
        }
    }

    public String readEmail(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) return s;
            System.out.println("ERROR: invalid email");
        }
    }

    public String readGender(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.equalsIgnoreCase("Male") || s.equalsIgnoreCase("Female") || s.equalsIgnoreCase("Other")) return s;
            System.out.println("ERROR: gender must be Male/Female/Other");
        }
    }

    public String readShift(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.equalsIgnoreCase("Day") || s.equalsIgnoreCase("Night")) return s;
            System.out.println("ERROR: shift must be Day or Night");
        }
    }

    public String readTravelClass(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.equalsIgnoreCase("Economy") || s.equalsIgnoreCase("Business") || s.equalsIgnoreCase("First")) return s;
            System.out.println("ERROR: travel class must be Economy/Business/First");
        }
    }
}
