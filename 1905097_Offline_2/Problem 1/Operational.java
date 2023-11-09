public class Operational implements State{

    private String name;

    public Operational(){
        name="Operational";
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
