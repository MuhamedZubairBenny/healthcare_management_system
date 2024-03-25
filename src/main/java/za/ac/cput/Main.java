package za.ac.cput;

import za.ac.cput.domain.Doctor;
import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.domain.Patient;
import za.ac.cput.factory.DoctorFactory;
import za.ac.cput.factory.PatientFactory;

public class Main {
    public static void main(String[] args) {
        MedicalRecord record1 = new MedicalRecord.Builder().setRecordID("003")
                .setDoctorID("6547532")
                .setPatientID("T85H93")
                .setDate("13/05/2024")
                .setDiagnosis("Arrhythmia")
                .setTreatment("anti-arrhythmic drugs")
                .build();
        System.out.println(record1.toString());

        /*MedicalRecord record2 = new MedicalRecord.Builder().setRecordID("004")
                .setDoctorID("7942345")
                .setPatientID("L94R46")
                .setDate("01/04/2024")
                .setDiagnosis("Arthritis")
                .setTreatment("NSAIDs or acetaminophen")
                .build();
        System.out.println(record2.toString());
        MedicalRecord record3 = new MedicalRecord.Builder().setRecordID("005")
                .setDoctorID("8756455")
                .setPatientID("I99D83")
                .setDate("05/03/2024")
                .setDiagnosis("Chronic kidney disease")
                .setTreatment("high blood pressure medication")
                .build();
        System.out.println(record3.toString());
        MedicalRecord record4 = new MedicalRecord.Builder().setRecordID("006")
                .setDoctorID("4523652")
                .setPatientID("P43T36")
                .setDate("09/06/2024")
                .setDiagnosis("Diabetes")
                .setTreatment("Insulin")
                .build();
        System.out.println(record4.toString());*/
        Doctor doctor1 = new Doctor.Builder().setDoctorId("")
                .setDoctorFirstName("Sharaad")
                .setDoctorLastName("Singh")
                .setDoctorWorkNumber("021 591 3722")
                .setDoctorEmailAddress("singhs@mailwu.com")
                .setDoctorSpecialization("General-practitioner")
                .build();
        System.out.println(doctor1.toString());

        Doctor doctor2 = DoctorFactory.buildDoctor("Duane", "Prins", "021 687 3520", "bigduane@mailwu.com", "Physiotherapist");
        System.out.println(doctor2.toString());

        Doctor doctor3 = DoctorFactory.buildDoctor("00101","Zubair", "Benny", "021 599 6992", "bennyz@mailwu.com", "General-Practitioner");
        System.out.println(doctor3.toString());

        Patient patient1 = new Patient.Builder().setPatientID("")
                .setName("Raaziq").setAge(25).setGender("Male").setContactInfo("0745625770").build();
        System.out.println(patient1.toString());

        Patient patient2 = PatientFactory.buildPatient("345S1","Suhayl","Male",26,"0632547808");
        System.out.println(patient2.toString());

        Patient patient3 = PatientFactory.buildPatient("5S42D","Sharaad","Male",23,"0794532121");
        System.out.println(patient3.toString());

    }
}
