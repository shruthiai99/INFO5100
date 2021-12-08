package neu_psa.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DrivingLicenseApplication {

    public static void main(String[] args) throws ParseException {
        // write your code here
        try {
        Scanner s = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.print("Enter ur Date of birth in mm/dd/yyyy :: ");

        String dob = s.nextLine();
        LocalDate birthdate = LocalDate.parse(dob,dtf);
        LocalDate now = LocalDate.now();
        int age = Period.between(birthdate, now).getYears();


            if( age < 16)
                throw new AgeException("The age of the applicant is "+age+ " which is too early to apply for a driving license");
        }
        catch (AgeException a) {
            System.out.println(a);
        }
    }
}
