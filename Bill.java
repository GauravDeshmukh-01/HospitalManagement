package hospitalManagementsystem;

public class Bill {

    private int billId;
    private int patientId;
    private double consultationFee;
    private double medicineFee;
    private double roomFee;

    public Bill(int billId, int patientId,
                double consultationFee,
                double medicineFee,
                double roomFee) {

        this.billId = billId;
        this.patientId = patientId;
        this.consultationFee = consultationFee;
        this.medicineFee = medicineFee;
        this.roomFee = roomFee;
    }

    public double calculateTotal() {

        return consultationFee + medicineFee + roomFee;
    }

    public void displayBill() {

        System.out.println("--------------------------------");
        System.out.println("Bill ID          : " + billId);
        System.out.println("Patient ID       : " + patientId);
        System.out.println("Consultation Fee : " + consultationFee);
        System.out.println("Medicine Fee     : " + medicineFee);
        System.out.println("Room Fee         : " + roomFee);
        System.out.println("Total Amount     : " + calculateTotal());
        System.out.println("--------------------------------");
    }
}