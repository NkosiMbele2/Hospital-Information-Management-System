
public class MedicalRecord {
    private String recordId;
    private String diagnosis;
    private String prescriptions;
    private String notes;

    public MedicalRecord(String recordId) {
        this.recordId = recordId;
        this.diagnosis = "";
        this.prescriptions = "";
        this.notes = "";
    }

    public void update(String diagnosis, String prescriptions, String notes) {
        this.diagnosis = diagnosis;
        this.prescriptions = prescriptions;
        this.notes = notes;
    }

    public void view() {
        System.out.println("Diagnosis: " + diagnosis);
        System.out.println("Prescriptions: " + prescriptions);
        System.out.println("Notes: " + notes);
    }

    public void archive() {
        System.out.println("Archiving medical record...");
    }
}
