public abstract class Component {

    protected ExamController examController;
    protected int ID;

    public Component(ExamController examController, int ID) {
        this.examController = examController;
        this.ID = ID;
    }

    public ExamController getExamController() {
        return examController;
    }

    public void setExamController(ExamController examController) {
        this.examController = examController;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public abstract void receiveAndReexamine(ExamScripts examScripts, ListMarks listMarks);

}
