
/**
 * A class to represent an ESL English as a Second Language student. The ESL student only takes 5 credits and tuition always costs $25.0.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public class ESL extends Student
{   
    private static final int ESL_CREDITS = 5;
    private static final double ESL_PRICE = 25.0;
   
    private Level level;
    
    public ESL(String id, String first, String last, int day, int month, int year, Sex sex, Level level) {
        super(id, first, last, day, month, year, sex, ESL_CREDITS);         
        setLevel(level);
    }
    
    public Level getLevel() {
        return level;
    }
    
    public void setLevel(Level level) {
        this.level = level;
    }
        
    @Override
    public void setCredits(int numCredits) {       
        super.setCredits(ESL_CREDITS);
    }
    
    @Override 
    public double getPrice() {
        return ESL_PRICE;
    }
       
    @Override
    public String toString() {
        String str = super.toString();
        str += "Type: ESL Student" + " ";        
        return str;
    }
    
    public static void test() {
        //ESL1A, ESL1B, ESL2A, ESL2B, ESL3A, ESL3B, ESL4A, ESL4B, ESL5A, ESL5B, ESL6A, ESL6B
        ESL chip = new ESL("950666666", "Chip", "Kettle", 19, 12, 1988, Sex.MALE, Level.ESL1A);
        ESL mrPib = new ESL("666666666", "Mister", "Pib", 1, 11, 1989, Sex.MALE, Level.ESL1B);
        ESL doctorPepper = new ESL("123456789", "Dr", "Pepper", 19, 12, 2001, Sex.FEMALE, Level.ESL2A);
        
        if(chip.getFirstName() != "Chip") System.out.println("chip.getFirstName() should \"Chip\" be but is " + chip.getFirstName());
        if(chip.getLastName() != "Kettle") System.out.println("chip.getLastName() should be but is " + chip.getLastName());
        if(chip.getID() != "950666666") System.out.println("chip.getID() should be \"950666666\" but is " + chip.getID());
        if(chip.getSex() != Sex.MALE) System.out.println("chip.getSex() should be Sex.MALE but is " + chip.getSex());
        if(chip.getDay() != 19) System.out.println("chip.getDay() should be but is " + chip.getDay());
        if(chip.getMonth() != 12) System.out.println("chip.getMonth() should be but is " + chip.getMonth());
        if(chip.getYear() != 1988) System.out.println("chip.getYear() should be but is " + chip.getYear());
        
        if(chip.getLevel() != Level.ESL1A) System.out.println("chip.getLevel() should be Level.ESL1A but is " + chip.getLevel());
        if(mrPib.getLevel() != Level.ESL1B) System.out.println("mrPib.getLevel() should be Level.ESL1B but is " + mrPib.getLevel());
        if(doctorPepper.getLevel() != Level.ESL2A) System.out.println("doctorPepper.getLevel() should Level.ESL2A be but is " + doctorPepper.getLevel());
        
        chip.setLevel(Level.ESL6B);
        if(chip.getLevel() != Level.ESL6B) System.out.println("chip.getLevel() should be Level.ESL6B but is " + chip.getLevel());
        
        if(chip.getPrice() != 25.0) System.out.println("chip.getPrice() should be 25.0 but is " + chip.getPrice());
        if(mrPib.getPrice() != 25.0) System.out.println("mrPib.getPrice() should be 25.0 but is " + mrPib.getPrice());
        if(doctorPepper.getPrice() != 25.0) System.out.println("doctorPepper.getPrice() should be 25.0 but is " + doctorPepper.getPrice());
 
        chip.setCredits(15); //will not change it to 15, can only ever be 5 for ESL students
        if(chip.getCredits() != 5) System.out.println("chip.getCredits() should be 5 but is " + chip.getCredits());

        
    }
}
