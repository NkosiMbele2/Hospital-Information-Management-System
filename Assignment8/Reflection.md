##  Reflection

### 🔍 Challenges in Choosing Granularity
One of the key challenges was **deciding the level of detail** to include in both state and activity diagrams. Too much detail risked overwhelming the reader and making diagrams unreadable, while too little might have missed critical transitions or steps.

- **State Diagrams**: We had to strike a balance between including every possible object state (e.g., "Reserved", "Overdue", "Lost") and maintaining a clear behavioral model.
- **Activity Diagrams**: The workflows could easily become cluttered with too many actions. We grouped smaller steps under higher-level actions (e.g., “Validate Form” instead of listing each field check) for clarity.

### 🔄 Aligning Diagrams with Agile User Stories
Aligning diagrams to Agile user stories required careful mapping:
- **User stories often focus on outcomes**, while diagrams show system behavior or task flows.
- We used **acceptance criteria** and sprint tasks as bridges to ensure each diagram reflected actual user requirements and developer responsibilities.

For example:
- User Story: *"As a student, I want to borrow a book..."* was traced to both:
  - An **activity diagram** for "Book Checkout".
  - A **state diagram** for "Book" showing transitions like "Available" → "Checked Out".

### ⚖️ Comparing State vs Activity Diagrams
| Aspect               | State Diagrams                                | Activity Diagrams                             |
|----------------------|-----------------------------------------------|-----------------------------------------------|
| Focus                | Object lifecycle / internal behavior          | Business process / task sequences             |
| Good for             | Tracking system status over time              | Mapping out complex workflows                 |
| Viewpoint            | Event-driven changes in state                 | Flow of control with decisions & concurrency  |
| Example              | Book → Reserved → Checked Out → Returned      | Borrow book → Check availability → Confirm    |


