package za.ac.cput.util;

import java.util.UUID;
import java.util.Random;

public class Helper {
    public static boolean isNullOrEmpty(String s){
        if (s == null || s.isEmpty())
            return true;
        return false;
    }

    public static boolean isNullOrZero(Integer i) {
        return i == null || i == 0;
    }

    public static String generateId(){return UUID.randomUUID().toString();
    }
    public static int generateInvoiceNumber() {
        Random random = new Random();
        return random.nextInt(10000) + 1;
    }
}
