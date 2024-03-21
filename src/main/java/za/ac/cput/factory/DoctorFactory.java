package za.ac.cput.factory;

import za.ac.cput.domain.Doctor;
import za.ac.cput.util.Helper;

public class DoctorFactory {
    public static Doctor buildDoctor(String doctorId, String doctorFirstName, String doctorLastName, String doctorWorkNumber, String doctorEmailAddress, String doctorSpecialization){
        if (Helper.isNullOrEmpty(doctorId) || Helper.isNullOrEmpty(doctorFirstName) || Helper.isNullOrEmpty(doctorLastName) || Helper.isNullOrEmpty(doctorWorkNumber) || Helper.isNullOrEmpty(doctorEmailAddress) || Helper.isNullOrEmpty(doctorSpecialization))
            return null;

        return new Doctor.Builder().setDoctorId(doctorId)
                .setDoctorFirstName(doctorFirstName)
                .setDoctorLastName(doctorLastName)
                .setDoctorWorkNumber(doctorWorkNumber)
                .setDoctorEmailAddress(doctorEmailAddress)
                .setDoctorSpecialization(doctorSpecialization)
                .build();
    }

    public static Doctor buildDoctor(String doctorFirstName, String doctorLastName, String doctorWorkNumber, String doctorEmailAddress, String doctorSpecialization){
        if (Helper.isNullOrEmpty(doctorFirstName) || Helper.isNullOrEmpty(doctorLastName) || Helper.isNullOrEmpty(doctorWorkNumber) || Helper.isNullOrEmpty(doctorEmailAddress) || Helper.isNullOrEmpty(doctorSpecialization))
            return null;
        String doctorId = Helper.generateId();

        return new Doctor.Builder().setDoctorId(doctorId)
                .setDoctorFirstName(doctorFirstName)
                .setDoctorLastName(doctorLastName)
                .setDoctorWorkNumber(doctorWorkNumber)
                .setDoctorEmailAddress(doctorEmailAddress)
                .setDoctorSpecialization(doctorSpecialization)
                .build();
    }
}
