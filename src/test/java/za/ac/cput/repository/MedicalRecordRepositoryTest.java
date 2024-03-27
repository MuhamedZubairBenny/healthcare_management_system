package za.ac.cput.repository;
// Author: Isa Hassan - 222043555

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.factory.MedicalRecordFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class MedicalRecordRepositoryTest {
    private static IMedicalRecordRepository repository = MedicalRecordRepository.getRepository();
    private MedicalRecord medicalRecord = MedicalRecordFactory.buildMedicalRecord("001", "31ST57","8543653","14/02/2024","Fever","Ibuprofen");


    @Test
    void getRepository() {
    }

    @Test
    @Order(1)
    void create() {
        MedicalRecord created = repository.create(medicalRecord);
        assertNotNull(created);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        String recordID = "001";
        MedicalRecord read = repository.read(recordID);
        assertEquals(read, medicalRecord);
        System.out.println(read);
    }


    @Test
    @Order(3)
    void update() {
        MedicalRecord updated = repository.update(new MedicalRecord.Builder().copy(medicalRecord).setTreatment("paracetamol").build());
        assertNotNull(updated);
        System.out.println(updated);
    }
    @Test
    @Order(5)
    void delete() {
       assertTrue(repository.delete(medicalRecord.getRecordID()));
        System.out.println("Medical Record has been successfully deleted");
    }

    @Test
    @Order(4)
    void getAll() {
        System.out.println(repository.getAll());
    }
}