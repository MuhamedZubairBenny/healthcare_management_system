package za.ac.cput.repository;
//Author: Matthew McGregor - 222198559
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Billing;
import za.ac.cput.factory.BillingFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillingRepositoryTest {
    private static IBillingRepository repository = BillingRepository.getRepository();
    private Billing billing = BillingFactory.createBilling(1, "31ST57", "15/08/2024", 1000.0); // Ensure the factory method allows setting invoice number

    @Test
    @Order(1)
    void create() {
        Billing created = repository.create(billing);
        assertNotNull(created);
        assertEquals(billing, created); // Update the assertion to ensure correct creation
        System.out.println(created);
    }

    @Test
    @Order(2)
    void read() {
        Billing read = repository.read(billing.getInvoiceNumber());
        assertNotNull(read);
        assertEquals(billing, read); // Update the assertion to ensure correct reading
        System.out.println(read);
    }

    @Test
    @Order(3)
    void update() {
        Billing updated = repository.update(new Billing.Builder().copy(billing).setTotalAmount(1000.0).build());
        assertNotNull(updated);
        assertEquals(1000.0, updated.getTotalAmount()); // Update the assertion to ensure correct updating
        System.out.println(updated);
    }

    @Test
    @Order(4)
    void getAll() {
        assertNotNull(repository.getAll()); // Ensure that the repository returns a non-null list
        System.out.println(repository.getAll());
    }

    @Test
    @Order(5)
    void delete() {
        assertTrue(repository.delete(billing.getInvoiceNumber()));
        System.out.println("Success: Deleted billing");
    }
}

