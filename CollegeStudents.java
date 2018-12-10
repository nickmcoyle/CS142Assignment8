import java.util.ArrayList;

/**
 * A wrapper class for a collection of Students of type College.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public class CollegeStudents
{
    private ArrayList<College> collegeStudents;

    public CollegeStudents() {
        collegeStudents = new ArrayList<College>();
    }

    public void add(College collegeStudent) {
        collegeStudents.add(collegeStudent);
    }

    public void remove(int index) {
        if(index < 0 || index > collegeStudents.size()) {
            throw new IllegalArgumentException("invalid index passed to remove method in CollegeStudents class");
        }

        collegeStudents.remove(index);
    }

    public int isFound(String id) {
        int index = -1;
        int size = collegeStudents.size();

        for(int i = 0; i < size; ++i) {
            if (collegeStudents.get(i).getID().equals(id)) {
                index = i;
            }
        }

        return index;
    }

    public int getFullTime() {
        int fullTime = 0;

        for(College student : collegeStudents) {
            if (student.getCredits() >= Student.FULLTIME_CREDITS) ++fullTime;
        }

        return fullTime;
    }

    public int size() {
        return collegeStudents.size();
    }

    @Override
    public String toString() {
        String str = "";
        str += collegeStudents.get(0).toString();
        int size = this.size();
        
        for(int i = 1; i < size; ++i) {
            str += ", " + collegeStudents.get(i).toString();
        }
        
        return str;
    }

    public static void test() {

        CollegeStudents students =  new CollegeStudents();

        College chip = new College("950666666", "Chip", "Kettle", 19, 12, 1988, Sex.MALE, 15);
        College mrPib = new College("666666666", "Mister", "Pib", 1, 11, 1989, Sex.MALE, 0);
        College doctorPepper = new College("123456789", "Dr", "Pepper", 19, 12, 1988, Sex.FEMALE, 13);

        if(students.getFullTime() != 0) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 0");
        if(students.size() != 0) System.out.println("students.size() is " + students.size() + " but should be 0");
        if(students.isFound("950666666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.add(chip);
        if(students.getFullTime() != 1) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 1");
        if(students.size() != 1) System.out.println("students.size() is " + students.size() + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be 0");
        if(students.isFound("8506dsg666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.add(mrPib);
        if(students.getFullTime() != 1) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 1");
        if(students.size() != 2) System.out.println("students.size() is " + students.size() + " but should be 2");
        if(students.isFound("666666666") != 1) System.out.println("students.isFound(\"666666666\") returned" + students.isFound("666666666") + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");        
        if(students.isFound("9rfgag6666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.add(doctorPepper);
        if(students.getFullTime() != 2) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 2");
        if(students.size() != 3) System.out.println("students.size() is " + students.size() + " but should be 3");
        if(students.isFound("123456789") != 2) System.out.println("students.isFound(\"123456789\") returned" + students.isFound("123456789") + " but should be 2");
        if(students.isFound("950eGED66") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        //students.remove(3); //throws exception
        students.remove(2); 
        if(students.getFullTime() != 1) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 1");
        if(students.size() != 2) System.out.println("students.size() is " + students.size() + " but should be 2");
        if(students.isFound("666666666") != 1) System.out.println("students.isFound(\"666666666\") returned" + students.isFound("666666666") + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");        
        if(students.isFound("9rfgag6666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.remove(1);         
        if(students.getFullTime() != 1) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 1");
        if(students.size() != 1) System.out.println("students.size() is " + students.size() + " but should be 1");
        if(students.isFound("950666666") != 0) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be 0");
        if(students.isFound("8506dsg666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

        students.remove(0);
        if(students.getFullTime() != 0) System.out.println("students.getFullTime() is " + students.getFullTime() + " but should be 0");
        if(students.size() != 0) System.out.println("students.size() is " + students.size() + " but should be 0");
        if(students.isFound("950666666") != -1) System.out.println("students.isFound(\"950666666\") returned" + students.isFound("950666666") + " but should be -1");

    }
}
