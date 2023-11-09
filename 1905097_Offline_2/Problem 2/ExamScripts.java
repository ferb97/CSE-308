public class ExamScripts {

    private int examinerID;
    private int studentID;
    private int marks;

    public ExamScripts(int examinerID, int studentID, int marks) {
        this.examinerID = examinerID;
        this.studentID = studentID;
        this.marks = marks;
    }

    public int getExaminerID() {
        return examinerID;
    }

    public void setExaminerID(int examinerID) {
        this.examinerID = examinerID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
