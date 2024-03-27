package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

public class MedicalRecord {
    public String recordID;
    private String patientID;
    private String doctorID;
    private String date;
    private String diagnosis;
    private String treatment;


    private MedicalRecord(Builder builder) {
        this.recordID = builder.recordID;
        this.patientID = builder.patientID;
        this.doctorID = builder.doctorID;
        this.date = builder.date;
        this.diagnosis = builder.diagnosis;
        this.treatment = builder.treatment;
    }

    public MedicalRecord(String recordID, String patientID, String doctorID, String date, String diagnosis, String treatment) {

    }

    public String getRecordID() {
        return recordID;
    }

    public String getPatientID() {
        return patientID;
    }

    public String getDoctorID() {
        return doctorID;
    }

    public String getDate() {
        return date;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public String getTreatment() {
        return treatment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalRecord that = (MedicalRecord) o;
        return Objects.equals(recordID, that.recordID) && Objects.equals(patientID, that.patientID) && Objects.equals(doctorID, that.doctorID) && Objects.equals(date, that.date) && Objects.equals(diagnosis, that.diagnosis) && Objects.equals(treatment, that.treatment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordID, patientID, doctorID, date, diagnosis, treatment);
    }

    @Override
    public String toString() {
        return "MedicalRecord{" +
                "recordID='" + recordID + '\'' +
                ", patientID='" + patientID + '\'' +
                ", doctorID='" + doctorID + '\'' +
                ", date=" + date +
                ", diagnosis='" + diagnosis + '\'' +
                ", treatment='" + treatment + '\'' +
                '}';
    }

    public static class Builder {
        private String recordID;
        private String patientID;
        private String doctorID;
        private String date;
        private String diagnosis;
        private String treatment;

        public Builder setRecordID(String recordID) {
            this.recordID = recordID;
            return this;
        }
        public Builder setPatientID(String patientID) {
            this.patientID = patientID;
            return this;
        }
        public Builder setDoctorID(String doctorID) {
            this.doctorID = doctorID;
            return this;
        }

        public Builder setDate(String date) {
            this.date = date;
            return this;
        }

        public Builder setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public Builder setTreatment(String treatment) {
            this.treatment = treatment;
            return this;
        }

        public Builder copy(MedicalRecord medicalRecord) {
            this.recordID = medicalRecord.recordID;
            this.patientID = medicalRecord.patientID;
            this.doctorID = medicalRecord.doctorID;
            this.date = medicalRecord.date;
            this.diagnosis = medicalRecord.diagnosis;
            this.treatment = medicalRecord.treatment;
            return this;
        }

        public MedicalRecord build() {
            return new MedicalRecord(this);
        }
    }
}