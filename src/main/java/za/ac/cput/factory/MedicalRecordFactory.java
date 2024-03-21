package za.ac.cput.factory;

import za.ac.cput.domain.MedicalRecord;
import za.ac.cput.util.Helper;



public class MedicalRecordFactory {
    public static MedicalRecord buildMedicalRecord(String recordID, String patientID, String doctorID,
                                                   String date, String diagnosis, String treatment){
if(Helper.isNullOrEmpty(recordID) || Helper.isNullOrEmpty(patientID) || Helper.isNullOrEmpty(doctorID)
        || Helper.isNullOrEmpty(date) || Helper.isNullOrEmpty(diagnosis) || Helper.isNullOrEmpty(treatment))
    return null;
return new MedicalRecord.Builder().setRecordID(recordID)
        .setPatientID(patientID)
        .setDoctorID(doctorID)
        .setDate(date)
        .setDiagnosis(diagnosis)
        .setTreatment(treatment)
        .build();
    }
    public static MedicalRecord buildMedicalRecord( String patientID, String doctorID,
                                                   String date, String diagnosis, String treatment){
        if( Helper.isNullOrEmpty(patientID) || Helper.isNullOrEmpty(doctorID)
                || Helper.isNullOrEmpty(date) || Helper.isNullOrEmpty(diagnosis) || Helper.isNullOrEmpty(treatment))
            return null;
        String recordID = Helper.generateId();
        return new MedicalRecord.Builder().setRecordID(recordID)
                .setPatientID(patientID)
                .setDoctorID(doctorID)
                .setDate(date)
                .setDiagnosis(diagnosis)
                .setTreatment(treatment)
                .build();
    }


}
