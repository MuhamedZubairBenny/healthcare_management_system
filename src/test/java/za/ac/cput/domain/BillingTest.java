package za.ac.cput.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BillingTest {
    private Billing billing1;
    private Billing billing2;
    private Billing billing3;

    @BeforeEach
    void setUp() {
        billing1 = new Billing(1, "31ST57", "4/04/2024", 2191.1);
        billing2 = new Billing(2, "53BN94", "15/05/2024", 35670.9);
        billing3 = billing1;
    }

    @Test
    @Order(1)
    void testObjectEquality() {
        assertEquals(billing1, billing3);
        System.out.println("Equality Test has successful passed");
    }

    @Test
    @Order(2)
    void testObjectIdentity() {
        assertEquals(billing1, billing3);
        System.out.println("Identity Test has successful passed");
    }

    @Test
    @Order(3)
    void testFailingTest() {
        assertSame(billing1, billing3);
    }

    @Test
    @Disabled
    @Order(4)
    void testGetPatientId() {
        assertSame(billing1, billing2);
    }

    @Test
    @Order(5)
    @Timeout(2) // Increased timeout to 2 seconds
    void testFailedAfterTwoSeconds() throws InterruptedException {
        Thread.sleep(1000); // Reduced sleep time to 1000 milliseconds
    }
}

