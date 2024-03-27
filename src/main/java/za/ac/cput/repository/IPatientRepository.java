package za.ac.cput.repository;
//Author: Duane Prins - 222706333

import za.ac.cput.domain.Patient;
import java.util.List;

public interface IPatientRepository extends IRepository <Patient, String> {
    List<Patient> getall();

}
