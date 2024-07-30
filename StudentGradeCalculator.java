import java.util.Scanner;
public class StudentGradeCalculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Student Grade Calculator");
        System.out.println("Enter number of subjects");
        int totalSubjects = sc.nextInt();
        int total = 0;
        for(int i=0;i<totalSubjects;i++){
            System.out.println("Enter marks obtained in the subject "+(i+1)+ ": ");
            int marks=sc.nextInt();
	        total+=marks;
	    }
	    double averageP=(double)total/totalSubjects;
	    char Grade;
	    if(averageP>=90){
	        Grade='A';
	    }
	    else if(averageP>=80){
	        Grade='B';
	    }
	    else if(averageP>=70){
	        Grade='C';
	    }
	    else if(averageP>=40){
	        Grade='D';
	    }
	    else{
	        Grade='F';
	    }
	    System.out.println("Total marks scored in class is : "+total);
	    System.out.println("Average percentage gained in class is : "+averageP +"%");
	    System.out.println(" Your Grade is :"+Grade);

    }
}
