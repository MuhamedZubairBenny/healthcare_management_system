package za.ac.cput.repository;
//Author: Matthew McGregor - 222198559
import za.ac.cput.domain.Billing;

import java.util.List;

public interface IBillingRepository extends IRepository<Billing, Integer> {
    List<Billing> getAll();
}

