import java.util.Scanner;

class Student {
    private String studentID;
    private String studentName;
    private int[] marks;

    Scanner sc = new Scanner(System.in);

    public Student(String studentID, String studentName) {
        this.studentID=studentID;
        this.studentName=studentName;
        marks = new int[5];
    }
    public String getStudentID() {
        return studentID;
    }
    public void setStudentID(String studentID) {
        this.studentID=studentID;
    }
    public String getStudentName() {
        return studentName;
    }
    public void SetStudentName(String studentName) {
        this.studentName=studentName;
    }
    public void setMarks() {
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter subject "+(i+1)+" marks: ");
            marks[i]=sc.nextInt();
        }
    }
    public void getMarks() {
        for(int i = 0; i < 5; i++) {
            System.out.print(marks[i]+", ");
        }
    }
    public double getAverage() {
        double avg;
        int sum = 0;
        for(int i=0; i<5; i++) {
            sum+=marks[i];
        }
        return avg=(double)sum/5;
    }
    public void displayInfo() {
        System.out.println();
        System.out.println("Student ID: "+getStudentID());
        System.out.println("Student Name: "+getStudentName());
        System.out.print("Student marks: ");getMarks();
        System.out.println("Average  mark: "+getAverage());
    }
}

public class  StudentGradingSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("======== Student Grading System ========");
            System.out.println("----------------------------------------");
            System.out.println("> Select the choice you want from below <");
            System.out.println("1. Veiw all the student details.");
            System.out.println("2. View a student.");
            System.out.println("3. Edit student details.");
            System.out.println("4. Enter a Student.");
            System.out.println("5. Delete a Student.");
            System.out.println("6. Average marks list");
            System.out.println("7. Exit");
            int userInput = input.nextInt();
            switch(userInput) {
                case 1:

            }
        } while (false);
    }
}