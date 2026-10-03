class Person {

    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {

    private int employeeId;
    private double salary;

    // Static class variable
    static int employeeCount = 0;

    Employee(String name, int age, int employeeId, double salary) {

        super(name, age);

        this.employeeId = employeeId;
        this.salary = salary;

        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }
}

class Doctor extends Employee {

    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {

        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor");
        System.out.println("Specialization: " + specialization);
    }
}

class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {

        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
    }
}

class StaffManager {

    void displayStaff(Employee[] staff) {

        // Local variable
        int count = 0;

        for (int i = 0; i < staff.length; i++) {

            if (staff[i] instanceof Doctor) {

                ((Doctor) staff[i]).displayDoctor();

            } else if (staff[i] instanceof Pharmacist) {

                ((Pharmacist) staff[i]).displayPharmacist();
            }

            count++;
            System.out.println();
        }

        System.out.println("Processed Staff: " + count);
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}

public class HospitalStaffMain {
    public static void main(String[] args) {

        Employee[] staff = {
            new Doctor("Rahul", 35, 101, 70000, "Cardiology"),
            new Pharmacist("Srishti", 22, 102, 45000, "LIC123")
        };

        StaffManager manager = new StaffManager();
        manager.displayStaff(staff);
    }
}