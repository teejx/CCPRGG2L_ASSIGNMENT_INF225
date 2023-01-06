import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Firstactivity {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your phone number: ");
        String phoneNum = scan.nextLine();


        Pattern pattern = Pattern.compile("09\\d{9}");
        Matcher matcher = pattern.matcher(phoneNum);

        boolean match = matcher.matches();

        if (match) {
            System.out.println("valid phone number");
        } else {
            System.out.println("invalid phone number");
        }
        System.out.print("Enter your student email: ");
        String emailAdd = scan.nextLine();
        String regex = "\\w+@students.national-u.edu.ph";
        
        Pattern pattern1 = Pattern.compile(emailAdd);
        Matcher matcher1 = pattern.matcher(regex);
        if (matcher.matches()) {
            System.out.println("valid email address");
        } else {
            System.out.println("invalid email address");
        }
    }
}
