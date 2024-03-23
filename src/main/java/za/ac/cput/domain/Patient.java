package za.ac.cput.domain;

import java.util.Objects;

public class Patient {
    private String patientID;
    private String name;
    private String gender;
    private int age;
    private String contactInfo;

private Patient(Builder builder) {
    this.patientID = builder.patientID;
    this.name = builder.name;
    this.gender = builder.gender;
    this.age = builder.age;
    this.contactInfo = builder.contactInfo;

}

    public Patient(String patientID, String name, String gender, int age, String contactInfo){

    }
    public String getPatientID() {
        return patientID;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return age == patient.age && contactInfo == patient.contactInfo && Objects.equals(patientID, patient.patientID) && Objects.equals(name, patient.name) && Objects.equals(gender, patient.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(patientID, name, gender, age, contactInfo);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientID='" + patientID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", contactInfo=" + contactInfo +
                '}';
    }
    public static class Builder{
        private String patientID;
        private String name;
        private String gender;
        private int age;
        private String contactInfo;
        public Builder setPatientID(String patientID){
            this.patientID = patientID;
            return this;
        }
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setGender(String gender){
            this.gender = gender;
            return this;
        }
        public Builder setAge(int age){
            this.age = age;
            return this;
        }
        public Builder setContactInfo(String contactInfo){
            this.contactInfo = contactInfo;
            return this;
        }

        public Patient build() {
            return new Patient(this);
        }

        public Builder copy(Patient patient) {
            this.patientID = patient.patientID;
            this.name = patient.name;
            this.gender = patient.gender;
            this.age = patient.age;
            this.contactInfo = patient.contactInfo;
            return this;
        }
    }
}
