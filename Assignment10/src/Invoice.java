
public class Invoice {
    private String invoiceId;
    private Patient patient;
    private double amount;
    private String dateIssued;
    private String dueDate;
    private String status;

    public Invoice(String invoiceId, Patient patient, double amount, String dateIssued, String dueDate) {
        this.invoiceId = invoiceId;
        this.patient = patient;
        this.amount = amount;
        this.dateIssued = dateIssued;
        this.dueDate = dueDate;
        this.status = "Unpaid";
    }

    public void generate() {
        System.out.println("Generating invoice...");
    }

    public void markPaid() {
        status = "Paid";
    }

    public void sendReminder() {
        System.out.println("Sending reminder to patient...");
    }
}
