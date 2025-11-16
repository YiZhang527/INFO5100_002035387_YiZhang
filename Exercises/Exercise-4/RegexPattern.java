import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexPattern {
    public static void testEmailPattern() {
        String pattern1 = "^[A-Za-z0-9_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,3}$";
        Pattern emailPattern = Pattern.compile(pattern1);
        String positiveMatch = "zoe5@gmail.com";
        String negativeMatch = "jjgd.gmail.com";
        System.out.println("Email Pattern: " + pattern1);
        System.out.println(positiveMatch + ": " + emailPattern.matcher(positiveMatch).matches());
        System.out.println(negativeMatch + ": " + emailPattern.matcher(negativeMatch).matches());
        System.out.println();
    }

    public static void testPhonePattern() {
        String pattern1 = "^[0-9]{10}$";
        Pattern phonePattern = Pattern.compile(pattern1);
        String positiveMatch = "0123456789";
        String negativeMatch = "013456789";
        System.out.println("Phone Pattern: " + pattern1);
        System.out.println(positiveMatch + ": " + phonePattern.matcher(positiveMatch).matches());
        System.out.println(negativeMatch + ": " + phonePattern.matcher(negativeMatch).matches());
        System.out.println();
    }

    public static void testDatePattern() {
        String pattern1 ="^[0-9]{4}/(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])$";
        Pattern datePattern = Pattern.compile(pattern1);
        String positiveMatch = "1970/01/01";
        String negativeMatch = "1970-01-01";
        System.out.println("Date Pattern: " + pattern1);
        System.out.println(positiveMatch + ": " + datePattern.matcher(positiveMatch).matches());
        System.out.println(negativeMatch + ": " + datePattern.matcher(negativeMatch).matches());
        System.out.println();
    }

    public static void testZipCodePattern() {
        String pattern1 = "^[0-9]{5}(-[0-9]{4})?$";
        Pattern zipCodePattern = Pattern.compile(pattern1);
        String positiveMatch = "12345-6789";
        String negativeMatch = "123456789";
        System.out.println("Zip Code Pattern: " + pattern1);
        System.out.println(positiveMatch + ": " + zipCodePattern.matcher(positiveMatch).matches());
        System.out.println(negativeMatch + ": " + zipCodePattern.matcher(negativeMatch).matches());
        System.out.println();
    }

    public static void testPasswordPattern() {
        String pattern1 = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])[A-Za-z0-9]{8,20}$";
        Pattern passwordPattern = Pattern.compile(pattern1);
        String positiveMatch = "Yojkl6789";
        String negativeMatch = "123456789";
        System.out.println("Password Pattern: " + pattern1);
        System.out.println(positiveMatch + ": " + passwordPattern.matcher(positiveMatch).matches());
        System.out.println(negativeMatch + ": " + passwordPattern.matcher(negativeMatch).matches());
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println();
        testEmailPattern();
        testPhonePattern();
        testDatePattern();
        testZipCodePattern();
        testPasswordPattern();
    }
}
