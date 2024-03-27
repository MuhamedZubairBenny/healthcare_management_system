package za.ac.cput;
//Author: Mikaeel Davids - 222590955
//Author: Duane Prins - 222706333
import za.ac.cput.domain.*;
import za.ac.cput.factory.*;


public class Main {
    public static void main(String[] args) {
        Billing billing1 = new Billing.Builder()
                .setInvoiceNumber(1)
                .setPatientID("P13K21")
                .setServiceDate("01/01/2024")
                .setTotalAmount(200.0)
                .build();
        System.out.println(billing1.toString());

        Billing billing2 = new Billing.Builder()
                .setInvoiceNumber(2)
                .setPatientID("P23J78")
                .setServiceDate("13/03/2024")
                .setTotalAmount(100.0)
                .build();
        System.out.println(billing2.toString());

        Billing billing3 = BillingFactory.createBilling(3,"P37H00","17/04/2024", 300.0);
        System.out.println(billing3.toString());

        Billing billing4 = BillingFactory.createBilling(4,"P43T36", "15/08/2024", 400.0);
        System.out.println(billing4.toString() + "\n");
      
        MedicalRecord record1 = new MedicalRecord.Builder().setRecordID("001")
                .setDoctorID("6547532")
                .setPatientID("T85H93")
                .setDate("13/05/2024")
                .setDiagnosis("Arrhythmia")
                .setTreatment("anti-arrhythmic drugs")
                .build();
        System.out.println(record1.toString());

        MedicalRecord record2 = new MedicalRecord.Builder().setRecordID("002")
                .setDoctorID("8756455")
                .setPatientID("I99D93")
                .setDate("05/03/2024")
                .setDiagnosis("Chronic kidney disease")
                .setTreatment("high blood pressure medication")
                .build();
        System.out.println(record2.toString());

        MedicalRecord record3 = MedicalRecordFactory.buildMedicalRecord("4523652", "P43T36",  "09/06/2024",   "Diabetes" ,"Insulin");
        System.out.println(record3.toString());

        MedicalRecord record4 = MedicalRecordFactory.buildMedicalRecord("004", "4523652", "P43T36",  "09/06/2024",   "Diabetes" ,"Insulin");
        System.out.println(record4.toString() + "\n");

        Doctor doctor1 = new Doctor.Builder().setDoctorId("")
                .setDoctorFirstName("Sharaad")
                .setDoctorLastName("Singh")
                .setDoctorWorkNumber("021 591 3722")
                .setDoctorEmailAddress("singhs@mailwu.com")
                .setDoctorSpecialization("General-practitioner")
                .build();
        System.out.println(doctor1.toString());

        Doctor doctor2 = DoctorFactory.buildDoctor("Duane", "Prins", "021 687 3520", "bigduane@mailwu.com", "Physiotherapist");
        System.out.println(doctor2.toString());

        Doctor doctor3 = DoctorFactory.buildDoctor("00101","Zubair", "Benny", "021 599 6992", "bennyz@mailwu.com", "General-Practitioner");
        System.out.println(doctor3.toString() + "\n");


        Receptionist receptionist1 = new Receptionist.Builder().setReceptionistID("")
                .setReceptionistName("Blake")
                .setReceptionistSurname("Reynolds")
                .setReceptionistNo("021 639 5241")
                .setReceptionistEmail("blake@reception.co.za")
                .build();
        System.out.println(receptionist1.toString());

        Receptionist receptionist2 = ReceptionistFactory.buildReceptionist("John", "Snow", "021 658 3214", "john@reception.co.za");
        System.out.println(receptionist2.toString());

        Receptionist receptionist3 = ReceptionistFactory.buildReceptionist("03265", "Regina", "Philange", "021 634 9856", "regina@reception.co.za");
        System.out.println(receptionist3.toString() + "\n");

        Patient patient1 = new Patient.Builder().setPatientID("")
                .setName("Raaziq").setAge(25).setGender("Male").setContactInfo("0745625770").build();
        System.out.println(patient1.toString());

        Patient patient2 = PatientFactory.buildPatient("345S1","Suhayl","Male",26,"0632547808");
        System.out.println(patient2.toString());

        Patient patient3 = PatientFactory.buildPatient("5S42D","Sharaad","Male",23,"0794532121");
        System.out.println(patient3.toString()+"\n");

        Appointment appointment1 = new Appointment.Builder().setAppointmentId("135928")
                .setPatientId("246801")
                .setDoctorId("135678")
                .setAppointmentDate("09/02/2024")
                .setAppointmentDuration("30 minutes").build();
        System.out.println(appointment1.toString());

        Appointment appointment2 = AppointmentFactory.buildAppointment("185436", "123456", "254367", "10/02/2024", "1 hour");
        System.out.println(appointment2.toString());

        Appointment appointment3 = AppointmentFactory.buildAppointment("435672", "765839", "11/02/2024", "45 minutes");
        System.out.println(appointment3.toString());


    }
}
