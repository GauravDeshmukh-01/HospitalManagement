package hospitalManagementsystem;
public class Doctor {

    private int doctorId;
    private String doctorName;
    private String specialization;
    private String contact;

    public Doctor(int doctorId, String doctorName,
                  String specialization, String contact) {

        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.contact = contact;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void displayDoctor() {

        System.out.println("--------------------------------");
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Name           : " + doctorName);
        System.out.println("Specialization : " + specialization);
        System.out.println("Contact        : " + contact);
        System.out.println("--------------------------------");
    }
}