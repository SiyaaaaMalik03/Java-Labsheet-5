class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

public class MedicineMain {
    public static void main(String[] args) {

        Medicine m1 = new Medicine("Paracetamol", "P101", 50);
        Medicine m2 = new Medicine("Amoxicillin", "A202", 120);

        m1.displayMedicine();
        m2.displayMedicine();
    }
}