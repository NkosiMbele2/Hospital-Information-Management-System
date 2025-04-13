
# 🧩 Domain Model

This domain model identifies key entities, their attributes, methods, and relationships within the **Hospital Information Management System (HIMS)**. The model supports the functional and non-functional requirements, use cases, and system behavior models defined in previous assignments.

---

## 📘 Domain Entities Overview

| **Entity**        | **Attributes**                                                                 | **Methods**                                                  | **Relationships**                          |
|------------------|---------------------------------------------------------------------------------|--------------------------------------------------------------|--------------------------------------------|
| **Patient**       | patientID, name, dateOfBirth, contactInfo, medicalHistory                      | register(), bookAppointment(), viewHistory()                 | Books Appointments, Linked to MedicalRecord |
| **Doctor**        | doctorID, name, specialty, schedule                                             | viewPatientHistory(), updateMedicalRecord(), diagnose()      | Views/Updates MedicalRecords, Approves Appointments |
| **Appointment**   | appointmentID, patientID, doctorID, date, time, status                          | schedule(), cancel(), reschedule(), confirm()                | Associated with Patient & Doctor           |
| **MedicalRecord** | recordID, patientID, doctorID, diagnosis, prescriptions, notes                  | update(), view(), archive()                                  | Linked to Patient, Managed by Doctor       |
| **Invoice**       | invoiceID, patientID, amount, dateIssued, dueDate, status                       | generate(), markPaid(), sendReminder()                       | Issued to Patient, Processed via Payment   |
| **Payment**       | paymentID, invoiceID, method, amount, date, status                              | process(), validate(), issueReceipt()                        | Linked to Invoice                          |
| **InsuranceClaim**| claimID, patientID, providerName, documents, status, decision                   | submit(), review(), approve(), reject()                      | Linked to Patient, Reviewed by Admin       |

---

## 🔗 Entity Relationships Summary

- A **Patient**:
  - Can **book multiple Appointments**.
  - Has **one or more Medical Records**.
  - Receives **Invoices and makes Payments**.
  - May **submit Insurance Claims**.

- A **Doctor**:
  - Is assigned to **Appointments**.
  - Creates/updates **Medical Records** for Patients.

- An **Appointment**:
  - Connects a **Patient** to a **Doctor**.
  - Includes status transitions (Requested → Approved → Completed).

- A **MedicalRecord**:
  - Is owned by a **Patient**.
  - Is updated by a **Doctor**.

- An **Invoice**:
  - Is linked to a **Patient’s services**.
  - Must be paid or associated with an **InsuranceClaim**.

- A **Payment**:
  - Is made against an **Invoice**.
  - Can be completed via credit card, cash, or insurance.

- An **InsuranceClaim**:
  - Is submitted by a **Patient** and reviewed by the **System or Admin**.

---

## 📜 Business Rules

1. A **patient** can book appointments **only after registration**.
2. A **doctor** can only view records of **assigned patients**.
3. A **patient** can have **only one appointment at a time** with a specific doctor.
4. **Invoices must be paid within 30 days** or marked as overdue.
5. A **claim can only be approved if all required documents are uploaded**.
6. A **payment** cannot be processed if the linked invoice status is already "Paid".

---
🔙 [Back to Main Menu](./Assignment9.md)

