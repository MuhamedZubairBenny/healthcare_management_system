package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;

import java.util.List;

public interface IAppointmentRepository extends IRepository<Appointment,String> {
    List<Appointment> getAll();
}
