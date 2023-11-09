import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner extends Component{
    public Examiner(ExamController examController, int examinerID){
        super(examController, examinerID);
        examController.getExaminerList().add(this);
    }

    @Override
    public void receiveAndReexamine(ExamScripts examScripts, ListMarks listMarks) {
        System.out.println("Teacher ID: " + getID() + " is rechecking the script of Student ID: " + examScripts.getStudentID());
        Random random = new Random();
        int marks = examScripts.getMarks();
        int change = random.nextInt(3);
        if(change == 1){
            marks += 5;
        }
        else if(change == 2){
            marks -= 5;
        }
        examScripts.setMarks(marks);
        List<ExamScripts> examScriptsList = new ArrayList<>();
        List<ListMarks> listMarksList = new ArrayList<>();
        examScriptsList.add(examScripts);
        listMarksList.add(listMarks);
        examController.notify(this, examScriptsList, listMarksList, true);
    }

    public void createMarksList(){
        int studentCount = getExamController().getStudentList().size();
        int examinerCount = getExamController().getExaminerList().size();

        Random random = new Random();
        List<ExamScripts> examScripts = new ArrayList<>();
        List<ListMarks> listMarks = new ArrayList<>();
        int sureMistake = random.nextInt(studentCount);

        for(int i = 0; i < studentCount; i++){
            int marks = random.nextInt(20) + 60;
            int examinerID = random.nextInt(examinerCount) + 1;
            examScripts.add(new ExamScripts(examinerID, i + 1, marks));

            int change = random.nextInt(2);
            if(i == sureMistake){
                listMarks.add(new ListMarks(i + 1, marks - 3));
            }
            else if(change == 1){
                listMarks.add(new ListMarks(i + 1, marks + 2));
            }
            else{
                listMarks.add(new ListMarks(i + 1, marks));
            }

        }
        System.out.println("ExamScripts and List of Marks sent to exam controller office");
        examController.notify(this, examScripts, listMarks, false);
    }


}
