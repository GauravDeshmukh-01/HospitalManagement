package hospitalManagementsystem;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hospital hospital = new Hospital();

        HospitalService service =
                new HospitalService(hospital);

        int choice;

        do {

            System.out.println("\n-------------------------------------");
            System.out.println("     HOSPITAL MANAGEMENT SYSTEM");
            System.out.println("---------------------------------------");

            System.out.println("1. Add Patient");
            System.out.println("2. View Patients");
            System.out.println("3. Search Patient");
            System.out.println("4. Add Doctor");
            System.out.println("5. View Doctors");
            System.out.println("6. Search Doctor");
            System.out.println("7. Book Appointment");
            System.out.println("8. View Appointments");
            System.out.println("9. Generate Bill");
            System.out.println("10. View Bills");
            System.out.println("11. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID: ");
                    int patientId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String patientName = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Disease: ");
                    String disease = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String contact = sc.nextLine();

                    Patient patient = new Patient(
                            patientId,
                            patientName,
                            age,
                            gender,
                            disease,
                            contact
                    );

                    service.addPatient(patient);

                    break;

                case 2:

                    service.displayPatients();

                    break;

                case 3:

                    System.out.print("Enter Patient ID: ");
                    int searchPatientId = sc.nextInt();

                    service.searchPatient(searchPatientId);

                    break;

                case 4:

                    System.out.print("Enter Doctor ID: ");
                    int doctorId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Doctor Name: ");
                    String doctorName = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String specialization = sc.nextLine();

                    System.out.print("Enter Contact: ");
                    String doctorContact = sc.nextLine();

                    Doctor doctor = new Doctor(
                            doctorId,
                            doctorName,
                            specialization,
                            doctorContact
                    );

                    service.addDoctor(doctor);

                    break;

                case 5:

                    service.displayDoctors();

                    break;

                case 6:

                    System.out.print("Enter Doctor ID: ");
                    int searchDoctorId = sc.nextInt();

                    service.searchDoctor(searchDoctorId);

                    break;

                case 7:

                    System.out.print("Enter Appointment ID: ");
                    int appointmentId = sc.nextInt();

                    System.out.print("Enter Patient ID: ");
                    int appointmentPatientId = sc.nextInt();

                    System.out.print("Enter Doctor ID: ");
                    int appointmentDoctorId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Appointment Date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter Appointment Time: ");
                    String time = sc.nextLine();

                    Appointment appointment = new Appointment(
                            appointmentId,
                            appointmentPatientId,
                            appointmentDoctorId,
                            date,
                            time
                    );

                    service.bookAppointment(appointment);

                    break;

                case 8:

                    service.displayAppointments();

                    break;

                case 9:

                    System.out.print("Enter Bill ID: ");
                    int billId = sc.nextInt();

                    System.out.print("Enter Patient ID: ");
                    int billPatientId = sc.nextInt();

                    System.out.print("Enter Consultation Fee: ");
                    double consultationFee = sc.nextDouble();

                    System.out.print("Enter Medicine Fee: ");
                    double medicineFee = sc.nextDouble();

                    System.out.print("Enter Room Fee: ");
                    double roomFee = sc.nextDouble();

                    Bill bill = new Bill(
                            billId,
                            billPatientId,
                            consultationFee,
                            medicineFee,
                            roomFee
                    );

                    service.generateBill(bill);

                    break;

                case 10:

                    service.displayBills();

                    break;

                case 11:

                    System.out.println(
                        "\nThank you for using Hospital Management System!"
                    );

                    break;

                default:

                    System.out.println(
                        "Invalid choice! Please enter 1-11."
                    );
            }

        } while (choice != 11);

        sc.close();
    }
}