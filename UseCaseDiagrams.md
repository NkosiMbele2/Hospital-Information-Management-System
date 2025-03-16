# Use Case Diagrams 

## Actors and Roles
### 👤 Key Actors and Their Roles:
- 👩‍⚕️ Patient (P): Registers, books appointments, and makes payments.
- 🩺 Doctor (D): Updates medical records and views patient history.
- 🧑‍⚕️ Nurse (N): Views patient medical history.
- 💼 Billing Staff (BS): Generates invoices and processes payments.
- 🧑‍💼 Administrator (Admin): Manages user roles and generates reports.
- 💳 Insurance Provider (IP): Processes insurance claims.


### 💡 Use Cases:
- 💻 Register Patient: The patient can create a profile in the system.
- 📅 Book Appointment: Patients can schedule, reschedule, or cancel appointments with doctors.
- 💳 Make Payment: Patients can pay for medical services, either directly or via insurance.
- 📋 Update Medical Records: Doctors update diagnoses, prescriptions, and treatment plans.
- 📖 View Patient History: Doctors and nurses access a patient's medical history.
- 💸 Generate Invoice: Billing staff creates invoices for medical services.
- 💳 Process Payment: Billing staff processes payments after generating invoices.
- 🔑 Manage User Roles: Admin can manage user permissions and roles.
- 📊 Generate Reports: Admin generates various reports (e.g., operational, financial, patient).
- 🛡️ Process Insurance Claims: Insurance providers process claims for medical services.

![image alt](https://github.com/NkosiMbele2/Hospital-Information-Management-System/blob/d742e7fe2dc901f8c02905795a1531e1cb5d2253/HIMS.png)
  
### 🔄 Relationships Between Actors and Use Cases:
- "Register Patient" → "Book Appointment": Patient registration includes booking appointments.
- "Process Payment" → "Generate Invoice": Payment processing includes generating an invoice.
- "Generate Reports" → "View Patient History": Reports may include patient history information.

### 📌 How the Diagram Addresses Stakeholder Concerns from Assignment 4:
- 👩‍⚕️ Patient (P): Ensures smooth registration, appointment booking, and payment processes to improve user experience.
- 🩺 Doctor (D): Provides quick and accurate access to medical records and patient history, supporting better care decisions.
- 💼 Billing Staff (BS): Streamlines invoice generation and payment processing, ensuring accurate billing and reducing errors.
- 🧑‍💼 Administrator (Admin): Facilitates the management of system roles and permissions, ensuring appropriate access to sensitive data.
- 💳 Insurance Provider (IP): Simplifies the processing of claims, making reimbursement faster and more accurate.

________________________ 

[🔙 Back to Menu](./TestAndUseCaseDocument.md)  
