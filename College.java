
/**
 * A class to represent a College student. The college student may take up to 30 credits. Each credit costs $110.0 each. 
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public class College extends Student
{
    public static final double PRICE_CREDIT = 110.0;    
    
    
    public College(String id, String first, String last, int day, int month, int year, Sex sex, int numCredits) {
        super(id, first, last, day, month, year, sex, numCredits);        
    }    
    
    @Override
    public double getPrice() {
        return getCredits() * PRICE_CREDIT;
    }
    
    @Override
    public String toString() {        
        String str = super.toString();
        str += "Type: College Student" + " ";        
        return str;
    }
    
    public static void test() {
        College chip = new College("950666666", "Chip", "Kettle", 19, 12, 1988, Sex.MALE, 15);
        College mrPib = new College("666666666", "Mister", "Pib", 1, 11, 1989, Sex.MALE, 0);
        College doctorPepper = new College("123456789", "Dr", "Pepper", 19, 12, 1988, Sex.FEMALE, 13);    
        
        if(chip.getFirstName() != "Chip") System.out.println("chip.getFirstName() should \"Chip\" be but is " + chip.getFirstName());
        if(chip.getLastName() != "Kettle") System.out.println("chip.getLastName() should be but is " + chip.getLastName());
        if(chip.getID() != "950666666") System.out.println("chip.getID() should be \"950666666\" but is " + chip.getID());
        if(chip.getSex() != Sex.MALE) System.out.println("chip.getSex() should be Sex.MALE but is " + chip.getSex());
        if(chip.getDay() != 19) System.out.println("chip.getDay() should be but is " + chip.getDay());
        if(chip.getMonth() != 12) System.out.println("chip.getMonth() should be but is " + chip.getMonth());
        if(chip.getYear() != 1988) System.out.println("chip.getYear() should be but is " + chip.getYear());
        
        if(chip.getPrice() != 1650.0) System.out.println("chip.getPrice() should be Level.ESL6B be 1650.0 but is " + chip.getPrice());
        if(mrPib.getPrice() != 0.0) System.out.println("mrPib.getPrice() should be Level.ESL6B be 0.0 but is " + mrPib.getPrice());
        if(doctorPepper.getPrice() != 1430.0) System.out.println("doctorPepper.getPrice() should be Level.ESL6B be 1430.0 but is " + doctorPepper.getPrice());
    }
}
