import java.util.ArrayList;
import java.util.List;

public class ExamController implements Mediator{

    private List<Student> studentList = new ArrayList<>();
    private List<Examiner> examinerList = new ArrayList<>();
    private List<ExamScripts> examScripts = new ArrayList<>();
    private List<ListMarks> listMarks = new ArrayList<>();

    public ExamController(){

    }
    public void setExamScripts(List<ExamScripts> examScripts){
        this.examScripts = examScripts;
    }

    public List<ExamScripts> getExamScripts(){
        return this.examScripts;
    }

    public void setListMarks(List<ListMarks> listMarks){
        this.listMarks = listMarks;
    }

    public List<ListMarks> getListMarks(){
        return this.listMarks;
    }

    public void setExaminerList(List<Examiner> examinerList){
        this.examinerList = examinerList;
    }

    public List<Examiner> getExaminerList(){
        return this.examinerList;
    }

    public void setStudentList(List<Student> studentList){
        this.studentList = studentList;
    }

    public List<Student> getStudentList(){
        return this.studentList;
    }

    public void createExamScriptsAndMarkList(){
        examinerList.get(0).createMarksList();
    }


    @Override
    public void notify(Component component, List<ExamScripts> examScripts, List<ListMarks> listMarks, boolean isRecheck) {

        if(component instanceof Student){
            System.out.println("Student ID: " + component.getID() + " has requested for recheck");
            ListMarks listMarks1 = listMarks.get(0);
            ExamScripts examScripts1 = this.examScripts.get(component.getID() - 1);
            Examiner examiner = this.examinerList.get(examScripts1.getExaminerID() - 1);
            examiner.receiveAndReexamine(examScripts1, listMarks1);
        }

        else if(component instanceof Examiner && isRecheck){
            System.out.println("Exam controller has received after rechecking from Teacher ID: " + examScripts.get(0).getExaminerID());
            if(examScripts.get(0).getMarks() == listMarks.get(0).getMarks()){
                System.out.println("Marks of Student ID: " + examScripts.get(0).getStudentID() + " has not changed");
            }
            else{
                System.out.println("Marks of Student ID: " + examScripts.get(0).getStudentID() + " has changed");
                System.out.println("Student ID: " + examScripts.get(0).getStudentID() + ", Previous Marks: " + listMarks.get(0).getMarks() + ", Corrected Marks: " + examScripts.get(0).getMarks());
                listMarks.get(0).setMarks(examScripts.get(0).getMarks());
            }

            ListMarks listMarks1 = listMarks.get(0);
            studentList.get(listMarks1.getStudentID() - 1).receive(listMarks1);
        }

        else if(component instanceof Examiner && !isRecheck){
            System.out.println("Marks before Scrutinizing");
            System.out.println("Exam Script Marks: ");
            for(ExamScripts examScripts1: examScripts){
                System.out.println("Student ID: " + examScripts1.getStudentID() + ", ScriptMarks: " + examScripts1.getMarks());
            }

            System.out.println("Mark Sheets: ");
            for(ListMarks listMarks1: listMarks){
                System.out.println("Student ID: " + listMarks1.getStudentID() + ", Marks: " + listMarks1.getMarks());
            }

            System.out.println("List of Mistakes: ");
            for(int i = 0; i < examScripts.size(); i++){
                if(examScripts.get(i).getMarks() != listMarks.get(i).getMarks()){
                    System.out.println("Student ID: " + examScripts.get(i).getStudentID() + ", Previous Marks: " + listMarks.get(i).getMarks()
                    + ", Corrected Marks: " + examScripts.get(i).getMarks());
                    listMarks.get(i).setMarks(examScripts.get(i).getMarks());
                }
            }

            System.out.println("Marks after Scrutinizing: ");
            System.out.println("Exam Script Marks: ");
            for(ExamScripts examScripts1: examScripts){
                System.out.println("Student ID: " + examScripts1.getStudentID() + ", ScriptMarks: " + examScripts1.getMarks());
            }

            System.out.println("Mark Sheets: ");
            for(ListMarks listMarks1: listMarks){
                System.out.println("Student ID: " + listMarks1.getStudentID() + ", Marks: " + listMarks1.getMarks());
            }

            setExamScripts(examScripts);
            setListMarks(listMarks);

            for(int i = 0; i < studentList.size(); i++){
                studentList.get(i).receiveAndReexamine(null, listMarks.get(i));
            }
        }


    }
}
