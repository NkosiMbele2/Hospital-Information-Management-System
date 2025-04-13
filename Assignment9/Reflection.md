##  Reflection 

### 🔍 Challenges in Choosing Granularity
Designing the **domain model** and **class diagram** for the Hospital Information Management System (HIMS) 
presented a valuable learning experience in understanding and applying object-oriented design principles within a real-world context. 
While the foundational structure was supported by prior work—including use cases, functional requirements, and behavioral models—translating 
these into an abstract yet functional representation posed several key challenges and decisions.


### 1️⃣ Challenges Faced
One of the primary challenges encountered was determining the right level of abstraction for domain entities. In a healthcare system, many components are tightly integrated, making it difficult to draw clean boundaries between objects. For example, should an appointment be treated as a standalone entity or as a behavior linked directly to both patient and doctor classes? Initially, this led to overcomplicating relationships, with too many bidirectional associations that cluttered the class diagram and made it hard to interpret.

Defining relationships also proved tricky. The distinction between composition, aggregation, and association needed careful thought. For instance, we debated whether an Invoice should be composed of a Payment or just associated with it. Eventually, we decided that since a payment exists independently of the invoice creation process (e.g., via insurance), an association better reflected reality. Similarly, defining the multiplicity of relationships required reviewing real-world processes: a doctor may have multiple appointments, but an appointment must have exactly one doctor and one patient.

Method definition was another area of struggle. It was tempting to overload classes with too many responsibilities, violating the Single Responsibility Principle. For example, in early drafts, the Patient class handled appointment logic, medical record updates, and even payment logic. We revised this to delegate actions to more appropriate classes (Appointment, MedicalRecord, and Payment respectively), thus improving cohesion and clarity.

### 2️⃣ Alignment with Previous Assignments
The class diagram aligns closely with earlier assignments:
- **From Assignment 4 (Requirements)**, we extracted clear feature sets such as appointment management, billing, and medical record handling, which became method definitions in our classes.
- **Assignment 5 (Use Cases)** outlined actors and system functions that directly influenced class responsibilities. For instance, the ability of doctors to update records and patients to manage appointments naturally became class methods.
- The **state transition diagrams (Assignment 8)** informed lifecycle elements, particularly around Invoice, Appointment, and InsuranceClaim, where status fields and transitions mapped to specific methods and class interactions.
- Finally, **activity diagrams** helped validate the flow of logic across classes. Seeing the sequence of actions ensured that class methods like submit(), validate(), and archive() were not only necessary but correctly placed.

### 3️⃣ Trade-offs Made
During the design process, we made several trade-offs:
- We **avoided using inheritance** even though there were potential use cases (e.g., a User superclass for Doctor and Patient). This decision was intentional to reduce complexity, given that the responsibilities of Doctor and Patient differ significantly.
- We also simplified some relationships to maintain diagram readability. For example, while billing may involve multiple steps (e.g., claim submission, approval, payment), we modeled it using just two classes (Invoice and InsuranceClaim) with straightforward methods.
- **Data types** were abstracted to basic types (e.g., String, Date, Double) without modeling complex value objects (e.g., Address or ContactInfo) to keep the diagram focused on structure rather than implementation details.

### 4️⃣ Lessons Learned
Through this exercise, I developed a deeper appreciation for object-oriented design (OOD) principles. I learned that:
- **Encapsulation and separation of concerns** are critical for maintainable systems.
- Diagramming is not just a technical exercise—it’s a tool for **thinking through design logic and user interactions**.
- Balancing **realism vs. simplicity** is key: while a model should reflect the real world, it must remain understandable and scalable.
- OOD is iterative. The final design is rarely the first one. It evolves through reflection, alignment with use cases, and validation against workflows.

In conclusion, this experience has solidified my understanding of system modeling in Agile development and the practical application of class design to support both technical implementation and stakeholder needs.

---
🔙 [Back to Main Menu](./Assignment9.md)


