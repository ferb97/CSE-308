import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {;

        Scanner scn = new Scanner(System.in);
        List<Company> companyList = new ArrayList<>();
        List<ProjectManager> projectList = new ArrayList<>();
        List<Developer> developerList = new ArrayList<>();

        while(true){
            System.out.println();
            System.out.println("0 - Exit");
            System.out.println("1 - Add Company");
            System.out.println("2 - Add Project");
            System.out.println("3 - Add Developer");
            System.out.println("4 - Remove Company");
            System.out.println("5 - Remove Project");
            System.out.println("6 - Remove Developer");
            System.out.println("7 - Show Details");
            System.out.println("8 - Show Hierarchy");
            System.out.print("Enter an option: ");
            try {
                int option = scn.nextInt();
                if (option == 0) {
                    break;
                } else if (option == 1) {
                    System.out.println();
                    System.out.print("Enter Company Name: ");
                    scn.nextLine();
                    String companyName = scn.nextLine();
                    Company c = new Company(companyName);
                    companyList.add(c);
                } else if (option == 2) {
                    System.out.println();
                    System.out.println("1 - Add Project to existing company");
                    System.out.println("2 - Add Project in a new company");

                    while (true) {
                        System.out.print("Enter an option: ");

                        try {
                            int option1 = scn.nextInt();

                            if (option1 == 1) {
                                if(companyList.size() == 0){
                                    System.out.println("No company added");
                                }
                                else {
                                    for (int i = 0; i < companyList.size(); i++) {
                                        System.out.println((i + 1) + " - " + companyList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a company: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > companyList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                System.out.println();
                                                System.out.print("Enter Project Name: ");
                                                scn.nextLine();
                                                String projectName = scn.nextLine();
                                                System.out.print("Enter Project Manager Name: ");
                                                String projectManagerName = scn.nextLine();

                                                ProjectManager p = new ProjectManager(projectManagerName, projectName, companyList.get(option2 - 1));
                                                projectList.add(p);
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 2) {
                                System.out.println();
                                System.out.print("Enter Company Name: ");
                                scn.nextLine();
                                String companyName = scn.nextLine();
                                Company c = new Company(companyName);
                                companyList.add(c);

                                System.out.println();
                                System.out.print("Enter Project Name: ");
                                String projectName = scn.nextLine();
                                System.out.print("Enter Project Manager Name: ");
                                String projectManagerName = scn.nextLine();

                                ProjectManager p = new ProjectManager(projectManagerName, projectName, c);
                                projectList.add(p);
                                break;
                            } else {
                                System.out.println("Invalid input");
                            }
                        } catch (Exception e) {
                            scn.nextLine();
                            System.out.println("Invalid input");
                        }
                    }

                } else if (option == 3) {
                    System.out.println();
                    System.out.println("1 - Add Developer to existing company and existing project");
                    System.out.println("2 - Add Developer to existing company in a new project");
                    System.out.println("3 - Add Developer to a new company in a new project");

                    while (true) {
                        System.out.print("Enter an option: ");

                        try {
                            int option1 = scn.nextInt();

                            if (option1 == 1) {
                                if(projectList.size() == 0){
                                    System.out.println("No project added");
                                }

                                else {
                                    for (int i = 0; i < projectList.size(); i++) {
                                        System.out.println((i + 1) + " - " + projectList.get(i).getCurrentProject());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a project: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > projectList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                System.out.println();
                                                System.out.print("Enter Developer Name: ");
                                                scn.nextLine();
                                                String developerName = scn.nextLine();

                                                Developer d = new Developer(developerName, projectList.get(option2 - 1));
                                                developerList.add(d);
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 2) {
                                if(companyList.size() == 0){
                                    System.out.println("No company added");
                                }

                                else {
                                    for (int i = 0; i < companyList.size(); i++) {
                                        System.out.println((i + 1) + " - " + companyList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a company: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > companyList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                System.out.println();
                                                System.out.print("Enter Project Name: ");
                                                scn.nextLine();
                                                String projectName = scn.nextLine();
                                                System.out.print("Enter Project Manager Name: ");
                                                String projectManagerName = scn.nextLine();

                                                ProjectManager p = new ProjectManager(projectManagerName, projectName, companyList.get(option2 - 1));
                                                projectList.add(p);

                                                System.out.println();
                                                System.out.print("Enter Developer Name: ");
                                                String developerName = scn.nextLine();

                                                Developer d = new Developer(developerName, p);
                                                developerList.add(d);
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 3) {
                                System.out.println();
                                System.out.print("Enter Company Name: ");
                                scn.nextLine();
                                String companyName = scn.nextLine();
                                Company c = new Company(companyName);
                                companyList.add(c);

                                System.out.println();
                                System.out.print("Enter Project Name: ");
                                String projectName = scn.nextLine();
                                System.out.print("Enter Project Manager Name: ");
                                String projectManagerName = scn.nextLine();

                                ProjectManager p = new ProjectManager(projectManagerName, projectName, c);
                                projectList.add(p);

                                System.out.println();
                                System.out.print("Enter Developer Name: ");
                                String developerName = scn.nextLine();

                                Developer d = new Developer(developerName, p);
                                developerList.add(d);
                                break;
                            } else {
                                System.out.println("Invalid input");
                            }
                        } catch (Exception e) {
                            scn.nextLine();
                            System.out.println("Invalid input");
                        }
                    }
                } else if (option == 4) {
                    if(companyList.size() == 0){
                        System.out.println("No company added");
                    }
                    else {
                        for (int i = 0; i < companyList.size(); i++) {
                            System.out.println((i + 1) + " - " + companyList.get(i).getName());
                        }

                        while (true) {
                            System.out.println();
                            System.out.print("Select a company: ");
                            try {
                                int option2 = scn.nextInt();
                                if (option2 > companyList.size()) {
                                    System.out.println("Invalid input");
                                } else {
                                    Company c = companyList.get(option2 - 1);

                                    while (c.getProjectList().size() > 0) {
                                        ProjectManager p = c.getProjectList().get(0);

                                        while (p.getSuperviseesList().size() > 0) {
                                            Developer d = p.getSuperviseesList().get(0);
                                            p.removeDeveloper(d);
                                            developerList.remove(d);
                                            System.out.println("Developer " + d.getName() + " has been removed from " + p.getCurrentProject() + " project");
                                        }

                                        c.removeProject(p);
                                        projectList.remove(p);
                                        System.out.println("Project " + p.getCurrentProject() + " has been removed from " + c.getName() + " company");
                                    }

                                    companyList.remove(c);
                                    System.out.println("Company " + c.getName() + " has been removed");
                                    break;
                                }

                            } catch (Exception e) {
                                scn.nextLine();
                                System.out.println("Invalid input");
                                ;
                            }
                        }
                    }
                } else if (option == 5) {
                    if(projectList.size() == 0){
                        System.out.println("No project added");
                    }

                    else {
                        for (int i = 0; i < projectList.size(); i++) {
                            System.out.println((i + 1) + " - " + projectList.get(i).getName());
                        }

                        while (true) {
                            System.out.println();
                            System.out.print("Select a project: ");
                            try {
                                int option2 = scn.nextInt();
                                if (option2 > projectList.size()) {
                                    System.out.println("Invalid input");
                                } else {
                                    ProjectManager p = projectList.get(option2 - 1);
                                    while (p.getSuperviseesList().size() > 0) {
                                        Developer d = p.getSuperviseesList().get(0);
                                        p.removeDeveloper(d);
                                        developerList.remove(d);
                                        System.out.println("Developer " + d.getName() + " has been removed from " + p.getCurrentProject() + " project");
                                    }

                                    Company c = p.getCompany();
                                    c.removeProject(p);
                                    projectList.remove(p);
                                    System.out.println("Project " + p.getCurrentProject() + " has been removed from " + c.getName() + " company");
                                    break;
                                }

                            } catch (Exception e) {
                                scn.nextLine();
                                System.out.println("Invalid input");
                                ;
                            }
                        }
                    }
                } else if (option == 6) {
                    if(developerList.size() == 0){
                        System.out.println("No developer added");
                    }

                    else {
                        for (int i = 0; i < developerList.size(); i++) {
                            System.out.println((i + 1) + " - " + developerList.get(i).getName());
                        }

                        while (true) {
                            System.out.println();
                            System.out.print("Select a developer: ");
                            try {
                                int option2 = scn.nextInt();
                                if (option2 > developerList.size()) {
                                    System.out.println("Invalid input");
                                } else {
                                    Developer d = developerList.get(option2 - 1);
                                    ProjectManager p = d.getCurrentProject();
                                    p.removeDeveloper(d);
                                    developerList.remove(d);
                                    System.out.println("Developer " + d.getName() + " has been removed from " + p.getCurrentProject() + " project");
                                    break;
                                }

                            } catch (Exception e) {
                                scn.nextLine();
                                System.out.println("Invalid input");
                                ;
                            }
                        }
                    }
                } else if (option == 7) {
                    System.out.println();
                    System.out.println("1 - Show Company Details");
                    System.out.println("2 - Show Project Details");
                    System.out.println("3 - Show Developer Details");

                    while (true) {
                        System.out.print("Enter an option: ");

                        try {
                            int option1 = scn.nextInt();

                            if (option1 == 1) {
                                if(companyList.size() == 0){
                                    System.out.println("No company added");
                                }

                                else {
                                    for (int i = 0; i < companyList.size(); i++) {
                                        System.out.println((i + 1) + " - " + companyList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a company: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > companyList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                companyList.get(option2 - 1).showDetails();
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 2) {
                                if(projectList.size() == 0){
                                    System.out.println("No project added");
                                }

                                else {
                                    for (int i = 0; i < projectList.size(); i++) {
                                        System.out.println((i + 1) + " - " + projectList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a project: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > projectList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                projectList.get(option2 - 1).showDetails();
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 3) {
                                if(developerList.size() == 0){
                                    System.out.println("No developer added");
                                }

                                else {
                                    for (int i = 0; i < developerList.size(); i++) {
                                        System.out.println((i + 1) + " - " + developerList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a developer: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > developerList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                developerList.get(option2 - 1).showDetails();
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Invalid input");
                            }

                        } catch (Exception e) {
                            scn.nextLine();
                            System.out.println("Invalid input");
                            ;
                        }
                    }
                }
                else if (option == 8) {
                    System.out.println();
                    System.out.println("1 - Show Company Hierarchy");
                    System.out.println("2 - Show Project Hierarchy");
                    System.out.println("3 - Show Developer Hierarchy");

                    while (true) {
                        System.out.print("Enter an option: ");

                        try {
                            int option1 = scn.nextInt();

                            if (option1 == 1) {
                                if(companyList.size() == 0){
                                    System.out.println("No company added");
                                }

                                else {
                                    for (int i = 0; i < companyList.size(); i++) {
                                        System.out.println((i + 1) + " - " + companyList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a company: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > companyList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                companyList.get(option2 - 1).showHierarchy(0);
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 2) {
                                if(projectList.size() == 0){
                                    System.out.println("No project added");
                                }

                                else {
                                    for (int i = 0; i < projectList.size(); i++) {
                                        System.out.println((i + 1) + " - " + projectList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a project: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > projectList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                projectList.get(option2 - 1).showHierarchy(0);
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else if (option1 == 3) {
                                if(developerList.size() == 0){
                                    System.out.println("No developer added");
                                }

                                else {
                                    for (int i = 0; i < developerList.size(); i++) {
                                        System.out.println((i + 1) + " - " + developerList.get(i).getName());
                                    }

                                    while (true) {
                                        System.out.println();
                                        System.out.print("Select a developer: ");
                                        try {
                                            int option2 = scn.nextInt();
                                            if (option2 > developerList.size()) {
                                                System.out.println("Invalid input");
                                            } else {
                                                developerList.get(option2 - 1).showHierarchy(0);
                                                break;
                                            }

                                        } catch (Exception e) {
                                            scn.nextLine();
                                            System.out.println("Invalid input");
                                            ;
                                        }
                                    }
                                }
                                break;
                            } else {
                                System.out.println("Invalid input");
                            }

                        } catch (Exception e) {
                            scn.nextLine();
                            System.out.println("Invalid input");
                            ;
                        }
                    }
                }

                else{
                        System.out.println("Invalid input");
                    }
                } catch(Exception e){
                    scn.nextLine();
                    System.out.println("Invalid input");
                }
            }
        }
}
