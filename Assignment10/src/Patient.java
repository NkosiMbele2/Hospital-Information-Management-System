
public class Patient {
    private String patientId;
    private String name;
    private String dob;
    private String contactInfo;
    private String[] medicalHistory;

    public Patient(String patientId, String name, String dob, String contactInfo) {
        this.patientId = patientId;
        this.name = name;
        this.dob = dob;
        this.contactInfo = contactInfo;
        this.medicalHistory = new String[0];
    }

    public void register() {
        System.out.println("Registering patient: " + name);
    }

    public void bookAppointment(Appointment appointment) {
        System.out.println("Booking appointment for: " + name);
    }

    public String[] viewHistory() {
        return medicalHistory;
    }

    public String getName() {
        return name;
    }

    public void setContactInfo(String newInfo) {
        this.contactInfo = newInfo;
    }
}
