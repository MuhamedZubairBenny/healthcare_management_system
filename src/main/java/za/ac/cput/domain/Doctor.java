package za.ac.cput.domain;

import java.util.Objects;

public class Doctor {
    public String doctorId;
    private String doctorFirstName;
    private String doctorLastName;
    private String doctorWorkNumber;
    private String doctorEmailAddress;
    private String doctorSpecialization;

    public Doctor() {
    }
    private Doctor(Builder builder){
        this.doctorId = builder.doctorId;;
        this.doctorFirstName = builder.doctorFirstName;
        this.doctorLastName = builder.doctorLastName;
        this.doctorWorkNumber = builder.doctorWorkNumber;
        this.doctorEmailAddress = builder.doctorEmailAddress;
        this.doctorSpecialization = builder.doctorSpecialization;
    }
    public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public String getDoctorWorkNumber() {
        return doctorWorkNumber;
    }

    public String getDoctorEmailAddress() {
        return doctorEmailAddress;
    }

    public String getDoctorSpecialization() {
        return doctorSpecialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(doctorId, doctor.doctorId) && Objects.equals(doctorFirstName, doctor.doctorFirstName) && Objects.equals(doctorLastName, doctor.doctorLastName) && Objects.equals(doctorWorkNumber, doctor.doctorWorkNumber) && Objects.equals(doctorEmailAddress, doctor.doctorEmailAddress) && Objects.equals(doctorSpecialization, doctor.doctorSpecialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doctorId, doctorFirstName, doctorLastName, doctorWorkNumber, doctorEmailAddress, doctorSpecialization);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", doctorFirstName='" + doctorFirstName + '\'' +
                ", doctorLastName='" + doctorLastName + '\'' +
                ", doctorWorkNumber='" + doctorWorkNumber + '\'' +
                ", doctorEmailAddress='" + doctorEmailAddress + '\'' +
                ", doctorSpecialization='" + doctorSpecialization + '\'' +
                '}';
    }

    public static class Builder{
        public String doctorId;
        private String doctorFirstName;
        private String doctorLastName;
        private String doctorWorkNumber;
        private String doctorEmailAddress;
        private String doctorSpecialization;

        public Builder setDoctorId(String doctorId) {
            this.doctorId = doctorId;
            return this;
        }

        public Builder setDoctorFirstName(String doctorFirstName) {
            this.doctorFirstName = doctorFirstName;
            return this;
        }

        public Builder setDoctorLastName(String doctorLastName) {
            this.doctorLastName = doctorLastName;
            return this;
        }

        public Builder setDoctorWorkNumber(String doctorWorkNumber) {
            this.doctorWorkNumber = doctorWorkNumber;
            return this;
        }

        public Builder setDoctorEmailAddress(String doctorEmailAddress) {
            this.doctorEmailAddress = doctorEmailAddress;
            return this;
        }

        public Builder setDoctorSpecialization(String doctorSpecialization) {
            this.doctorSpecialization = doctorSpecialization;
            return this;
        }
        public Builder copy(Doctor doctor){
            this.doctorId = doctor.doctorId;
            this.doctorFirstName = doctor.doctorFirstName;
            this.doctorLastName = doctor.doctorLastName;
            this.doctorWorkNumber = doctor.doctorWorkNumber;
            this.doctorEmailAddress = doctor.doctorEmailAddress;
            this.doctorSpecialization = doctor.doctorSpecialization;
            return this;
        }
        public Doctor build(){
            return new Doctor(this);
        }
    }
}