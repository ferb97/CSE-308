public class CrewMate implements CrewMateInterface{

    private int id;
    private String name;

    public CrewMate(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void studyInterstellarObjects() {
        System.out.println("CrewMate " + name + " studying interstellar objects");
    }

    @Override
    public void doMaintenanceTasks() {
        System.out.println("CrewMate " + name + " doing maintenance task");
    }
}
