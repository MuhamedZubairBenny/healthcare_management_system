package za.ac.cput.factory;

import za.ac.cput.domain.Billing;
import za.ac.cput.util.Helper;

public class BillingFactory {
    public static Billing createBilling(String patientID, String serviceDate, double totalAmount) {
        int invoiceNumber = Helper.generateInvoiceNumber();
        if (Helper.isNullOrEmpty(patientID) || serviceDate == null || totalAmount <= 0) {
            throw new IllegalArgumentException("Invalid billing parameters");
        }

        return new Billing.Builder()
                .setInvoiceNumber(invoiceNumber)
                .setPatientID(patientID)
                .setServiceDate(serviceDate)
                .setTotalAmount(totalAmount)
                .build();
    }
    public static Billing createBilling(int invoiceNumber, String patientID, String serviceDate, double totalAmount) {
        if (Helper.isNullOrEmpty(patientID) || serviceDate == null || totalAmount <= 0) {
            throw new IllegalArgumentException("Invalid billing parameters");
        }

        return new Billing.Builder()
                .setInvoiceNumber(invoiceNumber)
                .setPatientID(patientID)
                .setServiceDate(serviceDate)
                .setTotalAmount(totalAmount)
                .build();
    }
}

