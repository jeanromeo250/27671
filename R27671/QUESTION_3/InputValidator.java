package R27671.QUESTION_3;

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

    public double readNonNegativeDouble(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                double v = Double.parseDouble(sc.nextLine());
                if (v < 0) { System.out.println("ERROR: must be >= 0"); continue; }
                return v;
            } catch (NumberFormatException ex) { System.out.println("ERROR: invalid number"); }
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

    public String readMonth(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.matches("\\d{4}-\\d{2}")) return s;
            System.out.println("ERROR: month must be YYYY-MM");
        }
    }

    public String readTIN(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.matches("\\d{9}")) return s;
            System.out.println("ERROR: TIN must be 9 digits");
        }
    }

    public String readPhone(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.matches("\\d{10}")) return s;
            System.out.println("ERROR: phone must be 10 digits");
        }
    }
}
