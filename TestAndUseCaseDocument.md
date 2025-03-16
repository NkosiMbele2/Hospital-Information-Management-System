# 🏥 Hospital Information Management System (HIMS) - Test & Use Case Document  

## 📌 Table of Contents  
- [1️⃣ Introduction](#1️⃣-introduction)  
- [2️⃣ Use Case Diagram](./UseCaseDiagrams.md)  
- [3️⃣ Use Case Specifications](./UseCaseSpecifications.md)  
- [4️⃣ Test Case Development](./TestCaseDevelopment.md)  
- [5️⃣ Conclusion](#5️⃣-conclusion)  

---

## 1️⃣ Introduction  
The **Hospital Information Management System (HIMS)** is designed to digitize hospital operations, improving **efficiency, accuracy, and compliance**. This document details the **Use Case Diagram, Use Case Specifications, and Test Cases** to ensure functional alignment with stakeholders' needs.  

---

## 2️⃣ Use Case Diagram  
### **🎯 Key Actors & Use Cases**  
- **Actors:**  
  - 🏥 **Patient** – Books appointments, views medical history.  
  - 👨‍⚕️ **Doctor** – Manages patient records, diagnoses, and treatments.  
  - 🏪 **Billing Staff** – Handles invoices, payments, and insurance claims.  
  - 🏛️ **Admin** – Generates reports, manages users.  
  - 🔐 **System** – Sends notifications, secures data.  
  - 🛡️ **Compliance Officer** – Ensures data security & regulatory compliance.  

```mermaid
graph TD;
  Patient -- Schedules --> Appointment[Book Appointment]
  Patient -- Views --> MedicalRecords[View Medical History]
  Doctor -- Updates --> MedicalRecords
  Doctor -- Prescribes --> Treatment[Enter Treatment & Diagnosis]
  BillingStaff -- Processes --> Payment[Process Payment]
  BillingStaff -- Generates --> Invoice[Generate Invoice]
  Admin -- Creates --> Report[Generate Reports]
  ComplianceOfficer -- Ensures --> Security[Enforce Data Security]
  System -- Notifies --> Reminder[Send Appointment Reminders]
  System -- Notifies --> BillingReminder[Send Payment Notifications]
