
📊 Object State Modeling with State Transition Diagrams
This section includes UML-compliant state transition diagrams for 8 critical objects in our system. Each diagram is followed by a markdown explanation highlighting key states, 
transitions, and their alignment with the functional requirements.

stateDiagram-v2
    [*] --> Available
    Available --> CheckedOut : User checks out
    CheckedOut --> Returned : User returns book
    Returned --> Available
    CheckedOut --> Overdue : Due date passes
    Overdue --> Returned : Book returned
