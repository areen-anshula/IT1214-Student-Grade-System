class Student {
    private String studentID;
    private String studentName;
    private int[] marks;
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
    public void getMarks() {
        for(int i = 0; i < 5; i++) {
            System.out.print(marks[i]+", ");
        }
    }
    public void displayInfo() {
        System.out.println();
        System.out.println("Student ID: "+getStudentID());
        System.out.println("Student Name: "+getStudentName());
        System.out.print("Student marks: ");getMarks();
    }
}

public class  StudentGradingSystem {
    public static void main(String[] args) {
        
    }
}