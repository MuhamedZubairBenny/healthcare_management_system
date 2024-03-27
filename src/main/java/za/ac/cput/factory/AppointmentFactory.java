package za.ac.cput.factory;
//Author: Mikaeel Davids - 222590955
import za.ac.cput.domain.Appointment;
import za.ac.cput.util.Helper;

import java.util.Date;

public class AppointmentFactory {
    public static Appointment buildAppointment(String appointmentId, String patientId, String doctorId, String appointmentDate,
                                               String appointmentDuration){
        if(Helper.isNullOrEmpty(appointmentId) || Helper.isNullOrEmpty(patientId) || Helper.isNullOrEmpty(doctorId)
                || Helper.isNullOrEmpty(appointmentDate) || Helper.isNullOrEmpty(appointmentDuration))
            return null;

        return new Appointment.Builder().setAppointmentId(appointmentId).setPatientId(patientId).setDoctorId(doctorId)
                .setAppointmentDate(appointmentDate).setAppointmentDuration(appointmentDuration).build();
    }

    public static Appointment buildAppointment(String patientId, String doctorId, String appointmentDate,
                                               String appointmentDuration){
        if( Helper.isNullOrEmpty(patientId) || Helper.isNullOrEmpty(doctorId)
                || Helper.isNullOrEmpty(appointmentDate) || Helper.isNullOrEmpty(appointmentDuration))
            return null;
        String appointmentId = Helper.generateId();

        return new Appointment.Builder().setAppointmentId(appointmentId).setPatientId(patientId).setDoctorId(doctorId)
                .setAppointmentDate(appointmentDate).setAppointmentDuration(appointmentDuration).build();
    }
}
