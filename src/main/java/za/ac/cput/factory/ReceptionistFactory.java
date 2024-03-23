package za.ac.cput.factory;
import za.ac.cput.util.Helper;
import za.ac.cput.domain.Receptionist;
public class ReceptionistFactory {
    public static Receptionist buildReceptionist(String receptionistID, String receptionistName, String receptionistSurname, String receptionistNo, String receptionistEmail) {
        if (Helper.isNullOrEmpty(receptionistID) || Helper.isNullOrEmpty(receptionistName) ||
                Helper.isNullOrEmpty(receptionistSurname) || Helper.isNullOrEmpty(receptionistNo) ||
                Helper.isNullOrEmpty(receptionistEmail))
            return null;

        return new Receptionist.Builder().setReceptionistID(receptionistID)
                .setReceptionistName(receptionistName).
                setReceptionistSurname(receptionistSurname).
                setReceptionistNo(receptionistNo).
                setReceptionistEmail(receptionistEmail)
                .build();

    }

    public static Receptionist buildReceptionist(String receptionistName, String receptionistSurname, String receptionistNo, String receptionistEmail) {
        if (Helper.isNullOrEmpty(receptionistName) || Helper.isNullOrEmpty(receptionistSurname) || Helper.isNullOrEmpty(receptionistNo) || Helper.isNullOrEmpty(receptionistEmail))
            return null;
        String receptionistID = Helper.generateId();

        return new Receptionist.Builder().setReceptionistID(receptionistID)
                .setReceptionistName(receptionistName).
                setReceptionistSurname(receptionistSurname).
                setReceptionistNo(receptionistNo).
                setReceptionistEmail(receptionistEmail)
                .build();

    }
}

