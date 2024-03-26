package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Billing;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class BillingFactoryTest {

    @Test
    @Order(1)
    void createBilling() {
        Billing billing = BillingFactory.createBilling(1,"31ST57","4/04/2024", 1000.0);
        assertNotNull(billing);
        System.out.println(billing.toString());
    }

    @Test
    @Order(2)
    void testCreateBillingWithInvalidParameters() {
        assertThrows(IllegalArgumentException.class, () -> {
            BillingFactory.createBilling(2,"53BN94", null, -100.0);
        });
    }
}

