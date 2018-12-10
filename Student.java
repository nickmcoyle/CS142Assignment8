
/**
 * An abstract class to model a Student. A full time student is taking 13 credits or more. ID must be 9 digits.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public abstract class Student implements Person
{
    public static final int FULLTIME_CREDITS = 13;

    private String firstName;
    private String lastName;
    private String ID;
    private Sex sex;

    private int day;
    private int month;
    private int year; 
    
    private int numCredits;

    public Student(String id, String first, String last, int day, int month, int year, Sex sex, int numCredits) {
        setID(id);
        setFirstName(first);
        setLastName(last);
        setDay(day);
        setMonth(month);
        setYear(year);
        setSex(sex);
        setCredits(numCredits);
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public Sex getSex() {
        return sex;
    }

    @Override
    public int getDay() {
        return day;
    }

    @Override
    public int getMonth() {
        return month;
    }

    @Override
    public int getYear() {
        return year;
    }

    public void setCredits(int numCredits) {
        if(numCredits < 0 || numCredits > 30) {
            throw new IllegalArgumentException("Number of credits must be between 0 and 30");
        }

        this.numCredits = numCredits;   
    }

    public int getCredits() {
        return numCredits;
    }

    @Override
    public void setFirstName(String firstName) {
        if(firstName.isEmpty()) {
            throw new IllegalArgumentException("Firstname cannot be empty");
        }

        this.firstName = firstName;
    }

    @Override
    public void setLastName(String lastName) {
        if(lastName.isEmpty()) {
            throw new IllegalArgumentException("Lastname cannot be empty");
        }

        this.lastName = lastName;
    }

    @Override
    public void setID(String id) {
        if(!id.matches("[0-9]{9}")) {
            throw new IllegalArgumentException("ID is not valid, must be 9 digits");
        }

        this.ID = id;
    }

    @Override
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public void setDay(int day) {
        if(day < 0 || day > 31) {
            throw new IllegalArgumentException("Day must be a valid calendar day");
        }

        this.day = day;
    }

    @Override
    public void setMonth(int month) {
        if(month < 0 || month > 12) {
            throw new IllegalArgumentException("Month must be a valid calendar month");
        }

        this.month = month;
    }

    @Override
    public void setYear(int year) {
        if(year < 0 || year > 2019) {
            throw new IllegalArgumentException("Year must be a valid calendar year");
        }

        this.year = year;
    }

    public abstract double getPrice();

    @Override
    public String toString() {
        String str = "Student: ";
        str += lastName + ", " + firstName + " ID: " + ID + ", " + sex + ", ";
        str += "DOB: " + month + "/" + day + "/" + year + ", ";
        str += numCredits + " credits" + " ";
        return str;
    }
}
