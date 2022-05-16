package utils;

public class Date {
    public static boolean validateDate(String date) {
        return date.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    // DEBUG PURPOSES ONLY
    // public static void main(String[] args) {
    // String test = "12/12/1000";
    // System.out.println(test.matches("^\\d{2}/\\d{2}/\\d{4}$"));
    // }
}
