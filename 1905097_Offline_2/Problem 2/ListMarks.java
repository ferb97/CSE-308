public class ListMarks {
    private int studentID;
    private int marks;

    public ListMarks(int studentID, int marks){
        this.studentID = studentID;
        this.marks = marks;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setMarks(int marks){
        this.marks = marks;
    }

    public int getMarks(){
        return this.marks;
    }
}
