package Test_Practice_10th_feb2026;

public class Student {

    String name;
    int rollNo;
    char section;

    //Constructor
    public Student(String name,int rollNo,char section){
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }
    // Method to print student details
    public void printDetails(){
        System.out.println("Student: " + name + " Roll No: " + rollNo + " section: " + section);


    }
}
class main{
    public static void main(String[] args){
        Student student1 = new Student("hot", 101, 'A');
        student1.printDetails();
    }
}
