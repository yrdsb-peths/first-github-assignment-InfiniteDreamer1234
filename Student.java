public class StudentTester extends ConsoleProgram
{
    public void run()
    {
        // Student is the name of the class
        
        // These variables named `alan` and `ada` are
        // objects, or "instances of the class"
        Student alan = new Student("Alan", "Turing", 11);
        Student ada = new Student("Ada", "Lovelace", 12);
        
        System.out.println(alan);
        System.out.println(ada);
    }
}

public class Student
{
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private int percent
    
    public Student(String fName, String lName, int grade , int thePercent)
    {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
        percent = thePercent;
    }
    
    public String toString()
    {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}
