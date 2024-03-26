package za.ac.cput;

import za.ac.cput.domain.Billing;
import za.ac.cput.factory.BillingFactory;
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
        System.out.println(billing4.toString());
    }
}
