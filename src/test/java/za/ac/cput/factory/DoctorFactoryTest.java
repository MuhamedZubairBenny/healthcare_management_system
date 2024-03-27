package za.ac.cput.factory;

// Author: Muhamed Zubair Benny - 220527636

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Doctor;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DoctorFactoryTest {

    @Test
    @Order(1)
    void buildDoctor() {
        Doctor d = DoctorFactory.buildDoctor("8527351", "Theodore", "Martin", "021 959 6777", "tmartin@facewam.com" ,"General Practitioner");
        assertNotNull(d);
        System.out.println(d.toString());
    }

    @Test
    @Order(2)
    void testBuildDoctorWithFail() {
        Doctor d = DoctorFactory.buildDoctor("","Theodore", "Martin", "021 959 6777", "tmartin@facewam.com" ,"General Practitioner");
        assertNotNull(d);
        System.out.println(d.toString());
    }
}