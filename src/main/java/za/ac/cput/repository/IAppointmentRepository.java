package za.ac.cput.repository;
//Author: Mikaeel Davids - 222590955
import za.ac.cput.domain.Appointment;

import java.util.List;

public interface IAppointmentRepository extends IRepository<Appointment,String> {
    List<Appointment> getAll();
}
