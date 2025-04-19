## 🧪 Class Implementation

The `/src` folder contains the Python class implementations based on our class diagram. We chose **JAVA** for its simplicity and readability, which aligns well with rapid prototyping in Agile workflows.

### 🔧 Design Decisions
- Used private attributes and added getters/setters to enforce encapsulation.
- Avoided inheritance for `Doctor` and `Patient` to keep responsibilities distinct.
- Modeled composition (e.g., Invoice → Payment) through method-level associations.
- Methods mirror those in the UML class diagram and support core user stories.

---
# Creational Patterns in HIMS

## Simple Factory
Used `UserFactory` to create instances of `Doctor`, `Nurse`, and `Admin` based on input. Centralizes role creation logic.

## Factory Method
Implemented `PaymentProcessor` interface with `InsurancePaymentProcessor` and `CashPaymentProcessor` for flexible billing strategies.

## Abstract Factory
`UIFactory` provides GUI elements like `Button` and `Textbox` across different platforms (Web and Desktop).

## Builder
Used `PatientRecord.Builder` to construct patient records with optional fields like allergies and chronic illnesses.

## Prototype
`DocumentCache` stores and clones standard `MedicalReport` and `Prescription` templates to reduce object setup cost.

## Singleton
`DatabaseConnection` ensures only one DB connection exists throughout the system to maintain consistency.


