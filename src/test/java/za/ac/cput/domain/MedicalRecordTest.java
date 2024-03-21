package za.ac.cput.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class MedicalRecordTest {
    private MedicalRecord medicalRecord1;
    private MedicalRecord medicalRecord2;
    private MedicalRecord medicalRecord3;

    @BeforeEach
    void setUp(){
        medicalRecord1 = new MedicalRecord("001", "31ST57","8543653","14/02/2024","Fever","Ibuprofen");
                medicalRecord2 = new MedicalRecord("002", "53BN94","4562357", "10/01/2024", "Diarrhea", "Loperamide");
    medicalRecord3 = medicalRecord1;
    }

    @Test
    @Order(1)
    void testObjectEquality() {
        assertEquals(medicalRecord1,  medicalRecord2);
        System.out.println("Equality Test has successful passed");

    }
    @Test
    @Order(2)
    void testObjectIdentity(){
        assertEquals( medicalRecord1,  medicalRecord3);
        System.out.println("Identity Test has successful passed");
    }

    @Test
    @Order(3)
    void testFailingTest(){
        assertSame( medicalRecord1,  medicalRecord3);
    }
    @Test
    @Disabled
    @Order(4)
    void testGetRecordId(){assertSame( medicalRecord1,  medicalRecord2);
    }
    @Test
    @Order(5)
    @Timeout(1)
    void testFailedAfterOneSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }
}