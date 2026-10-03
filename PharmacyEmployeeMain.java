class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;

    // Static class variable
    static int employeeCount = 0;

    // Protected member used by child classes
    protected String department = "Pharmacy";

    // Default/package-private member
    String status = "Active";

    Employee(int employeeId, String employeeName, double salary) {

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;

        employeeCount++;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {

        // Negative salary is rejected
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary.");
        }
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Status: " + status);
    }
}

class Pharmacist extends Employee {

    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {

        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {

        displayEmployee();

        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
    }

    void showRole() {
        System.out.println("Pharmacist handles medicines.");
    }
}

class StoreManager extends Employee {

    private int storeSection;

    StoreManager(int employeeId, String employeeName,
                  double salary, int storeSection) {

        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    void displayStoreManager() {

        displayEmployee();

        System.out.println("Role: Store Manager");
        System.out.println("Store Section: " + storeSection);
    }

    void showRole() {
        System.out.println("Store Manager manages the pharmacy section.");
    }
}

class PharmacyEmployeeManager {

    void processEmployees(Employee[] employees) {

        // Local variables
        int pharmacistCount = 0;
        int managerCount = 0;

        for (int i = 0; i < employees.length; i++) {

            if (employees[i] instanceof Pharmacist) {

                Pharmacist p = (Pharmacist) employees[i];

                p.displayPharmacist();
                p.showRole();

                pharmacistCount++;

            } else if (employees[i] instanceof StoreManager) {

                StoreManager s = (StoreManager) employees[i];

                s.displayStoreManager();
                s.showRole();

                managerCount++;
            }

            System.out.println("-------------------------");
        }

        System.out.println("Pharmacists: " + pharmacistCount);
        System.out.println("Store Managers: " + managerCount);
        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}

public class PharmacyEmployeeMain {

    public static void main(String[] args) {

        Employee[] employees = {
            new Pharmacist(
                101,
                "Srishti",
                45000,
                "LIC123"
            ),

            new StoreManager(
                102,
                "Rahul",
                60000,
                2
            )
        };

        PharmacyEmployeeManager manager =
                new PharmacyEmployeeManager();

        manager.processEmployees(employees);
    }
}