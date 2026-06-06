class Student {
    private String studentID;
    private String studentName;
    private int marks;
    public Student(String studentID, String studentName, int marks) {
        this.studentID=studentID;
        this.studentName=studentName;
        this.marks=marks;
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
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
        this.marks=marks;
    }

    public void displayInfo() {
        System.out.println();
        System.out.println("Student ID: "+getStudentID());
        System.out.println("Student Name: "+getStudentName());
        System.out.println("Student marks: "+getMarks());
    }
}

public class  StudentGradingSystem {
    public static void main(String[] args) {
        
    }
}