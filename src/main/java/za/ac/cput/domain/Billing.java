package za.ac.cput.domain;
// Author: Matthew McGregor - 222198559

import java.util.Objects;

public class Billing {
        private int invoiceNumber;
        private String patientID;
        private String serviceDate;
        private double totalAmount;


        public Billing(int invoiceNumber, String patientID, String serviceDate, double totalAmount) {
        }

        private Billing(za.ac.cput.domain.Billing.Builder builder){
            this.invoiceNumber = builder.invoiceNumber;;
            this.patientID = builder.patientID;
            this.serviceDate = builder.serviceDate;
            this.totalAmount = builder.totalAmount;
        }
        public int getInvoiceNumber() {
            return invoiceNumber;
        }

        public String getPatientID() {
            return patientID;
        }

        public String getServiceDate() {
            return serviceDate;
        }

        public double getTotalAmount() {
            return totalAmount;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            za.ac.cput.domain.Billing billing = (za.ac.cput.domain.Billing) o;
            return Objects.equals(invoiceNumber, billing.invoiceNumber) && Objects.equals(patientID, billing.patientID) && Objects.equals(serviceDate, billing.serviceDate) && Objects.equals(totalAmount, billing.totalAmount);
        }

        @Override
        public int hashCode() {
            return Objects.hash(invoiceNumber, patientID, serviceDate, totalAmount);
        }

        @Override
        public String toString() {
            return "Billing{" +
                    "invoiceNumber='" + invoiceNumber + '\'' +
                    ", patientID='" + patientID + '\'' +
                    ", serviceDate='" + serviceDate + '\'' +
                    ", totalAmount='" + totalAmount + '\'' +
                    '}';
        }

        public static class Builder{
            public int invoiceNumber;
            private String patientID;
            private String serviceDate;
            private double totalAmount;

            public za.ac.cput.domain.Billing.Builder setInvoiceNumber(int invoiceNumber) {
                this.invoiceNumber = invoiceNumber;
                return this;
            }

            public za.ac.cput.domain.Billing.Builder setPatientID(String patientID) {
                this.patientID = patientID;
                return this;
            }

            public za.ac.cput.domain.Billing.Builder setServiceDate(String serviceDate) {
                this.serviceDate = serviceDate;
                return this;
            }

            public za.ac.cput.domain.Billing.Builder setTotalAmount(double totalAmount) {
                this.totalAmount = totalAmount;
                return this;
            }
            public za.ac.cput.domain.Billing.Builder copy(za.ac.cput.domain.Billing billing){
                this.invoiceNumber = billing.invoiceNumber;
                this.patientID = billing.patientID;
                this.serviceDate = billing.serviceDate;
                this.totalAmount = billing.totalAmount;
                return this;
            }
            public za.ac.cput.domain.Billing build(){
                return new za.ac.cput.domain.Billing(this);
            }
        }
    }
