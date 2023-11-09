import java.util.List;

interface Mediator {
    void notify(Component component, List<ExamScripts> examScripts, List<ListMarks> listMarks, boolean isRecheck);
}
