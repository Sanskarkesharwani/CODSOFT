import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Student{
    private int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade){
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public int getRollNumber(){
        return rollNumber;
    }

    public void setRollNumber(int rollNumber){
        this.rollNumber = rollNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGrade(){
        return grade;
    }

    public void setRollNumber(String grade){
        this.grade = grade;
    }


    public String toString(){
        return "Roll Number: " + rollNumber + ", Name: " + name+ ", Grade: " + grade;
    }
}

class StudentManagementSystem{
    private List<Student> students;

    public StudentManagementSystem(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void removeStudent(int rollNumber){
        students.removeIf(student -> student.getRollNumber() == rollNumber);
    }

    public Student searchStudent(int rollNumber){
        for(Student student : students){
            if(student.getRollNumber() == rollNumber){
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents(){
        for(Student student : students){
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while(true){
            System.out.println("1. Add Student");
            System.out.println("2. Remove");
            System.out.println("3. Search");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Roll Number: ");
                    int rollNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Name: ");
                    String name = sc.next();

                    System.out.println("Enter Grade: ");
                    String grade = sc.next();

                    Student newStudent = new Student(rollNumber, name, grade);

                    sms.addStudent(newStudent);
                    break;
                
                case 2:
                    System.out.println("Enter the roll number of the student to remove: ");   
                    int rNR = sc.nextInt();
                    sms.removeStudent(rNR);
                    break; 
            
                case 3:
                    System.out.println("Enter the roll number of the student to search: ");   
                    int rNS = sc.nextInt();
                    
                    Student searchedStudent = sms.searchStudent(rNS);

                    if (searchedStudent != null) {
                        System.out.println("Student Found: " + searchedStudent);
                    }else{
                        System.out.println("Student not found.");
                    }
                    break; 
                  
                case 4: 
                    sms.displayAllStudents();
                    break;
                    
                case 5:
                    System.out.println("Exiting");
                    System.out.println("Thanks!");
                    sc.close();
                    System.exit(0);
                    break; 

                default:
                    System.out.println("Invalid choice.Please try again.");
            }
        }
    }
}