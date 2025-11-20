package R27671.QUESTION_6;

import java.util.Scanner;

public class InputValidator {
    private Scanner sc;

    public InputValidator(Scanner sc) { this.sc = sc; }

    public int readInt(String prompt, int minInclusive) {
        while (true) {
            try {
                System.out.print(prompt);
                int v = Integer.parseInt(sc.nextLine());
                if (v < minInclusive) { System.out.println("ERROR: value must be >= " + minInclusive); continue; }
                return v;
            } catch (Exception e) { System.out.println("ERROR: invalid integer"); }
        }
    }

    public double readDouble(String prompt, double minInclusive) {
        while (true) {
            try {
                System.out.print(prompt);
                double v = Double.parseDouble(sc.nextLine());
                if (v < minInclusive) { System.out.println("ERROR: value must be >= " + minInclusive); continue; }
                return v;
            } catch (Exception e) { System.out.println("ERROR: invalid number"); }
        }
    }

    public String readNonEmpty(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.isEmpty()) { System.out.println("ERROR: cannot be empty"); continue; }
            return s;
        }
    }

    public boolean readBoolean(String prompt) {
        while (true) {
            System.out.print(prompt + " (true/false): ");
            String s = sc.nextLine().trim().toLowerCase();
            if (s.equals("true")) return true;
            if (s.equals("false")) return false;
            System.out.println("ERROR: enter true or false");
        }
    }

    public String readOrgCode(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (s.length() < 3) { System.out.println("ERROR: code must be at least 3 characters"); continue; }
            return s;
        }
    }

    public String readRssbNumber(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.matches("\\d{8}")) { System.out.println("ERROR: RSSB must be exactly 8 digits"); continue; }
            return s;
        }
    }

    public String readEmail(String prompt) {
        while (true) {
            System.out.print(prompt);
            String s = sc.nextLine().trim();
            if (!s.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) { System.out.println("ERROR: invalid email format"); continue; }
            return s;
        }
    }

    public String readDeptCode(String prompt) {
        return readOrgCode(prompt);
    }

    public int readEmployeeID(String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                int v = Integer.parseInt(sc.nextLine());
                if (v < 1000) { System.out.println("ERROR: employeeID must be >= 1000"); continue; }
                return v;
            } catch (Exception e) { System.out.println("ERROR: invalid integer"); }
        }
    }

    public int readMonth(String prompt) {
        while (true) {
            int m = readInt(prompt, 1);
            if (m > 12) { System.out.println("ERROR: month must be 1-12"); continue; }
            return m;
        }
    }

    public int readYear(String prompt) {
        return readInt(prompt, 2000);
    }

    public double readNonNegativeDouble(String prompt) {
        return readDouble(prompt, 0.0);
    }
}
