package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Doctor;
import za.ac.cput.factory.DoctorFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class DoctorRepositoryTest {
    private static IDoctorRepository repository = DoctorRepository.getRepository();
    private Doctor doctor = DoctorFactory.buildDoctor("229599010", "Zubair", "Benny", "021 652 9235", "zbenny@yahoo.org", "General Practitioner");

    @Test
    @Order(1)
    void create() {
        Doctor created = repository.create(doctor);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        String doctorId = "229599010";
        Doctor read = repository.read(doctorId);
        assertEquals(read, doctor);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Doctor updated = repository.update(new Doctor.Builder().copy(doctor).setDoctorFirstName("Muhamed Zubair").build());
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(doctor.getDoctorId()));
        System.out.println("Success: Deleted doctor");
    }
}