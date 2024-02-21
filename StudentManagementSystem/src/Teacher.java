/**This class is responsible 
* for keeping track of teacher records */

public class Teacher {
    private int id;
    private String name;
    private int salary;

    /**
    * This constructor creates a new Object of the teacher */
    public Teacher (int id, String name, int salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;

    }

    /**
    *the next getters will return the 
    *name, id , and salariesof the Teacher
     */

     public int getId(){
         return id;
     }

     public String getName(){
         return name;
     }
     public int getSalary(){
         return salary;
     }



}