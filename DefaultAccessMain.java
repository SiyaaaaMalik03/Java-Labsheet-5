class Pharmacy {

    // Default/package-private members
    String medicineName;
    double price;

    Pharmacy() {
        medicineName = "Paracetamol";
        price = 50;
    }

    void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Price: " + price);
    }
}

public class DefaultAccessMain {
    public static void main(String[] args) {

        Pharmacy p = new Pharmacy();

        // Direct access because both classes are in same package
        System.out.println(p.medicineName);
        System.out.println(p.price);

        p.displayMedicine();
    }
}