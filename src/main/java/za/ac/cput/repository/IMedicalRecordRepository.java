package za.ac.cput.repository;
// Author: Isa Hassan - 222043555

import za.ac.cput.domain.MedicalRecord;

import java.util.List;

public interface IMedicalRecordRepository extends IRepository <MedicalRecord, String>{
    List<MedicalRecord> getAll();

}
