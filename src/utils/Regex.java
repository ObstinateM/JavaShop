package utils;

public class Regex {
    public static boolean validateDate(String date) {
        return date.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    public static boolean validateName(String name) {
        return name.matches("^[a-zA-Z ]+$");
    }

    public static boolean validateNumber(String number) {
        return number.matches("^[0-9]+$");
    }

    public static boolean validateLettersAndNumbers(String s) {
        return s.matches("^[a-zA-Z0-9 ]+$");
    }

    public static boolean validateDouble(String number) {
        return number.matches("^[0-9]+(\\.[0-9]{1,2})?$");
    }
}
