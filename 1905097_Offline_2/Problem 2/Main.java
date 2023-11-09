import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter total students: ");
        int studentCount = scn.nextInt();
        System.out.print("Enter total examiners: ");
        int examinerCount = scn.nextInt();
        ExamController examController = new ExamController();

        for(int i = 0; i < examinerCount; i++){
            new Examiner(examController, i + 1);
        }

        for(int i = 0; i < studentCount; i++){
            new Student(examController, i + 1);
        }

        examController.createExamScriptsAndMarkList();

    }
}
