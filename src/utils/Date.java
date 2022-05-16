package utils;

public class Date {
    public static boolean validateDate(String date) {
        return date.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }
}
