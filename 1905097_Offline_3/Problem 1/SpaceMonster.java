public class SpaceMonster {

    private int id;
    private String name;

    public SpaceMonster(int id, String name) {
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

    public void poisoningCrewMates(){
        System.out.println("Space monster " + name + " is poisoning CrewMates");
    }

    public void damagingSpaceship(){
        System.out.println("Space monster " + name + " is damaging Spaceship");
    }
}
