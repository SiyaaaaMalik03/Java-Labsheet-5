class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {

        // Local variable
        String result;

        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }

        return result;
    }
}

public class EligibilityMain {
    public static void main(String[] args) {

        Medicine medicine = new Medicine("Medicine A", 18);

        System.out.println("Age 20: " +
                medicine.checkEligibility(20));

        System.out.println("Age 15: " +
                medicine.checkEligibility(15));
    }
}