/*
Directory: /tests/
This file includes JUnit tests for all six creational patterns in the HIMS project.
*/

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CreationalPatternsTest {

    // 1. Simple Factory
    @Test
    public void testUserFactoryDoctorCreation() {
        User user = UserFactory.createUser("doctor");
        assertTrue(user instanceof Doctor);
    }

    @Test
    public void testUserFactoryInvalidType() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            UserFactory.createUser("unknown");
        });
        assertEquals("Unknown user type", exception.getMessage());
    }

    // 2. Factory Method
    @Test
    public void testPaymentProcessorCash() {
        PaymentProcessor processor = new CashPaymentProcessor();
        assertNotNull(processor);
    }

    // 3. Abstract Factory
    @Test
    public void testWebUIFactoryComponents() {
        UIFactory factory = new WebUIFactory();
        Button button = factory.createButton();
        Textbox textbox = factory.createTextbox();
        assertTrue(button instanceof WebButton);
        assertTrue(textbox instanceof WebTextbox);
    }

    @Test
    public void testDesktopUIFactoryComponents() {
        UIFactory factory = new DesktopUIFactory();
        Button button = factory.createButton();
        Textbox textbox = factory.createTextbox();
        assertTrue(button instanceof DesktopButton);
        assertTrue(textbox instanceof DesktopTextbox);
    }

    // 4. Builder Pattern
    @Test
    public void testPatientRecordBuilder() {
        PatientRecord record = new PatientRecord.Builder()
                .setName("Alice")
                .setAge(30)
                .setAllergies("None")
                .setChronicIllnesses("Asthma")
                .build();

        assertEquals("Alice", record.name);
        assertEquals(30, record.age);
        assertEquals("None", record.allergies);
        assertEquals("Asthma", record.chronicIllnesses);
    }

    // 5. Prototype Pattern
    @Test
    public void testMedicalReportClone() {
        MedicalReport original = new MedicalReport("Sample Report");
        MedicalReport clone = (MedicalReport) original.clone();
        assertNotSame(original, clone);
        assertEquals("Sample Report", clone.toString().contains("Sample Report") ? "Sample Report" : "");
    }

    // 6. Singleton Pattern
    @Test
    public void testSingletonInstance() {
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        assertSame(db1, db2);
    }

    @Test
    public void testSingletonThreadSafety() throws InterruptedException {
        final DatabaseConnection[] connections = new DatabaseConnection[2];

        Thread t1 = new Thread(() -> connections[0] = DatabaseConnection.getInstance());
        Thread t2 = new Thread(() -> connections[1] = DatabaseConnection.getInstance());

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        assertSame(connections[0], connections[1]);
    }
}
