import java.time.LocalDate;

public class HealthProfile {
    
    LocalDate currentDate = LocalDate.now();

    //INSTANCE VARIABLES
    private String firstName;
    private String lastName;
    private String gender;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int height;
    private int weight;
    private int age;
    private double bmi;
    private int maxRate;
    private int targetRateLow;
    private int targetRateHigh;
    public int currentYear;

    //CONSTRUCTOR
    public HealthProfile(String firstName, String lastName, String gender, int birthYear, int birthMonth, int birthDay, 
        int height, int weight, int age, double bmi, int maxRate, int targetRateLow, int targetRateHigh) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.bmi = bmi;
        this.maxRate = maxRate;
        this.targetRateLow = targetRateLow;
        this.targetRateHigh = targetRateHigh;
    }

    /*---------------------------SET AND GET METHODS----------------------*/

    //SET & GET FIRST NAME
    //SET
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    //GET
    public String getFirstName() {
        return firstName;
    }

    //SET & GET LAST NAME
    //SET
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //GET
    public String getLastName() {
        return lastName;
    }

    //SET & GET GENDER
    //SET
    public void setGender(String gender) {
        this.gender = gender;
    }
    //GET
    public String getGender() {
        return gender;
    }

    //SET & GET BIRTH YEAR
    //SET
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    //GET
    public int getBirthYear() {
        return birthYear;
    }

    //SET & GET BIRTH MONTH
    //SET
    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }
    //GET
    public int getBirthMonth() {
        return birthMonth;
    }

    //SET & GET BIRTH DAY
    //SET
    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }
    //GET
    public int getBirthDay() {
        return birthDay;
    }

    //SET & GET HEIGHT
    //SET
    public void setHeight(int height) {
        this.height = height;
    }
    //GET
    public int getHeight() {
        return height;
    }

    //GET & SET WEIGHT
    public void setWeight(int weight) {
        this.weight = weight;
    }
    //GET
    public int getWeight() {
        return weight;
    }

    /*-----------------------CALCULATION METHODS-------------------*/

    //CALCULATE & GET AGE METHODS
    //CALCULATE USING THE LOCALDATE IMPORT METHOD FOR THE CURRENT YEAR TO USE DURING SUBTRACTION
    public void calculateAge() {
        currentYear = currentDate.getYear();
        this.age = currentYear - birthYear;
    }
    //GET AGE
    public int getAge() {
        return age;
    }

    //CALCULATE & GET BMI
    //CALCULATE USING THE BMI VALUES CHART FROM AHA
    public void calculateBMI() {
        this.bmi = (weight * 703) / (height * height);
    }
    public double getBMI() {
        return bmi;
    }
    
    //CALCULATE & GET MAX HEART RATE 
    //CALCULATED BASED ON AGE IN YEARS USING AHA FORMULA
    public void calculateMaxRate() {
        this.maxRate = 220 - age;
    }
    //GET
    public int getMaxRate() {
        return maxRate;
    }

    //CALCULATE & GET TARGET HEART RATES
    //CALCULATED FROM AHA WHICH IS 50 - 85% OF MAX HEART RATE
    //LOW
    public void calculateTargetHeartRateLow() {
        this.targetRateLow = ((maxRate * 50) / 100);
    }
    public int getTargetRateLow() {
        return targetRateLow;
    }
    //HIGH
    public void calculateTargetHeartRateHigh() {
        this.targetRateHigh = ((maxRate * 85) / 100);
    }
    public int getTargetRateHigh() {
        return targetRateHigh;
    }
}