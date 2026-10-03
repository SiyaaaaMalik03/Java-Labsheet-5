class Employee {

    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

// Pharmacist is the child class
class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {

        // Call parent constructor
        super(employeeId, employeeName, salary);

        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {

        displayEmployee();
        System.out.println("License No: " + licenseNo);
    }
}

public class SingleInheritanceMain {
    public static void main(String[] args) {

        Pharmacist p =
                new Pharmacist(101, "Srishti", 50000, "LIC123");

        p.displayPharmacist();
    }
}