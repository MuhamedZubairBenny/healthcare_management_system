package za.ac.cput.repository;
// Author: Isa Hassan - 222043555
import za.ac.cput.domain.Doctor;
import za.ac.cput.domain.MedicalRecord;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordRepository implements IMedicalRecordRepository {
    private static IMedicalRecordRepository repository = null;
    private List<MedicalRecord> MedicalRecordList;

    private MedicalRecordRepository() {
        MedicalRecordList = new ArrayList<MedicalRecord>();
    }

    public static IMedicalRecordRepository getRepository() {
        if (repository == null) {
            repository = new MedicalRecordRepository();
        }

        return repository;
    }




    @Override
    public MedicalRecord create(MedicalRecord medicalRecord) {
        boolean success = MedicalRecordList.add(medicalRecord);
        if (success)
            return medicalRecord;

        return null;
    }

    @Override
    public MedicalRecord read (String id) {
        for (MedicalRecord e : MedicalRecordList) {
            if (e.getRecordID().equals(id))
                return e;
        }
        return null;
    }



    @Override
    public MedicalRecord update(MedicalRecord medicalRecord) {
       MedicalRecord medicalRecordOld = read(medicalRecord.getRecordID());

        boolean success = MedicalRecordList.remove(medicalRecordOld);
        if(success){
            if(MedicalRecordList.add(medicalRecord))
                return medicalRecord;
        }
        return null;
    }

    @Override
    public boolean delete(String id) {
        MedicalRecord  medicalRecordToDelete = read(id);
        boolean success = MedicalRecordList.remove(medicalRecordToDelete);
      return success;
    }

    @Override
    public List<MedicalRecord> getAll() {
        return MedicalRecordList;
    }
}