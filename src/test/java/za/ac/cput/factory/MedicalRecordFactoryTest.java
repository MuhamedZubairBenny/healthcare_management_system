package za.ac.cput.factory;
// Author: Isa Hassan - 222043555

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.MedicalRecord;

import static org.junit.jupiter.api.Assertions.*;

class MedicalRecordFactoryTest {

    @Test
    void buildMedicalRecord() {
        MedicalRecord e = MedicalRecordFactory.buildMedicalRecord("001", "31ST57","8543653","14/02/2024","Fever","Ibuprofen");
                assertNotNull(e);
        System.out.println(e.toString());
    }

    @Test
    void testBuildMedicalRecord() {
        MedicalRecord e = MedicalRecordFactory.buildMedicalRecord("", "31ST57","8543653","14/02/2024","Fever","Ibuprofen");
        assertNotNull(e);
        System.out.println(e.toString());
    }
    }
