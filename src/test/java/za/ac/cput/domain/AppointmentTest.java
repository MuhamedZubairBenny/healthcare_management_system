package za.ac.cput.domain;

// Author: Muhamed Zubair Benny - 220527636

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class AppointmentTest {
    private Appointment appointment1;
    private Appointment appointment2;
    private Appointment appointment3;

    @BeforeEach
    void setUp() {
        appointment1 = new Appointment("135928", "246801", "135678", "09/02/2024", "30 minutes");
        appointment2 = new Appointment("185436", "123456", "254367", "10/02/2024", "1 hour");
        appointment3 = appointment1;
    }

    @Test
    @Order(1)
    void testObjectEquality() {
        assertEquals(appointment1, appointment3);
        System.out.println("Equality Test has successful passed");

    }

    @Test
    @Order(2)
    void testObjectIdentity() {
        assertEquals(appointment1, appointment3);
        System.out.println("Identity Test has successful passed");
    }

    @Test
    @Order(3)
    void testFailingTest() {
        assertSame(appointment1, appointment3);
    }

    @Test
    @Disabled
    @Order(4)
    void testGetPatientId() {
        assertSame(appointment1, appointment3);
    }

    @Test
    @Order(5)
    @Timeout(1)
    void testFailedAfterOneSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }
}
