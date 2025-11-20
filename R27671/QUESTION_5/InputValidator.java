package R27671.QUESTION_5;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class InputValidator {
    private static final Scanner scanner = new Scanner(System.in);
    public static int getPositiveInt(String prompt) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine());
                if (value > 0) return value;
            } catch (Exception e) {}
            System.out.println("Enter a positive integer.");
        }
    }
    public static String getNonEmptyString(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine();
            if (value != null && !value.trim().isEmpty()) return value;
            System.out.println("Input cannot be empty.");
        }
    }
    public static String getCode(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine();
            if (value != null && value.length() >= 3) return value;
            System.out.println("Code must be at least 3 characters.");
        }
    }
    public static int getCredits(String prompt) {
        return getPositiveInt(prompt);
    }
    public static String getEmail(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine();
            if (value != null && value.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) return value;
            System.out.println("Invalid email format.");
        }
    }
    public static String getPhone(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine();
            if (value != null && value.matches("\\d{10}")) return value;
            System.out.println("Phone must be 10 digits.");
        }
    }
    public static Date getDate(String prompt) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        while (true) {
            System.out.print(prompt);
            try {
                return sdf.parse(scanner.nextLine());
            } catch (ParseException e) {
                System.out.println("Enter date in yyyy-MM-dd format.");
            }
        }
    }
    public static String getStatus(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt);
            value = scanner.nextLine();
            if ("Present".equalsIgnoreCase(value) || "Absent".equalsIgnoreCase(value)) return value;
            System.out.println("Status must be Present or Absent.");
        }
    }
    public static boolean getBoolean(String prompt) {
        String value;
        while (true) {
            System.out.print(prompt + " (true/false): ");
            value = scanner.nextLine();
            if ("true".equalsIgnoreCase(value)) return true;
            if ("false".equalsIgnoreCase(value)) return false;
            System.out.println("Enter true or false.");
        }
    }
}