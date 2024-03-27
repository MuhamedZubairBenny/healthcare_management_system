package za.ac.cput.domain;
//Author : Imaan Sadien - 221752838


import java.util.Objects;


public class Receptionist {
    public String receptionistID;
    private String receptionistName;
    private String receptionistSurname;
    private String receptionistNo;
    private String receptionistEmail;

    public Receptionist(String receptionistID, String receptionistName, String receptionistSurname, String receptionistNo, String receptionistEmail) {
    }

    public Receptionist(Builder builder) {
        this.receptionistID = builder.receptionistID;
        this.receptionistName = builder.receptionistName;
        this.receptionistSurname = builder.receptionistSurname;
        this.receptionistNo = builder.receptionistNo;
        this.receptionistEmail = builder.receptionistEmail;
    }

    public String getReceptionistID() {
        return receptionistID;
    }

    public String getReceptionistName() {
        return receptionistName;
    }

    public String getReceptionistSurname() {
        return receptionistSurname;
    }

    public String getReceptionistNo() {
        return receptionistNo;
    }

    public String getReceptionistEmail() {
        return receptionistEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Receptionist that = (Receptionist) o;
        return Objects.equals(receptionistID, that.receptionistID) && Objects.equals(receptionistName, that.receptionistName) && Objects.equals(receptionistSurname, that.receptionistSurname) && Objects.equals(receptionistNo, that.receptionistNo) && Objects.equals(receptionistEmail, that.receptionistEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(receptionistID, receptionistName, receptionistSurname, receptionistNo, receptionistEmail);
    }

    @Override
    public String toString() {
        return "Receptionist{" +
                "receptionistID='" + receptionistID + '\'' +
                ", receptionistName='" + receptionistName + '\'' +
                ", receptionistSurname='" + receptionistSurname + '\'' +
                ", receptionistNo='" + receptionistNo + '\'' +
                ", receptionistEmail='" + receptionistEmail + '\'' +
                '}';
    }

    public static class Builder{
        private String receptionistID;
        private String receptionistName;
        private String receptionistSurname;
        private String receptionistNo;
        private String receptionistEmail;

        public Builder setReceptionistID(String receptionistID) {
            this.receptionistID = receptionistID;
            return this;
        }

        public Builder setReceptionistName(String receptionistName) {
            this.receptionistName = receptionistName;
            return this;
        }

        public Builder setReceptionistSurname(String receptionistSurname) {
            this.receptionistSurname = receptionistSurname;
            return this;
        }

        public Builder setReceptionistNo(String receptionistNo) {
            this.receptionistNo = receptionistNo;
            return this;
        }

        public Builder setReceptionistEmail(String receptionistEmail) {
            this.receptionistEmail = receptionistEmail;
            return this;
        }

        public Receptionist.Builder copy(Receptionist receptionist){
            this.receptionistID = receptionist.receptionistID;
            this.receptionistName = receptionist.receptionistName;
            this.receptionistSurname = receptionist.receptionistSurname;
            this.receptionistNo = receptionist.receptionistNo;
            this.receptionistEmail = receptionist.receptionistEmail;
            return this;
        }
        public Receptionist build() { return new Receptionist(this);}
    }
}
