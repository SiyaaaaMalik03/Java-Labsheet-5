class Student {
    String name;
    int rollNo;
    double marks;

    // No-argument constructor
    Student() {
        name = "Srishti";
        rollNo = 101;
        marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

public class StudentMain {
    public static void main(String[] args) {
        Student s = new Student();
        s.displayDetails();
    }
}