/**
*This creates a School and its descriptions
* A school can have multiple teachers and multiple students
*implement Teac
*/
import java.util.List;

public class School {

    private List <Teacher> teachers;
    private List <Student>  students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
    *New School Object is created
    */

    public School (List<Teacher> teachers, List <Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned =0;
        totalMoneySpent = 0;

    }

    /**
    * the following code snippets will create getters and setters 
    */

    public List<Teacher> getTeachers(){
        return teachers;
    }

    //the below will add teacher to the school

    public void addTeacher (Teacher teacher){
        teachers.add(teacher);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudents (Student student){
        students.add(student);
    }
    
    public int getTotalMoneyEarned (){
        return totalMoneyEarned;
    }

    public void updateTotalMoneyEarned (int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }

    public int getTotalMoneySpent(){
        return totalMoneyEarned;
    }
    
    /**In this instance
    * only the salary will be considered as money spent
    */

    public void updateTotalMoneySpent (int moneySpent){
        totalMoneySpent -= moneySpent;
    }


}