class Hospital {

    // Public members can be accessed directly
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "City Hospital";
        hospitalCode = "H101";
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Code: " + hospitalCode);
    }
}

public class PublicAccessMain {
    public static void main(String[] args) {

        Hospital h = new Hospital();

        // Direct access to public members
        System.out.println(h.hospitalName);
        System.out.println(h.hospitalCode);

        h.displayHospital();
    }
}