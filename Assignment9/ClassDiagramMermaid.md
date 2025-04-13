
# 🧱 Class Diagram (Mermaid.js)

This Mermaid.js class diagram represents the core domain entities of the Hospital Information Management System (HIMS), their attributes, methods, and interrelationships including multiplicity, composition, and association.

```mermaid
classDiagram
    class Patient {
        -patientID: String
        -name: String
        -dateOfBirth: Date
        -contactInfo: String
        -medicalHistory: String
        +register()
        +bookAppointment()
        +viewHistory()
    }

    class Doctor {
        -doctorID: String
        -name: String
        -specialty: String
        -schedule: String
        +viewPatientHistory()
        +updateMedicalRecord()
        +diagnose()
    }

    class Appointment {
        -appointmentID: String
        -date: Date
        -time: String
        -status: String
        +schedule()
        +cancel()
        +reschedule()
        +confirm()
    }

    class MedicalRecord {
        -recordID: String
        -diagnosis: String
        -prescriptions: String
        -notes: String
        +update()
        +view()
        +archive()
    }

    class Invoice {
        -invoiceID: String
        -amount: Double
        -dateIssued: Date
        -dueDate: Date
        -status: String
        +generate()
        +markPaid()
        +sendReminder()
    }

    class Payment {
        -paymentID: String
        -method: String
        -amount: Double
        -date: Date
        -status: String
        +process()
        +validate()
        +issueReceipt()
    }

    class InsuranceClaim {
        -claimID: String
        -providerName: String
        -documents: String
        -status: String
        -decision: String
        +submit()
        +review()
        +approve()
        +reject()
    }

    Patient "1" -- "0..*" Appointment : books
    Doctor "1" -- "0..*" Appointment : manages
    Patient "1" -- "0..*" MedicalRecord : owns
    Doctor "1" -- "0..*" MedicalRecord : updates
    Patient "1" -- "0..*" Invoice : receives
    Invoice "1" -- "1" Payment : paidBy
    Patient "1" -- "0..*" InsuranceClaim : submits
```

---

## 📌 Explanation of Key Design Decisions

- **Composition & Multiplicity**: 
  - A `Patient` can book many `Appointments`, but each `Appointment` belongs to one `Doctor` and one `Patient`.
  - `Invoice` and `Payment` are tightly coupled—each invoice must be associated with a payment.
  - `MedicalRecord` is owned by `Patient` but updated by `Doctor`, reflecting the real-world collaboration.

- **Encapsulation**:
  - Attributes are marked private (`-`) to maintain encapsulation.
  - Methods are public (`+`) for entity interaction.

- **System Alignment**:
  - Matches the functional requirements (e.g., booking, diagnosis, billing).
  - Reflects activities and state transitions such as payment processing, record updates, and appointment workflows.
 
  ---
  🔙 [Back to Main Menu](./Assignment9.md)
