package za.ac.cput.repository;

// Author: Muhamed Zubair Benny - 220527636

import za.ac.cput.domain.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepository implements IDoctorRepository {
    private static IDoctorRepository repository = null;
    private List<Doctor> doctorList;
    private DoctorRepository(){ doctorList = new ArrayList<Doctor>();}
    public static IDoctorRepository getRepository(){
        if (repository == null){
            repository = new DoctorRepository();
        }
        return repository;
    }
    @Override
    public Doctor create(Doctor doctor) {
        boolean success = doctorList.add(doctor);
        if (success)
            return doctor;
        return null;
    }

    @Override
    public Doctor read(String id) {
        for (Doctor d : doctorList){
            if (d.getDoctorId().equals(id))
                return d;
        }
        return null;
    }

    @Override
    public Doctor update(Doctor doctor) {
        Doctor doctorOld = read(doctor.getDoctorId());

        boolean success = doctorList.remove(doctorOld);
        if(success){
            if(doctorList.add(doctor))
                return doctor;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        Doctor doctorToDelete = read(id);
        boolean success = doctorList.remove(doctorToDelete);
        return success;
    }

    @Override
    public List<Doctor> getAll() {
        return doctorList;
    }
}
