import java.util.ArrayList;
import java.util.List;

public class Company implements Component{

    private String name;
    private List<ProjectManager> projectList = new ArrayList<>();

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ProjectManager> getProjectList() {
        return projectList;
    }

    public void setProjectList(List<ProjectManager> projectList) {
        this.projectList = projectList;
    }

    public void addProject(ProjectManager projectManager){
        this.projectList.add(projectManager);
    }

    public void removeProject(ProjectManager projectManager){
        projectList.remove(projectManager);
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Running Projects: " + projectList.size());
    }

    @Override
    public void showHierarchy(int space) {
        for(int i = 0; i < space; i++){
            System.out.print("\t");
        }

        System.out.println("- " + name);

        for(Component c: projectList){
            c.showHierarchy(space + 1);
        }
    }
}
