package za.ac.cput.repository;


import za.ac.cput.domain.MedicalRecord;

import java.util.List;

public interface IMedicalRecordRepository extends IRepository <MedicalRecord, String>{
    List<MedicalRecord> getAll();

}
