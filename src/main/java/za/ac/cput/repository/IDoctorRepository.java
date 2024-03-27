package za.ac.cput.repository;

// Author: Muhamed Zubair Benny - 220527636

import za.ac.cput.domain.Doctor;

import java.util.List;

public interface IDoctorRepository  extends IRepository <Doctor, String> {
    List<Doctor> getAll();
}
