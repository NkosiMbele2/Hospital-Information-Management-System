# Agile Planning Document

## 📂 Project Documentation  
🔹 **[User Story Creation](./User_Story_Creation.md)** – A detailed format of User stories  

🔹 **[Sprint Planing](./Sprint_Planning.md)** – Sprint goal, sprint backlog, and a goal statemen

🔹 **[Product Backlog](./Product_Backlog.md)** – A prioritized product backlog using the MoSCoW method.  

🔹 **[Project Link](https://github.com/users/NkosiMbele2/projects/1/views/1)** – Link to the project   

🔹 **[Issues Link](https://github.com/NkosiMbele2/Hospital-Information-Management-System/issues)** – Link to the Issues   


## 1️⃣ Product Backlog

### Prioritized Product Backlog (MoSCoW Method)

| **Story ID** | **User Story** | **Priority (MoSCoW)** | **Effort Estimate (1-5)** | **Dependencies** |
|-------------|--------------|----------------|-------------------|---------------|
| **US001** | *As a patient, I want to register an account so that I can book appointments and access my medical records.* | Must-have | 3 | None |
| **US002** | *As a patient, I want to book, reschedule, or cancel an appointment so that I can manage my medical visits conveniently.* | Must-have | 3 | US001 |
| **US003** | *As a doctor, I want to update a patient's medical records so that I can keep track of diagnoses and treatment history.* | Must-have | 4 | US001 |
| **US004** | *As a doctor, I want to view a patient’s medical history so that I can make informed decisions about their treatment.* | Must-have | 3 | US001 |
| **US005** | *As billing staff, I want to generate invoices so that patients can receive clear payment details.* | Should-have | 3 | US002 |
| **US006** | *As a billing staff member, I want to process payments so that patients can complete transactions efficiently.* | Should-have | 4 | US005 |
| **US007** | *As an administrator, I want to manage user roles so that I can control access to system features securely.* | Should-have | 3 | None |
| **US008** | *As an administrator, I want to generate reports so that I can analyze hospital operations and financials.* | Could-have | 2 | US007 |
| **US009** | *As an insurance provider, I want to process insurance claims so that patients can receive coverage for their medical expenses.* | Could-have | 4 | US006 |
| **US010** | *As a system admin, I want all patient data encrypted with AES-256 so that security compliance is met.* | Must-have | 5 | None |
| **US011** | *As a patient, I want to receive appointment reminders via email/SMS so that I don’t miss my medical appointments.* | Could-have | 2 | US002 |

---

### Justification for Prioritization
- **Must-have** stories are critical for core functionality and align with stakeholder success metrics (e.g., usability, security, compliance). These features ensure the system is usable and secure from the beginning.
- **Should-have** stories enhance efficiency and hospital operations but are not immediately required for system functionality.
- **Could-have** stories provide additional benefits but can be implemented later without disrupting core operations.
- **Won’t-have** features (not listed) are intentionally deprioritized for this release cycle.

---

## 2️⃣ Sprint Planning

### Sprint Goal (2-Week Sprint)
**Goal:** Implement core patient registration, appointment booking, and medical record functionality.

This sprint focuses on enabling patients to register, book appointments, and allowing doctors to manage medical records, forming the foundation of the Hospital Information Management System (HIMS). 

---

### Sprint Backlog Table

| **Task ID** | **Task Description** | **Assigned To** | **Estimated Hours** | **Status** |
|------------|----------------------|----------------|-----------------|------------|
| **T-001** | Develop patient registration module | Dev Team | 8 | To Do |
| **T-002** | Design UI for patient registration | UI/UX Team | 6 | To Do |
| **T-003** | Implement appointment booking system | Backend Team | 10 | To Do |
| **T-004** | Develop UI for appointment booking | UI/UX Team | 7 | To Do |
| **T-005** | Enable doctors to update medical records | Dev Team | 9 | To Do |
| **T-006** | Set up database for patient history retrieval | Database Team | 8 | To Do |

---

### Sprint Goal Statement
This sprint is essential for establishing the **Minimum Viable Product (MVP)** by ensuring core patient and doctor functionalities are fully implemented. By the end of the sprint, users should be able to register, book appointments, and medical staff should be able to manage patient records efficiently. This lays the groundwork for further enhancements, such as billing and reporting in future sprints.

📌 *Progress will be tracked using GitHub Projects, and tasks will move from 'To Do' → 'In Progress' → 'Done'.*
