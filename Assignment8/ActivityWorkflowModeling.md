
# 🌀 Activity Workflow Modeling with Activity Diagrams

This section illustrates 8 complex workflows from the system using UML activity diagrams in Mermaid format. Each includes swimlanes, decision nodes, and parallel actions, with markdown explanations.

---

## 1️⃣ User Registration

```mermaid
%%{init: {'theme':'default'}}%%
flowchart TD
    UserStart([Start]) --> U1["Fill Registration Form"]
    U1 --> U2["Submit Form"]
    U2 -->|Valid Input| U3["Create User Account"]
    U2 -->|Invalid Input| U4["Show Error Message"]
    U3 --> U5["Send Verification Email"]
    U5 --> UserEnd([End])
```

**Explanation:** This diagram represents the user registration process. It ensures input validation and email confirmation — addressing stakeholder concern for secure onboarding.

---

## 2️⃣ Book Checkout

```mermaid
flowchart TD
    A1([Start]) --> B1["User scans book"]
    B1 --> B2["Check availability"]
    B2 -->|Available| B3["Record checkout"]
    B2 -->|Not Available| B4["Show unavailable notice"]
    B3 --> B5["Update inventory"]
    B5 --> A2([End])
```

**Explanation:** This workflow covers book checkout. Inventory update ensures stock reflects real-time borrowing — a key librarian requirement.

---

## 3️⃣ Process Return

```mermaid
flowchart TD
    R1([Start]) --> R2["User returns book"]
    R2 --> R3["Check for overdue"]
    R3 -->|Overdue| R4["Apply fine"]
    R3 -->|On time| R5["No fine"]
    R4 --> R6["Mark as returned"]
    R5 --> R6
    R6 --> R7["Update inventory"]
    R7 --> R8([End])
```

**Explanation:** This ensures overdue fines are handled accurately, meeting the admin's billing policies.

---

## 4️⃣ Appointment Scheduling

```mermaid
flowchart TD
    S1([Start]) --> S2["User selects time"]
    S2 --> S3["Check availability"]
    S3 -->|Available| S4["Confirm Appointment"]
    S3 -->|Not Available| S5["Prompt to choose another slot"]
    S4 --> S6(["Send confirmation email"])
    S6 --> S7([End])
```

**Explanation:** Ensures users cannot double-book appointments — critical for resource management.

---

## 5️⃣ Payment Workflow

```mermaid
flowchart TD
    P1([Start]) --> P2["Enter payment details"]
    P2 --> P3["Submit payment"]
    P3 -->|Valid| P4["Process transaction"]
    P3 -->|Invalid| P5["Show error"]
    P4 --> P6["Generate receipt"]
    P6 --> P7([End])
```

**Explanation:** Guarantees user is notified of success/failure, crucial for financial transparency.

---

## 6️⃣ Account Suspension & Reactivation

```mermaid
flowchart TD
    A1([Start]) --> A2["Admin selects user"]
    A2 --> A3["Choose suspend/reactivate"]
    A3 -->|Suspend| A4["Mark account as suspended"]
    A3 -->|Reactivate| A5["Restore user access"]
    A4 --> A6([End])
    A5 --> A6
```

**Explanation:** Provides admin control over account status, addressing risk and moderation concerns.

---

## 7️⃣ Insurance Claim Review

```mermaid
flowchart TD
    IC1([Start]) --> IC2["Submit claim"]
    IC2 --> IC3["System checks documents"]
    IC3 -->|Valid| IC4["Assign to admin"]
    IC3 -->|Invalid| IC5["Notify user to revise"]
    IC4 --> IC6["Admin reviews claim"]
    IC6 -->|Approve| IC7["Send payout"]
    IC6 -->|Reject| IC8["Notify rejection"]
    IC7 --> IC9([End])
    IC8 --> IC9
```

**Explanation:** Efficiently splits claim handling between system and admin to reduce processing time.

---

## 8️⃣ Medical Record Update

```mermaid
flowchart TD
    M1([Start]) --> M2["Doctor accesses record"]
    M2 --> M3["Enter diagnosis"]
    M3 --> M4["Add medication info"]
    M4 --> M5["Submit updates"]
    M5 --> M6(["Notify patient"])
    M6 --> M7([End])
```

**Explanation:** Ensures timely patient communication and proper history tracking for future care quality.

---
  🔙 [Back to Main Menu](./README.md)
