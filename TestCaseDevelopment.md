# 🏥 Hospital Information Management System (HIMS) - Test Case Development

## 📌 Overview
This document outlines **8 functional test cases** and **2 non-functional test scenarios** to validate the **HIMS functional and non-functional requirements** from Assignment 4. Each test case includes **Test Case ID, Requirement ID, Description, Steps, Expected Result, Actual Result, and Status**.

---

## 📋 Functional Test Cases  

| **Test Case ID** | **Requirement ID** | **Description** | **Steps** | **Expected Result** | **Actual Result** | **Status** |
|-----------------|------------------|----------------|-----------|------------------|----------------|--------|
| TC001 | FR-003 | Book an Appointment | 1. Login as Patient <br> 2. Navigate to "Book Appointment" <br> 3. Select doctor, date, and time <br> 4. Click "Confirm" | Appointment is scheduled, and confirmation is sent |  |  |
| TC002 | FR-004 | Send Appointment Reminder | 1. System checks upcoming appointments <br> 2. Sends SMS/email reminders 24 hours prior | Patient receives reminder notification |  |  |
| TC003 | FR-002 | Update Patient Records | 1. Login as Doctor <br> 2. Search for a patient <br> 3. Edit medical records (diagnosis, treatment) <br> 4. Click "Save" | Updated record is stored and visible |  |  |
| TC004 | FR-007 | Generate Invoice | 1. Login as Billing Staff <br> 2. Select patient <br> 3. Generate invoice <br> 4. Print/email invoice | Invoice is generated and sent |  |  |
| TC005 | FR-008 | Process Payment | 1. Login as Patient <br> 2. Navigate to "Billing" <br> 3. Enter payment details <br> 4. Click "Pay" | Payment is processed and receipt is generated |  |  |
| TC006 | FR-006 | Retrieve Medical History | 1. Login as Doctor/Nurse <br> 2. Search for a patient <br> 3. View patient history | Full medical history is displayed |  |  |
| TC007 | FR-009 | Notify Outstanding Balances | 1. System checks unpaid invoices <br> 2. Sends payment reminders to patients | Patient receives notification |  |  |
| TC008 | FR-010 | Generate Reports | 1. Login as Admin <br> 2. Select report type (financial, patient, operational) <br> 3. Generate report | Report is generated and available for download |  |  |

---

## 🚀 Non-Functional Test Scenarios  

### **1️⃣ Performance Test**  
**Requirement ID:** NFR-011 (Search results must be displayed within 2 seconds)  
**Test Scenario:**  
- Simulate **1,000 concurrent users** performing searches in the system.  
- Measure response time for search queries.  
**Expected Result:** Search results should be displayed **≤ 2 seconds** under peak load.  

### **2️⃣ Security Test**  
**Requirement ID:** NFR-010 (Authentication must be handled with OAuth 2.0 & MFA)  
**Test Scenario:**  
- Attempt login **without multi-factor authentication (MFA)**.  
- Attempt **SQL injection** in login form.  
**Expected Result:**  
- MFA must be required for login.  
- System must reject SQL injection attempts.  

---

## ✅ Conclusion  
This document provides a structured **Test Case Development** approach for validating both **functional and non-functional requirements** of the **Hospital Information Management System (HIMS)**.  

---
[🔙 Back to Menu](./TestAndUseCaseDocument.md)  
