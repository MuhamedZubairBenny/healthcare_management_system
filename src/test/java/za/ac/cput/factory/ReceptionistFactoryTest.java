//Author : Imaan Sadien - 221752838
package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Receptionist;
import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class ReceptionistFactoryTest {

    @Test
    @Order(1)
    void buildReceptionist() {
        Receptionist r = ReceptionistFactory.buildReceptionist("26354","Sam","Will","0219658745", "sam@reception.co.za");
        assertNotNull(r);
        System.out.println(r.toString());
    }

    @Test
    @Order(2)
    void testBuildReceptionistWithFail() {
        Receptionist r = ReceptionistFactory.buildReceptionist("","Jeff", "Steve", "0216547412", "steve@reception.co.za");
        assertNotNull(r);
        System.out.println(r.toString());
    }
}