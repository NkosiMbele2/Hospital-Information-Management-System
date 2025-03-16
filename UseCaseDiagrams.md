%% Hospital Information Management System Use Case Diagram
usecaseDiagram
    actor Patient as P
    actor Doctor as D
    actor Nurse as N
    actor BillingStaff as BS
    actor Administrator as Admin
    actor InsuranceProvider as IP
    
    P --> (Register Patient)
    P --> (Book Appointment)
    P --> (Make Payment)
    
    D --> (Update Medical Records)
    D --> (View Patient History)
    
    N --> (View Patient History)
    
    BS --> (Generate Invoice)
    BS --> (Process Payment)
    
    Admin --> (Manage User Roles)
    Admin --> (Generate Reports)
    
    IP --> (Process Insurance Claims)

    %% Relationships between use cases
    (Register Patient) --> (Book Appointment) : includes
    (Process Payment) --> (Generate Invoice) : includes
    (Generate Reports) --> (View Patient History) : includes
