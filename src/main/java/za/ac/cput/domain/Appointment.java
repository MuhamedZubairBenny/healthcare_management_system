package za.ac.cput.domain;
// Author: Mikaeel Davids - 222590955

import java.util.Objects;

public class Appointment {
    public String appointmentId;
    private String patientId;
    private String doctorId;
    private String appointmentDate;
    private String appointmentDuration;
    public Appointment(){

    }

    public Appointment(String appointmentId, String patientId, String doctorId, String appointmentDate,
                       String appointmentDuration){

    }
        private Appointment(Builder builder){
        this.appointmentId = builder.appointmentId;
        this.patientId = builder.patientId;
        this.doctorId = builder.doctorId;
        this.appointmentDate = builder.appointmentDate;
        this.appointmentDuration = builder.appointmentDuration;
    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public String getAppointmentDuration() {
        return appointmentDuration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Appointment that)) return false;
        return getAppointmentDuration() == that.getAppointmentDuration() && Objects.equals(getAppointmentId(), that.getAppointmentId()) && Objects.equals(getPatientId(), that.getPatientId()) && Objects.equals(getDoctorId(), that.getDoctorId()) && Objects.equals(getAppointmentDate(), that.getAppointmentDate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAppointmentId(), getPatientId(), getDoctorId(), getAppointmentDate(), getAppointmentDuration());
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "appointmentId='" + appointmentId + '\'' +
                ", patientId='" + patientId + '\'' +
                ", doctorId='" + doctorId + '\'' +
                ", appointmentDate=" + appointmentDate +
                ", appointmentDuration=" + appointmentDuration +
                '}';
    }

    public static class Builder{
        public String appointmentId;
        public String patientId;
        public String doctorId;
        public String appointmentDate;
        public String appointmentDuration;

        public Builder setAppointmentId(String appointmentId) {
            this.appointmentId = appointmentId;
            return this;
        }

        public Builder setPatientId(String patientId) {
            this.patientId = patientId;
            return this;
        }

        public Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setAppointmentDate(String appointmentDate) {
            this.appointmentDate = appointmentDate;
            return this;
        }

        public Builder setAppointmentDuration(String appointmentDuration) {
            this.appointmentDuration = appointmentDuration;
            return this;
        }

        public Builder copy(Appointment appointment){
            this.appointmentId = appointment.appointmentId;
            this.patientId = appointment.patientId;
            this.doctorId = appointment.doctorId;
            this.appointmentDate = appointment.appointmentDate;
            this.appointmentDuration = appointment.appointmentDuration;
            return this;
        }
        public Appointment build(){
            return new Appointment(this);
        }
    }
}
