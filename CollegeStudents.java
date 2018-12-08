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

    @Override
    public String toString() {
        String str = "";

        return str;
    }

    public static void test() {
        
        CollegeStudents students =  new CollegeStudents();
        
        College chip = new College("950666666", "Chip", "Kettle", 19, 12, 1988, Sex.MALE, 15);
        College mrPib = new College("666666666", "Mister", "Pib", 1, 11, 1989, Sex.MALE, 0);
        College doctorPepper = new College("123456789", "Dr", "Pepper", 19, 12, 1988, Sex.FEMALE, 13);
        
        students.add(chip);
        students.add(mrPib);
        students.add(doctorPepper);
    }
}
