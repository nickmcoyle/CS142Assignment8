
public class Main
{
    public static void main(String[] args) {
        ESL.test();
        College.test();
        ESLStudents.test();
        CollegeStudents.test();
        
        
        // Testing toString();         
        College chip = new College("950666666", "Chip", "Kettle", 19, 12, 1988, Sex.MALE, 15);
        College mrPib = new College("666666666", "Mister", "Pib", 1, 11, 1989, Sex.MALE, 0);
        College doctorPepper = new College("123456789", "Dr", "Pepper", 19, 12, 1988, Sex.FEMALE, 13);
        
        System.out.println("College Students:");
        System.out.println(chip);
        System.out.println(mrPib);
        System.out.println(doctorPepper);
        System.out.println();
        
        CollegeStudents students = new CollegeStudents();
        students.add(chip);
        students.add(mrPib);
        students.add(doctorPepper);
        System.out.println("Printing College Students list:");
        System.out.println(students);
        System.out.println();
        
        ESL glen = new ESL("950666666", "Glen", "Tennis", 19, 12, 1908, Sex.MALE, Level.ESL1A);
        ESL jan = new ESL("666666666", "Jan", "Skylar", 1, 11, 1989, Sex.FEMALE, Level.ESL1B);
        ESL wayne = new ESL("123456789", "Wayne", "Skylar", 19, 12, 2001, Sex.MALE, Level.ESL2A);
        System.out.println();
        
        System.out.println("ESL Students:");
        System.out.println(glen);
        System.out.println(jan);
        System.out.println(wayne);
        System.out.println();
        
        ESLStudents ESLs = new ESLStudents();
        ESLs.add(glen);
        ESLs.add(wayne);
        ESLs.add(jan);
        System.out.println("Printing ESLStudents list:");
        System.out.println(ESLs);
        System.out.println();
    }
}
