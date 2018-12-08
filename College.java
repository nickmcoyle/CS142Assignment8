
/**
 * Write a description of class College here.
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
        String str = "";
        
        return str;
    }
}
