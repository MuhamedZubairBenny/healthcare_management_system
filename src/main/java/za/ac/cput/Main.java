package za.ac.cput;

import za.ac.cput.domain.Doctor;
import za.ac.cput.domain.MedicalRecord;

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
        MedicalRecord record2 = new MedicalRecord.Builder().setRecordID("004")
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
                .setDate("03/06/2024")
                .setDiagnosis("Diabetes")
                .setTreatment("Insulin")
                .build();
        System.out.println(record4.toString());


    }
}
