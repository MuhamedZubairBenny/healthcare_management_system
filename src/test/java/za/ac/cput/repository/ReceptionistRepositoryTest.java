package za.ac.cput.repository;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Doctor;
import za.ac.cput.domain.Receptionist;
import za.ac.cput.factory.ReceptionistFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ReceptionistRepositoryTest {
    private static IReceptionistRepository repository = ReceptionistRepository.getRepository();
    private Receptionist receptionist = ReceptionistFactory.buildReceptionist("02365","Regina", "Philange", "0216354965", "regina@reception.co.za");

    @Test
    @Order(1)
    void create() {
        Receptionist created = repository.create(receptionist);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        String receptionistID = "02365";
        Receptionist read = repository.read(receptionistID);
        assertEquals(read, receptionist);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update(){
        Receptionist updated = repository.update(new Receptionist.Builder().copy(receptionist).setReceptionistName("Imaan").build());
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
        assertTrue(repository.delete(receptionist.getReceptionistID()));
        System.out.println("Success: Receptionist doctor");
    }
}