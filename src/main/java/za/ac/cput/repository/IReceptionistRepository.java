package za.ac.cput.repository;

import za.ac.cput.domain.Receptionist;
import java.util.List;

public interface IReceptionistRepository extends IRepository<Receptionist, String> {
    List<Receptionist> getAll();
}
