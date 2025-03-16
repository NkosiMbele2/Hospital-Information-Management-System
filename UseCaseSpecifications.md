# 🏥 Hospital Information Management System (HIMS) - Use Case Specifications

## 📌 Overview
This document provides detailed use case specifications for 8 critical use cases in the Hospital Information Management System (HIMS). Each use case includes its **description, preconditions, postconditions, basic flow, and alternative flows.**  

---

## 1️⃣ **Use Case: Register Patient**
**Actor:** 👩‍⚕️ Patient  
**Description:** The patient registers in the system by providing personal details and medical history.  
**Precondition:** The patient must have access to the hospital's registration system.  
**Postcondition:** The system stores patient details and generates a unique patient ID.  

### **Basic Flow:**
1. Patient accesses the registration form.
2. Patient enters personal details (name, DOB, contact, insurance info).
3. System validates input and checks for existing records.
4. System assigns a unique Patient ID.
5. System confirms successful registration.  

### **Alternative Flows:**
- **❌ Duplicate Entry:** If the patient already exists, the system notifies the user.  
- **❌ Missing Required Fields:** If mandatory fields are missing, the system prompts for completion.  

---

## 2️⃣ **Use Case: Book Appointment**
**Actor:** 👩‍⚕️ Patient  
**Description:** The patient books a consultation with a doctor.  
**Precondition:** The patient must be registered in the system.  
**Postcondition:** An appointment is scheduled, and the patient receives confirmation.  

### **Basic Flow:**
1. Patient logs in and selects "Book Appointment."
2. System displays available doctors and time slots.
3. Patient selects a doctor, date, and time.
4. System confirms availability and schedules the appointment.
5. Patient receives confirmation via email/SMS.  

### **Alternative Flows:**
- **❌ No Available Slots:** Patient is prompted to select another date/time.  
- **❌ Patient Not Registered:** The system redirects to the registration page.  

---

## 3️⃣ **Use Case: Make Payment**
**Actor:** 👩‍⚕️ Patient  
**Description:** The patient makes a payment for medical services.  
**Precondition:** The patient has an outstanding bill.  
**Postcondition:** The payment is processed, and the balance is updated.  

### **Basic Flow:**
1. Patient navigates to "Billing" section.
2. System displays outstanding invoices.
3. Patient selects a payment method (credit card, insurance, etc.).
4. System processes payment and updates the balance.
5. System sends a receipt via email.  

### **Alternative Flows:**
- **❌ Payment Failed:** System prompts the patient to retry or use another method.  
- **❌ Insurance Claim Rejected:** System notifies the patient and suggests alternative payment.  

---

## 4️⃣ **Use Case: Update Medical Records**
**Actor:** 🩺 Doctor  
**Description:** The doctor updates a patient’s medical history.  
**Precondition:** The patient must have an existing record in the system.  
**Postcondition:** The updated medical record is saved and accessible.  

### **Basic Flow:**
1. Doctor searches for the patient's record.
2. System retrieves and displays the record.
3. Doctor updates diagnoses, prescriptions, and treatment plans.
4. System saves the updates securely.  

### **Alternative Flows:**
- **❌ Patient Not Found:** System prompts for correct details or new registration.  

---

## 5️⃣ **Use Case: View Patient History**
**Actor:** 🩺 Doctor, 🧑‍⚕️ Nurse  
**Description:** Medical staff retrieves a patient’s medical history.  
**Precondition:** The patient’s record must exist.  
**Postcondition:** The medical history is displayed for reference.  

### **Basic Flow:**
1. Doctor/Nurse logs into the system.
2. System prompts for patient search criteria.
3. Medical staff enters patient details.
4. System retrieves and displays patient history.  

### **Alternative Flows:**
- **❌ Unauthorized Access:** System denies access if the staff does not have permission.  

---

## 6️⃣ **Use Case: Generate Invoice**
**Actor:** 💼 Billing Staff  
**Description:** Generates an invoice for a patient’s medical services.  
**Precondition:** The patient must have received billable services.  
**Postcondition:** A detailed invoice is generated.  

### **Basic Flow:**
1. Billing staff logs in and selects "Generate Invoice."
2. System retrieves patient’s medical services and calculates the cost.
3. System generates and displays the invoice.
4. Staff prints or emails the invoice to the patient.  

### **Alternative Flows:**
- **❌ Missing Service Records:** System prompts staff to verify records.  

---

## 7️⃣ **Use Case: Process Insurance Claims**
**Actor:** 💳 Insurance Provider  
**Description:** Processes claims for insured patients.  
**Precondition:** The patient must have valid insurance coverage.  
**Postcondition:** The claim is processed, and the system updates payment status.  

### **Basic Flow:**
1. Billing staff submits an insurance claim.
2. System verifies patient’s insurance details.
3. Insurance provider reviews and approves/rejects the claim.
4. System updates the claim status.  

### **Alternative Flows:**
- **❌ Insurance Rejected:** System notifies patient to arrange alternative payment.  

---

## 8️⃣ **Use Case: Generate Reports**
**Actor:** 🧑‍💼 Administrator  
**Description:** The administrator generates reports for hospital operations.  
**Precondition:** The system must have stored data to generate reports.  
**Postcondition:** A report is generated and available for analysis.  

### **Basic Flow:**
1. Administrator selects "Generate Reports."
2. System prompts for report type (e.g., financial, operational, patient).
3. Admin selects filters (date range, department, etc.).
4. System generates the report and presents it in a downloadable format.  

### **Alternative Flows:**
- **❌ No Data Available:** System displays an error message.  

---

## ✅ Conclusion
This document outlines the core functionalities of the **Hospital Information Management System (HIMS)** through **8 critical use cases**, ensuring a well-structured and functional digital healthcare system.  

---
