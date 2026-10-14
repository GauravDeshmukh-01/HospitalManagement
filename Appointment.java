package hospitalManagementsystem;
public class Appointment {

    private int appointmentId;
    private int patientId;
    private int doctorId;
    private String appointmentDate;
    private String appointmentTime;

    public Appointment(int appointmentId, int patientId,
                       int doctorId, String appointmentDate,
                       String appointmentTime) {

        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    public void displayAppointment() {

        System.out.println("--------------------------------");
        System.out.println("Appointment ID : " + appointmentId);
        System.out.println("Patient ID     : " + patientId);
        System.out.println("Doctor ID      : " + doctorId);
        System.out.println("Date           : " + appointmentDate);
        System.out.println("Time           : " + appointmentTime);
        System.out.println("--------------------------------");
    }
}