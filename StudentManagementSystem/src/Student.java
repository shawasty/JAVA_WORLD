/* 
Created by Godbless Amankwah
This class is responsible for keeping 
track of Students records
 */

 public class Student {

     private int id;
     private String name;
     private int grade;
     private int feesPaid;
     private int feesTotal;

        /**
        create the constructor of the class
        this is to create a new student object
        */

    public Student (int id, String name,  int grade){
    /**
    This is to initialize the different variables
     */

     this.id = id;
     this.name = name;
     //this.grade = grade;
     this.feesPaid = 0;
     this.feesTotal = 10000;
    }

    // Not going to alter student's name.], student's id

    /**
    *Use the below to update the student's grade
    */

    public void setGrade (int grade){
        this.grade = grade;

    }

    /** Keep adding the fees
    *Add the fees to the fees paid
    * */

    public void payFees (int fees){
        feesPaid += fees;
    }
    
    public String getName(){
        return name;
    }

    public int getGrade(){
        return grade;
    }

    public int getFeesPaid(){
        return feesPaid;
    }

    public int getFeesTotal(){
        return feesTotal;
    }
    /**
    return the remaining fees */
    public int getRemainingFees(){
        return feesTotal - payFees;
    }



 }