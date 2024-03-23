package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ReceptionistTest {
    private Receptionist receptionist1;
    private Receptionist receptionist2;
    private Receptionist receptionist3;

    @BeforeEach
    void setUp(){
        receptionist1 = new Receptionist("16945", "Imaan", "Sadien", "021705283", "imaan@reception.co.za");
        receptionist2 = new Receptionist("18597", "Sam", "James", "0216547852", "sam@reception.co.za");
        receptionist3 = receptionist1;

    }
    @Test
    @Order(1)
    void testObjectEquality() {
        assertEquals(receptionist1, receptionist3);
        System.out.println("Equality test passed");
    }

    @Test
    @Order(2)
    void testObjectIdentity() {
        assertEquals(receptionist1, receptionist3);
        System.out.println("Identity test passed");
    }

    @Test
    @Order(3)
    void testFailingTest() {
        assertSame(receptionist1, receptionist3);
    }

    @Test
    @Disabled
    @Order(4)
    void getReceptionistID() {
        assertSame(receptionist1, receptionist2);
    }

    @Test
    @Order(5)
    @Timeout(1)
    void testFailedAfterOneSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }

}
