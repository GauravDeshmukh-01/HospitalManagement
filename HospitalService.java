package hospitalManagementsystem;
public class HospitalService {

    private Hospital hospital;

    public HospitalService(Hospital hospital) {

        this.hospital = hospital;
    }

    // Add Patient
    public void addPatient(Patient patient) {

        hospital.getPatients().add(patient);

        System.out.println("Patient added successfully!");
    }

    // Display Patients
    public void displayPatients() {

        if (hospital.getPatients().isEmpty()) {

            System.out.println("No patients available.");
            return;
        }

        System.out.println("\n========== PATIENT LIST ==========");

        for (Patient patient : hospital.getPatients()) {

            patient.displayPatient();
        }
    }

    // Search Patient
    public void searchPatient(int patientId) {

        for (Patient patient : hospital.getPatients()) {

            if (patient.getPatientId() == patientId) {

                System.out.println("\nPatient Found!");
                patient.displayPatient();
                return;
            }
        }

        System.out.println("Patient not found.");
    }

    // Add Doctor
    public void addDoctor(Doctor doctor) {

        hospital.getDoctors().add(doctor);

        System.out.println("Doctor added successfully!");
    }

    // Display Doctors
    public void displayDoctors() {

        if (hospital.getDoctors().isEmpty()) {

            System.out.println("No doctors available.");
            return;
        }

        System.out.println("\n========== DOCTOR LIST ==========");

        for (Doctor doctor : hospital.getDoctors()) {

            doctor.displayDoctor();
        }
    }

    // Search Doctor
    public void searchDoctor(int doctorId) {

        for (Doctor doctor : hospital.getDoctors()) {

            if (doctor.getDoctorId() == doctorId) {

                System.out.println("\nDoctor Found!");
                doctor.displayDoctor();
                return;
            }
        }

        System.out.println("Doctor not found.");
    }

    // Book Appointment
    public void bookAppointment(Appointment appointment) {

        hospital.getAppointments().add(appointment);

        System.out.println("Appointment booked successfully!");
    }

    // Display Appointments
    public void displayAppointments() {

        if (hospital.getAppointments().isEmpty()) {

            System.out.println("No appointments available.");
            return;
        }

        System.out.println("\n========== APPOINTMENT LIST ==========");

        for (Appointment appointment : hospital.getAppointments()) {

            appointment.displayAppointment();
        }
    }

    // Generate Bill
    public void generateBill(Bill bill) {

        hospital.getBills().add(bill);

        System.out.println("Bill generated successfully!");
    }

    // Display Bills
    public void displayBills() {

        if (hospital.getBills().isEmpty()) {

            System.out.println("No bills available.");
            return;
        }

        System.out.println("\n========== BILL LIST ==========");

        for (Bill bill : hospital.getBills()) {

            bill.displayBill();
        }
    }
}