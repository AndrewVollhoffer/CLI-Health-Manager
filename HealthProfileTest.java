import java.util.Scanner;

public class HealthProfileTest {
    
    public static void main(String [] args) {

        //CREATE A SCANNER TO GATHER KEYBOARD INPUT
        Scanner input = new Scanner(System.in);
        //CREATE A USER OBJECT
        HealthProfile userProfile = new HealthProfile("First", "Last", "Gender", 0, 0, 0, 0, 0, 0, 0.0, 0, 0, 0);

        //START VARIABLE SETTING FOR USER INFORMATION
        //FIRST NAME SETTING
        System.out.printf("%nLet's setup your health info sheet together. %nEnter your first name: ");
        String firstName = input.nextLine();
        userProfile.setFirstName(firstName);

        //LAST NAME SETTING
        System.out.printf("%nEnter your last name: ");
        String lastName = input.nextLine();
        userProfile.setLastName(lastName);

        //GENDER SETTING
        System.out.printf("%nEnter your gender: ");
        String gender = input.nextLine();
        userProfile.setGender(gender);
        
        //BIRTH YEAR SETTING
        System.out.printf("%nNow let's add your birthday info. %nEnter your birth year: ");
        int birthYear = input.nextInt();
        userProfile.setBirthYear(birthYear);

        //BIRTH MONTH SETTING
        System.out.printf("%nNow enter your birth month as a number value: ");
        int birthMonth = input.nextInt();
        userProfile.setBirthMonth(birthMonth);

        //BIRTH DAY SETTING
        System.out.printf("%nLastly, enter your birth day: ");
        int birthDay = input.nextInt();
        userProfile.setBirthDay(birthDay);

        //HEIGHT SETTING
        System.out.printf("%nFinally, let's enter your height in inches and weight in pounds. %nHeight: ");
        int height = input.nextInt();
        userProfile.setHeight(height);
        System.out.printf("%nWeight: ");
        int weight = input.nextInt();
        userProfile.setWeight(weight);
        
        //START CALCULATIONS
        userProfile.calculateAge();
        userProfile.calculateBMI();
        userProfile.calculateMaxRate();
        userProfile.calculateTargetHeartRateLow();
        userProfile.calculateTargetHeartRateHigh();

        //OUTPUT ALL THE INTERPRETED INFORMATION TO THE USER
        System.out.printf("%nBelow is your health information sheet.%n");
        System.out.printf("%nName: %s %s", userProfile.getFirstName(), userProfile.getLastName() );
        System.out.printf("%nGender: %s", userProfile.getGender() );
        System.out.printf("%nBorn: %d/%s/%d", userProfile.getBirthDay(), userProfile.getBirthMonth(), userProfile.getBirthYear());
        System.out.printf("%nHeight: %d inches | Weight: %d lbs", userProfile.getHeight(), userProfile.getWeight());
        System.out.printf("%nAge: %d %nBMI: %.2f %nMax Heart Rate: %d %nTarget Heart Rate Range: %d - %d", userProfile.getAge(),
            userProfile.getBMI(), userProfile.getMaxRate(), userProfile.getTargetRateLow(), userProfile.getTargetRateHigh() );
        
        System.out.printf("%n%nBMI Categories: ");
        System.out.printf("%nUnderweight = < 18.5");
        System.out.printf("%nNormal weight = 18.5 - 24.9");
        System.out.printf("%nOverweight = 25 - 29.9");           
        System.out.printf("%nObesity = BMI of 30 or greater");          
    }
}