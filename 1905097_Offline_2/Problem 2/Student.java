import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Component{

    public Student(ExamController examController, int ID) {
        super(examController, ID);
        examController.getStudentList().add(this);
    }

    @Override
    public void receiveAndReexamine(ExamScripts examScripts, ListMarks listMarks) {
        System.out.println("Student ID: " + this.ID + " received marks, Marks: " + listMarks.getMarks());
        List<ExamScripts> examScriptsList = new ArrayList<>();
        List<ListMarks> listMarksList = new ArrayList<>();
        examScriptsList.add(examScripts);
        listMarksList.add(listMarks);
        Scanner scn = new Scanner(System.in);

        while(true){
            System.out.println("Do you want to re examine?y/n");
            System.out.print("Enter your answer: ");
            String str = scn.nextLine();
            if(str.equalsIgnoreCase("y")){
                examController.notify(this, examScriptsList, listMarksList, true);
                return;
            }

            else if(str.equalsIgnoreCase("n")){
                break;
            }

            else{
                System.out.println("Invalid input");
            }
        }
    }

    public void receive(ListMarks listMarks){
        System.out.println("Student ID: " + listMarks.getStudentID() + " has received his final marks: " + listMarks.getMarks());
        System.out.println();
    }

}
