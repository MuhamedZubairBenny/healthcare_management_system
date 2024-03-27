package za.ac.cput.factory;

// Author: Muhamed Zubair Benny - 220527636

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Appointment;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AppointmentFactoryTest {
    @Test
    @Order(1)
    void buildAppointment() {
        Appointment a = AppointmentFactory.buildAppointment("135928", "246801", "135678",
                "09/02/2024", "30 minutes");
        assertNotNull(a);
        System.out.println(a.toString());
    }

    @Test
    @Order(2)
    void testBuildDoctorWithFail() {
        Appointment a = AppointmentFactory.buildAppointment("", "246801", "135678",
                "09/02/2024", "30 minutes");
        assertNotNull(a);
        System.out.println(a.toString());
    }
}
