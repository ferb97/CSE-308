public class Developer implements Component{

    private String name;
    private String role;
    private ProjectManager currentProject;

    public Developer(String name, ProjectManager currentProject) {
        this.name = name;
        this.currentProject = currentProject;
        this.role = "Developer";
        currentProject.addDeveloper(this);
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

    public ProjectManager getCurrentProject() {
        return currentProject;
    }

    public void setCurrentProject(ProjectManager currentProject) {
        this.currentProject = currentProject;
    }

    @Override
    public void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Current Project: " + currentProject.getCurrentProject());
    }

    @Override
    public void showHierarchy(int space) {
        for(int i = 0; i < space; i++){
            System.out.print("\t");
        }

        System.out.println("- " + name);
    }
}
