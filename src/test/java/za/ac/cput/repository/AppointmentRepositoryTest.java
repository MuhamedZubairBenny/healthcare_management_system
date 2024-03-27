package za.ac.cput.repository;
//Author: Mikaeel Davids - 222590955

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Appointment;
import za.ac.cput.factory.AppointmentFactory;

import static org.junit.jupiter.api.Assertions.*;

public class AppointmentRepositoryTest {
    private static IAppointmentRepository repository = AppointmentRepository.getRepository();
    private Appointment appointment = AppointmentFactory.buildAppointment("135928", "246801", "135678", "09/02/2024", "30 minutes");

    @Test
    @Order(1)
    void create() {
        Appointment created = repository.create(appointment);
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        String appointmentId = "135928";
        Appointment read = repository.read(appointmentId);
        assertEquals(read, appointment);
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Appointment updated = repository.update(new Appointment.Builder().copy(appointment).setPatientId("246801").build());
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
        assertTrue(repository.delete(appointment.getDoctorId()));
        System.out.println("Success: Deleted doctor");
    }
}
