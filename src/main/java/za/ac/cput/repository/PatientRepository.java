package za.ac.cput.repository;
//Author: Duane Prins - 222706333
import za.ac.cput.domain.Patient;
import java.util.ArrayList;
import java.util.List;
public class PatientRepository implements IPatientRepository {
    private static IPatientRepository repository = null;
    private List<Patient> patientList;

    private PatientRepository() {
        patientList = new ArrayList<Patient>();
    }

    public static IPatientRepository getRepository() {
        if (repository == null) {
            repository = new PatientRepository();
        }
        return repository;
    }
    @Override
    public Patient create(Patient patient){
        boolean success = patientList.add(patient);
        if(success) {
            return patient;
        }
        return null;
}
    @Override
    public Patient read(String id) {
        for(Patient p : patientList){
            if(p.getPatientID().equals(id))
                return p;
        }
        return null;
    }
    public Patient update(Patient patient) {
        String id = patient.getPatientID();
        Patient patient1 = read(id);
        if(patient1 == null)
            return null;
        boolean success = delete(id);
        if(success) {
            if(patientList.add(patient))
                return patient;
        }
        return null;
    }
    @Override
    public boolean delete(String id){
        Patient patientToDelete = read(id);
        if (patientToDelete == null)
            return false;
        return(patientList.remove(patientToDelete));
    }

    @Override
    public List<Patient> getall() {return patientList;}
}
