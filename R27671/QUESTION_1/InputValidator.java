package R27671.QUESTION_1;

import java.util.Scanner;

/**
 * Utility class for validated input with retry on validation failure.
 * Each method prompts the user and repeats until valid input is received.
 */
public class InputValidator {
    private Scanner sc;

    public InputValidator(Scanner sc) {
        this.sc = sc;
    }


    public int readPositiveInt(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int value = Integer.parseInt(sc.nextLine());
                if (value <= 0) {
                    System.out.println("ERROR: Value must be greater than 0. Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Invalid integer. Try again.");
            }
        }
    }

    /**
     * Reads a positive double (> 0) with retry.
     */
    public double readPositiveDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double value = Double.parseDouble(sc.nextLine());
                if (value <= 0) {
                    System.out.println("ERROR: Value must be greater than 0. Try again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("ERROR: Invalid number. Try again.");
            }
        }
    }

    /**
     * Reads a non-empty string with retry.
     */
    public String readNonEmptyString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (value.isEmpty()) {
                System.out.println("ERROR: Cannot be empty. Try again.");
                continue;
            }
            return value;
        }
    }

    /**
     * Reads a 10-digit phone number with retry.
     */
    public String read10DigitPhone(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (value.matches("\\d{10}")) {
                return value;
            }
            System.out.println("ERROR: Phone must be exactly 10 digits. Try again.");
        }
    }

    /**
     * Reads a valid email with retry.
     */
    public String readValidEmail(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
                return value;
            }
            System.out.println("ERROR: Invalid email format. Try again.");
        }
    }

    /**
     * Reads an alphanumeric code of at least 3 characters with retry.
     */
    public String readAlphanumericCode(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (value.length() < 3) {
                System.out.println("ERROR: Code must be at least 3 characters. Try again.");
                continue;
            }
            if (!value.matches("[A-Za-z0-9]+")) {
                System.out.println("ERROR: Code must be alphanumeric. Try again.");
                continue;
            }
            return value;
        }
    }

    /**
     * Reads a non-empty date string (simple format check) with retry.
     */
    public String readDate(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = sc.nextLine().trim();
            if (value.isEmpty()) {
                System.out.println("ERROR: Date cannot be empty. Try again.");
                continue;
            }
            return value;
        }
    }
}
