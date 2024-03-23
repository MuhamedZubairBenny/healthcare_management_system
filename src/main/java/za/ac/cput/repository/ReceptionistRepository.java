package za.ac.cput.repository;

import za.ac.cput.domain.Receptionist;
import java.util.ArrayList;
import java.util.List;

public class ReceptionistRepository implements IReceptionistRepository{
    private static IReceptionistRepository repository = null;
    private List<Receptionist> receptionistList;
    private ReceptionistRepository(){ receptionistList = new ArrayList<Receptionist>();}

    public static IReceptionistRepository getRepository(){
        if (repository == null){
            repository = new ReceptionistRepository();
        }
        return repository;
    }
    @Override
    public Receptionist create(Receptionist receptionist){
        boolean success = receptionistList.add(receptionist);
        if(success){
            return receptionist;
        }
        return null;
    }
    @Override
    public Receptionist read(String ID){
        for(Receptionist receptionist : receptionistList){
            if(receptionist.getReceptionistID().equals(ID))
                return receptionist;
        }
        return null;
    }

    public Receptionist update(Receptionist receptionist){
        String ID = receptionist.getReceptionistID();
        Receptionist receptionist1 = read(ID);
        if(receptionist1 == null)
            return null;
        boolean success = delete(ID);
        if(success){
            if(receptionistList.add(receptionist))
                return receptionist;
        }
        return null;
    }
    @Override
    public boolean delete(String ID){
        Receptionist receptionistToDelete = read(ID);
        if (receptionistToDelete == null)
            return false;
        return(receptionistList.remove(receptionistToDelete));
    }

    @Override
    public List<Receptionist> getAll(){
        return receptionistList;
    }

}
