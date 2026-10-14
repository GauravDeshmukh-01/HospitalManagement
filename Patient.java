package hospitalManagementsystem;
public class Patient {

    private int patientId;
    private String patientName;
    private int age;
    private String gender;
    private String disease;
    private String contact;

    public Patient(int patientId, String patientName, int age,
                   String gender, String disease, String contact) {

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        this.contact = contact;
    }

    public int getPatientId() {
        return patientId;
    }

    public void displayPatient() {

        System.out.println("--------------------------------");
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + patientName);
        System.out.println("Age        : " + age);
        System.out.println("Gender     : " + gender);
        System.out.println("Disease    : " + disease);
        System.out.println("Contact    : " + contact);
        System.out.println("--------------------------------");
    }
}