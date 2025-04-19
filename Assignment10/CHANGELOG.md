# Changelog

## [1.0.0] - 2025-04-19
### Added
- Implemented all six creational design patterns in Java:
  - Simple Factory: `UserFactory`
  - Factory Method: `PaymentProcessor`
  - Abstract Factory: `UIFactory`
  - Builder: `PatientRecord.Builder`
  - Prototype: `DocumentCache` with `MedicalReport` and `Prescription`
  - Singleton: `DatabaseConnection`

- Created unit tests for all patterns using JUnit 5.
  - Verified correct object creation and attribute initialization.
  - Tested edge cases: invalid user input in Factory, thread-safety in Singleton.

### Fixed
- Fix #15: Thread-safe Singleton implementation for `DatabaseConnection`.

### Tooling
- Added `pom.xml` for Maven project setup
  - Includes JUnit 5 and JaCoCo plugins
- Set up code coverage reporting via JaCoCo

### Project Management
- Moved completed tasks (e.g., "Implement Singleton") to **Done** on GitHub Project Board
- Created issues for test coverage improvements and code refactoring
- Linked implementation commits to their respective issues using `Fix #` syntax

---
Project: Health Information Management System (HIMS)
Version: 1.0.0
Author: [Your Name / Team Name]
