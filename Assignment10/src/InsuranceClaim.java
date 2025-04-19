
public class InsuranceClaim {
    private String claimId;
    private Patient patient;
    private String providerName;
    private String documents;
    private String status;
    private String decision;

    public InsuranceClaim(String claimId, Patient patient, String providerName, String documents) {
        this.claimId = claimId;
        this.patient = patient;
        this.providerName = providerName;
        this.documents = documents;
        this.status = "Submitted";
        this.decision = null;
    }

    public void submit() {
        System.out.println("Claim submitted.");
    }

    public void review() {
        System.out.println("Reviewing claim...");
    }

    public void approve() {
        this.decision = "Approved";
        this.status = "Completed";
    }

    public void reject() {
        this.decision = "Rejected";
        this.status = "Completed";
    }
}
