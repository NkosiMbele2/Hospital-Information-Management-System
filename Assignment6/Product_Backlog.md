# Product Backlog

## Hospital Information Management System (HIMS)

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

📌 *This backlog will be continuously refined based on stakeholder feedback and development progress.*
