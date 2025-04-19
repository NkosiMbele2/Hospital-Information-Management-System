```java
// All patterns implemented together
import java.util.HashMap;
import java.util.Map;

// 1. Simple Factory Pattern
class UserFactory {
    public static User createUser(String type) {
        return switch (type.toLowerCase()) {
            case "doctor" -> new Doctor();
            case "nurse" -> new Nurse();
            case "admin" -> new Admin();
            default -> throw new IllegalArgumentException("Unknown user type");
        };
    }
}

interface User {
    void accessSystem();
}

class Doctor implements User {
    public void accessSystem() {
        System.out.println("Doctor accessing patient records.");
    }
}

class Nurse implements User {
    public void accessSystem() {
        System.out.println("Nurse accessing medication schedules.");
    }
}

class Admin implements User {
    public void accessSystem() {
        System.out.println("Admin managing user accounts.");
    }
}

// 2. Factory Method Pattern
interface PaymentProcessor {
    void processPayment(double amount);
}

class InsurancePaymentProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing insurance payment of R" + amount);
    }
}

class CashPaymentProcessor implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Processing cash payment of R" + amount);
    }
}

// 3. Abstract Factory Pattern
interface UIFactory {
    Button createButton();
    Textbox createTextbox();
}

interface Button {
    void render();
}

interface Textbox {
    void render();
}

class WebUIFactory implements UIFactory {
    public Button createButton() {
        return new WebButton();
    }

    public Textbox createTextbox() {
        return new WebTextbox();
    }
}

class DesktopUIFactory implements UIFactory {
    public Button createButton() {
        return new DesktopButton();
    }

    public Textbox createTextbox() {
        return new DesktopTextbox();
    }
}

class WebButton implements Button {
    public void render() {
        System.out.println("Rendering Web Button");
    }
}

class WebTextbox implements Textbox {
    public void render() {
        System.out.println("Rendering Web Textbox");
    }
}

class DesktopButton implements Button {
    public void render() {
        System.out.println("Rendering Desktop Button");
    }
}

class DesktopTextbox implements Textbox {
    public void render() {
        System.out.println("Rendering Desktop Textbox");
    }
}

// 4. Builder Pattern
class PatientRecord {
    String name;
    int age;
    String allergies;
    String chronicIllnesses;

    public String toString() {
        return name + ", Age: " + age + ", Allergies: " + allergies + ", Chronic: " + chronicIllnesses;
    }

    public static class Builder {
        private final PatientRecord record = new PatientRecord();

        public Builder setName(String name) {
            record.name = name;
            return this;
        }

        public Builder setAge(int age) {
            record.age = age;
            return this;
        }

        public Builder setAllergies(String allergies) {
            record.allergies = allergies;
            return this;
        }

        public Builder setChronicIllnesses(String illnesses) {
            record.chronicIllnesses = illnesses;
            return this;
        }

        public PatientRecord build() {
            return record;
        }
    }
}

// 5. Prototype Pattern
interface Document extends Cloneable {
    Document clone();
    void print();
}

class MedicalReport implements Document {
    private String content;

    public MedicalReport(String content) {
        this.content = content;
    }

    public Document clone() {
        return new MedicalReport(this.content);
    }

    public void print() {
        System.out.println("Medical Report: " + content);
    }
}

class Prescription implements Document {
    private String content;

    public Prescription(String content) {
        this.content = content;
    }

    public Document clone() {
        return new Prescription(this.content);
    }

    public void print() {
        System.out.println("Prescription: " + content);
    }
}

class DocumentCache {
    private static final Map<String, Document> cache = new HashMap<>();

    static {
        cache.put("report", new MedicalReport("Initial Diagnosis Report"));
        cache.put("prescription", new Prescription("Default Prescription"));
    }

    public static Document getDocument(String type) {
        return cache.get(type).clone();
    }
}

// 6. Singleton Pattern
class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Connected to the database.");
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void query(String sql) {
        System.out.println("Executing query: " + sql);
    }
}

// Test class
public class Main {
    public static void main(String[] args) {
        // Simple Factory
        User doctor = UserFactory.createUser("doctor");
        doctor.accessSystem();

        // Factory Method
        PaymentProcessor processor = new InsurancePaymentProcessor();
        processor.processPayment(1500);

        // Abstract Factory
        UIFactory factory = new WebUIFactory();
        factory.createButton().render();
        factory.createTextbox().render();

        // Builder
        PatientRecord record = new PatientRecord.Builder()
            .setName("John Doe")
            .setAge(40)
            .setAllergies("Peanuts")
            .setChronicIllnesses("Diabetes")
            .build();
        System.out.println(record);

        // Prototype
        Document report = DocumentCache.getDocument("report");
        report.print();

        // Singleton
        DatabaseConnection conn = DatabaseConnection.getInstance();
        conn.query("SELECT * FROM patients");
    }
}

```
