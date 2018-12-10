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

    public int size() {
        return ESLStudents.size();
    }

    @Override
    public String toString() {
        String str = "";
        str += ESLStudents.get(0).toString();
        int size = this.size();

        for(int i = 1; i < size; ++i) {
            str += ", " + ESLStudents.get(i).toString();
        }

        return str;
    }

    public static void test() {

        ESLStudents students =  new ESLStudents();

        ESL chip = new ESL("950666666", "Chip", "Kettle", 19, 12, 1988, Sex.MALE, Level.ESL1A);
        ESL mrPib = new ESL("666666666", "Mister", "Pib", 1, 11, 1989, Sex.MALE, Level.ESL1B);
        ESL doctorPepper = new ESL("123456789", "Dr", "Pepper", 19, 12, 1988, Sex.FEMALE, Level.ESL2A);

        if(students.size() != 0) System.out.println("students.size() is " + students.size() + " but should be 0");
        if(students.isFound("950666666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.add(chip);        
        if(students.size() != 1) System.out.println("students.size() is " + students.size() + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be 0");
        if(students.isFound("8506dsg666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.add(mrPib);        
        if(students.size() != 2) System.out.println("students.size() is " + students.size() + " but should be 2");
        if(students.isFound("666666666") != 1) System.out.println("students.isFound(\"666666666\") returned" + students.isFound("666666666") + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");        
        if(students.isFound("9rfgag6666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.add(doctorPepper);        
        if(students.size() != 3) System.out.println("students.size() is " + students.size() + " but should be 3");
        if(students.isFound("123456789") != 2) System.out.println("students.isFound(\"123456789\") returned" + students.isFound("123456789") + " but should be 2");
        if(students.isFound("950eGED66") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        //students.remove(3); //throws exception
        students.remove(2);         
        if(students.size() != 2) System.out.println("students.size() is " + students.size() + " but should be 2");
        if(students.isFound("666666666") != 1) System.out.println("students.isFound(\"666666666\") returned" + students.isFound("666666666") + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");        
        if(students.isFound("9rfgag6666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.remove(1);                 
        if(students.size() != 1) System.out.println("students.size() is " + students.size() + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be 0");
        if(students.isFound("8506dsg666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.remove(0);
        if(students.size() != 0) System.out.println("students.size() is " + students.size() + " but should be 0");
        if(students.isFound("950666666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

    }
}
