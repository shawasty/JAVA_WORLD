import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher nana = new Teacher (1,"Nana", 7000);
        Teacher kwam = new Teacher (2,"Kwam", 8000);
        Teacher kofi = new Teacher (3,"Kofi", 6000);

        Student sara = new Student (1,"Sara", 4);
        Student gerg = new Student (2,"Georgette", 12);
        Student mac = new Student (3,"Macario", 8);

        List <Teacher> teacherList = new ArrayList<>();
        teacherList.add(nana);
        teacherList.add(kwam);
        teacherList.add(kofi);

        List <Student> studentList = new ArrayList<>();
        studentList.add(sara);
        studentList.add(gerg);
        studentList.add(mac);

        School ghs = new School(teacherList,studentList);

        System.out.println("Hello, World!" + sara.getName());
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        sara.payFees(5000);

        System.out.println("Sara has paid $" + sara.payFees(5000));

    }
}
