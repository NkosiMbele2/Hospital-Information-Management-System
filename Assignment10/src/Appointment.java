
public class Appointment {
    private String appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String status;

    public Appointment(String appointmentId, Patient patient, Doctor doctor, String date, String time) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = "Requested";
    }

    public void schedule() {
        status = "Approved";
    }

    public void cancel() {
        status = "Canceled";
    }

    public void reschedule(String newDate, String newTime) {
        this.date = newDate;
        this.time = newTime;
    }

    public void confirm() {
        status = "Confirmed";
    }
}
