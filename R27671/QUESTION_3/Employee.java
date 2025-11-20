package R27671.QUESTION_3;

public class Employee extends Employer {
    private String employeeName;
    private double salary;
    private String employeeTIN; // 9 digits

    public Employee(int id, String createdDate, String updatedDate, String authorityName, String region, String email,
                    String categoryName, double rate, String code,
                    String tin, String taxpayerName, String address,
                    String employerName, String employerTIN, String contact,
                    String employeeName, double salary, String employeeTIN) {
        super(id, createdDate, updatedDate, authorityName, region, email, categoryName, rate, code, tin, taxpayerName, address, employerName, employerTIN, contact);
        setEmployeeName(employeeName);
        setSalary(salary);
        setEmployeeTIN(employeeTIN);

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        if (employeeName == null || employeeName.trim().isEmpty()) throw new TaxDataException("employeeName cannot be empty");
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) throw new TaxDataException("salary must be > 0");
        this.salary = salary;
    }

    public String getEmployeeTIN() {
        return employeeTIN;
    }

    public void setEmployeeTIN(String employeeTIN) {
        if (employeeTIN == null || !employeeTIN.matches("\\d{9}")) throw new TaxDataException("employeeTIN must be 9 digits");
        this.employeeTIN = employeeTIN;
    }
}
