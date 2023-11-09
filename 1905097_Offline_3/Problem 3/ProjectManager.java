import java.util.ArrayList;
import java.util.List;

public class ProjectManager implements Component{

    private String name;
    private String role;
    private String currentProject;
    private Company company;
    private List<Developer> superviseesList = new ArrayList<>();

    public ProjectManager(String name, String currentProject, Company company) {
        this.name = name;
        this.currentProject = currentProject;
        this.company = company;
        this.role = "Project Manager";
        company.addProject(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(String currentProject) {
        this.currentProject = currentProject;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public List<Developer> getSuperviseesList() {
        return superviseesList;
    }

    public void setSuperviseesList(List<Developer> superviseesList) {
        this.superviseesList = superviseesList;
    }

    public void addDeveloper(Developer developer){
        this.superviseesList.add(developer);
    }

    public void removeDeveloper(Developer developer){
        superviseesList.remove(developer);
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Current Project: " + currentProject);
        System.out.println("Number of Supervisees: " + superviseesList.size());
    }

    @Override
    public void showHierarchy(int space) {
        for(int i = 0; i < space; i++){
            System.out.print("\t");
        }

        System.out.println("- " + name + " (" + currentProject + ")");

        for(Component c: superviseesList){
            c.showHierarchy(space + 1);
        }
    }
}
