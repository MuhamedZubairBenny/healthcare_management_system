package za.ac.cput.repository;

import za.ac.cput.domain.Appointment;

import java.util.ArrayList;
import java.util.List;

public class AppointmentRepository implements IAppointmentRepository {
    private static IAppointmentRepository repository = null;
    private List<Appointment> appointmentList;
    private AppointmentRepository(){appointmentList = new ArrayList<Appointment>();}
    public static IAppointmentRepository getRepository(){
        if (repository == null){
            repository = new AppointmentRepository();
        }
        return repository;
    }
    @Override
    public Appointment create(Appointment appointment){
        boolean success = appointmentList.add(appointment);
        if(success)
            return appointment;
        return null;
    }
    @Override
    public Appointment read(String id) {
        for (Appointment a : appointmentList){
            if (a.getAppointmentId().equals(id))
                return a;
        }
        return null;
    }

    @Override
    public Appointment update(Appointment appointment) {
        Appointment doctorOld = read(appointment.getAppointmentId());

        boolean success = appointmentList.remove(doctorOld);
        if(success){
            if(appointmentList.add(appointment))
                return appointment;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Appointment appointmentToDelete = read(id);
        boolean success = appointmentList.remove(appointmentToDelete);
        return success;
    }

    @Override
    public List<Appointment> getAll() {
        return appointmentList;
    }
}
