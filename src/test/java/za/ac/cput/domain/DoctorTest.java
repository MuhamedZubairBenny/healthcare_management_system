package za.ac.cput.domain;

// Author: Muhamed Zubair Benny - 220527636

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {
    private Doctor doctor1;
    private Doctor doctor2;
    private Doctor doctor3;

    @BeforeEach
    void setUp() {
        doctor1 = new Doctor("135928", "Zubair", "Benny", "021 911 2250", "zbenny@supermail.com", "General Practitioner");
        doctor2 = new Doctor("185436", "Jack", "Swagger", "021 986 2156", "jswagger@supermail.com", "Cardiologist");
        doctor3 = doctor1;
    }

    @Test
    @Order(1)
    void testObjectEquality() {
        assertEquals(doctor1, doctor3);
        System.out.println("Equality Test has successful passed");

    }

    @Test
    @Order(2)
    void testObjectIdentity() {
        assertEquals(doctor1, doctor3);
        System.out.println("Identity Test has successful passed");
    }

    @Test
    @Order(3)
    void testFailingTest() {
        assertSame(doctor1, doctor3);
    }

    @Test
    @Disabled
    @Order(4)
    void testGetPatientId() {
        assertSame(doctor1, doctor2);
    }

    @Test
    @Order(5)
    @Timeout(1)
    void testFailedAfterOneSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }
}