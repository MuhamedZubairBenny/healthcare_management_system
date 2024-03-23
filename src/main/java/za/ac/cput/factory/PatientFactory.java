package za.ac.cput.factory;
import za.ac.cput.util.Helper;
import za.ac.cput.domain.Patient;

public class PatientFactory {
    public static Patient buildPatient(String patientID,String name,String gender,int age,String contactInfo){
        if (Helper.isNullOrEmpty(patientID) || Helper.isNullOrEmpty(name) ||
        Helper.isNullOrEmpty(gender) || Helper.isNullOrZero(age) ||
        Helper.isNullOrEmpty(contactInfo))
        return null;

        return new Patient.Builder().setPatientID(patientID)
                .setName(name).
                setGender(gender).
                setAge(age).
                setContactInfo(contactInfo)
                .build();

    }
    public static Patient buildPatient ( String name,String gender, int age, String contactInfo) {
        if (Helper.isNullOrEmpty(name) || Helper.isNullOrEmpty(gender) || Helper.isNullOrZero(age) || Helper.isNullOrEmpty(contactInfo))
            return null;
        String patientID = Helper.generateId();
        return new Patient.Builder().setPatientID(patientID)
                .setName(name).
                setGender(gender).
                setAge(age).
                setContactInfo(contactInfo)
                .build();
    }

}
