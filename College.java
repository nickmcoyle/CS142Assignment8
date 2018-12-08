
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
    }
}
