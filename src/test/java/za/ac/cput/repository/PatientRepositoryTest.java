package za.ac.cput.repository;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Patient;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.factory.PatientFactory;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class PatientRepositoryTest {

    private static IPatientRepository patientRepository = PatientRepository.getRepository();
    private Patient patient = PatientFactory.buildPatient("31ST57","Bob","Male",40,"0651361532");

    @Test
    @Order(1)
    void create() {
        Patient created = patientRepository.create(patient);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        String patientID = "31ST57";
        Patient read = patientRepository.read(patientID);
        assertEquals(read, patient);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Patient updated = patientRepository.update(new Patient.Builder().copy(patient).setName("Bob Lee").build());
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(patientRepository.getall());
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(patientRepository.delete(patient.getPatientID()));
        System.out.println("Success: Deleted patient");
    }
}
