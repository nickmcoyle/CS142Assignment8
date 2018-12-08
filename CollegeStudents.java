import java.util.ArrayList;

/**
 * Write a description of class CollegeStudents here.
 *
 * @author Nick Coyle
 * @version 12/10/2018
 */
public class CollegeStudents
{
    private ArrayList<College> collegeStudents;

    public CollegeStudents() {

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

}
