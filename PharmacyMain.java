class Pharmacy {
    String pharmacyName;
    String location;

    // Class variable shared by all objects
    static int pharmacyCount = 0;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
    }

    void displayPharmacyCount() {
        System.out.println("Total Pharmacies: " + pharmacyCount);
    }
}

public class PharmacyMain {
    public static void main(String[] args) {

        Pharmacy p1 = new Pharmacy("City Pharmacy", "Roorkee");
        Pharmacy p2 = new Pharmacy("Health Pharmacy", "Haridwar");
        Pharmacy p3 = new Pharmacy("Care Pharmacy", "Dehradun");

        p1.displayPharmacy();
        p2.displayPharmacy();
        p3.displayPharmacy();

        p1.displayPharmacyCount();
    }
}