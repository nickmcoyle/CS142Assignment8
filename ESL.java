
/**
 * A class to represent an ESL English as a Second Language student. The ESL student only takes 5 credits and tuition always costs $25.0.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public class ESL extends Student
{   
    private static final int CREDITS = 5;
    private static final double ESL_PRICE = 25.0;

    private Level level;
    
    public ESL(String id, String first, String last, int day, int month, int year, Sex sex, Level level) {
        super(id, first, last, day, month, year, sex, CREDITS);
        setLevel(level);
    }
    
    public Level getLevel() {
        return level;
    }
    
    public void setLevel(Level level) {
        this.level = level;
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
        
    }
}
