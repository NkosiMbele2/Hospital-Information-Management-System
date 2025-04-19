
public class Doctor {
    private String doctorId;
    private String name;
    private String specialty;
    private String schedule;

    public Doctor(String doctorId, String name, String specialty, String schedule) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialty = specialty;
        this.schedule = schedule;
    }

    public void viewPatientHistory(Patient patient) {
        for (String entry : patient.viewHistory()) {
            System.out.println(entry);
        }
    }

    public void updateMedicalRecord(MedicalRecord record, String diagnosis, String prescriptions, String notes) {
        record.update(diagnosis, prescriptions, notes);
    }

    public void diagnose() {
        System.out.println("Diagnosing patient...");
    }
}
