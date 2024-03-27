package za.ac.cput.factory;
//Author: Duane Prins - 222706333

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Patient;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class PatientFactoryTest {

    @Test
    @Order(1)
    void buildPatient() {
        Patient p = PatientFactory.buildPatient("221055838","Ryan Reynolds", "Male", 35,"0651361532");
        assertNotNull(p);
        System.out.println(p.toString());
    }

    @Test
    @Order(2)
    void testBuildPatientWithFail() {
        Patient p = PatientFactory.buildPatient("","Ryan Reynolds", "Male", 35, "0651361532");
        assertNotNull(p);
        System.out.println(p.toString());
    }
}
