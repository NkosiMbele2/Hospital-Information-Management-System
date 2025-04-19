
public class Payment {
    private String paymentId;
    private Invoice invoice;
    private String method;
    private double amount;
    private String date;
    private String status;

    public Payment(String paymentId, Invoice invoice, String method, double amount, String date) {
        this.paymentId = paymentId;
        this.invoice = invoice;
        this.method = method;
        this.amount = amount;
        this.date = date;
        this.status = "Pending";
    }

    public void process() {
        this.status = "Completed";
    }

    public void validate() {
        System.out.println("Validating payment...");
    }

    public void issueReceipt() {
        System.out.println("Issuing receipt...");
    }
}
