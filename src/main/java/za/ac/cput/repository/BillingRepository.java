package za.ac.cput.repository;
//Author: Matthew McGregor - 222198559
import za.ac.cput.domain.Billing;

import java.util.ArrayList;
import java.util.List;

public class BillingRepository implements IBillingRepository {
    private static BillingRepository repository = null;
    private List<Billing> billingList;

    private BillingRepository() {
        billingList = new ArrayList<>();
    }

    public static BillingRepository getRepository() {
        if (repository == null) {
            repository = new BillingRepository();
        }
        return repository;
    }

    @Override
    public Billing create(Billing billing) {
        billingList.add(billing);
        return billing;
    }

    @Override
    public Billing read(Integer id) {
        return billingList.stream()
                .filter(billing -> billing.getInvoiceNumber() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Billing update(Billing billing) {
        Billing oldBilling = read(billing.getInvoiceNumber());
        if (oldBilling != null) {
            billingList.remove(oldBilling);
            billingList.add(billing);
            return billing;
        }
        return null;
    }

    @Override
    public boolean delete(Integer id) {
        Billing billingToDelete = read(id);
        return billingList.remove(billingToDelete);
    }

    @Override
    public List<Billing> getAll() {
        return billingList;
    }
}
