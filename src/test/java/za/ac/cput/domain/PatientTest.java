package za.ac.cput.domain;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

 class PatientTest {
     private Patient patient1;
     private Patient patient2;
     private Patient patient3;
     @BeforeEach
     void setUp(){
         patient1 = new Patient("31ST57","Bob","male",40, 0674321532);
         patient2 = new Patient("53BN94","Swagger","male",35, 0724721646);
         patient3 = patient1;
}
     @Test
     @Order(1)
     void testObjectEquality() {
         assertEquals(patient1, patient3);
         System.out.println("Equality Test has successful passed");

     }
     @Test
     @Order(2)
     void testObjectIdentity(){
         assertEquals(patient1, patient3);
         System.out.println("Identity Test has successful passed");
     }

 @Test
 @Order(3)
 void testFailingTest(){
     assertSame(patient1, patient3);
    }
 @Test
 @Disabled
 @Order(4)
 void testGetPatientId(){assertSame(patient1, patient2);
    }
    @Test
    @Order(5)
    @Timeout(1)
    void testFailedAfterOneSeconds() throws InterruptedException {
        Thread.sleep(2000);
    }
}
