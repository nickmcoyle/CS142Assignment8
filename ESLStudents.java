import java.util.ArrayList;

/**
 * A wrapper class for a collection of Students of type ESL.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public class ESLStudents
{
    private ArrayList<ESL> ESLStudents;
    
    public ESLStudents() {
        ESLStudents = new ArrayList<ESL>();
    }
    
    public void add(ESL ESLStudent) {
        ESLStudents.add(ESLStudent);
    }
    
    public void remove(int index) {
        if(index < 0 || index > ESLStudents.size()) {
            throw new IllegalArgumentException("invalid index passed to remove method in CollegeStudents class");
        }

        ESLStudents.remove(index);
    }
    
    public int isFound(String id) {
        int index = -1;
        int size = ESLStudents.size();

        for(int i = 0; i < size; ++i) {
            if (ESLStudents.get(i).getID().equals(id)) {
                index = i;
            }
        }

        return index;
    }
    
    @Override
    public String toString() {
        String str = "";
        
        return str;
    }
    
    public static void test() {
        
    }
}
